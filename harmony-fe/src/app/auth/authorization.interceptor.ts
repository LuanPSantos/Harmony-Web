import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Store } from "@ngrx/store";
import { Observable, of } from "rxjs";
import { first, flatMap, tap } from "rxjs/operators";
import { selectAuthorizationTokenPair } from "../auth/auth.selector";
import AppState from "../app.state";


@Injectable()
export default class AuthorizationInterceptor implements HttpInterceptor {
    constructor(private store: Store<AppState>) { }

    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
        return this.store.select(selectAuthorizationTokenPair).pipe(
            first(),
            flatMap(token => {
                const authReq = (!!token.authorization && !!token.refreshAuthorization) ? req.clone({
                    setHeaders: { Authorization: token.authorization },
                }) : req;
                return next.handle(authReq);
            }),
        );
    }
}