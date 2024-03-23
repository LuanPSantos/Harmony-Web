import { Injectable } from '@angular/core';
import { CanActivate, Router, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import AppState from '../app.state';
import { selectAuthorizationTokenPair } from './auth.selector';

@Injectable()
export class AuthGuardService implements CanActivate {

    constructor(private store: Store<AppState>, private router: Router) {

    }

    canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<boolean> {
        return this.store.select(selectAuthorizationTokenPair).pipe(
            map((pair) => {
                if (pair.authorization != null && pair.refreshAuthorization != null) {
                    return true;
                } else {
                    this.router.navigate(['/app/auth'], {
                        queryParams: {
                            returnTo: state.url
                        }
                    })
                }
            })
        )
    }
}