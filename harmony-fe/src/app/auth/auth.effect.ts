import { Injectable } from '@angular/core';
import { Actions, createEffect, ofType } from '@ngrx/effects';
import { mergeMap, map, catchError, tap, switchMap } from 'rxjs/operators'

import { ActivatedRoute, Router } from '@angular/router';
import { AuthService } from './auth.service'
import { Credential } from '../user/credential.model';
import { appHttpErrorHandler, decreaseLoaders } from '../app.action'
import { AUTHENTICATE, authenticateSucess } from './auth.action';

@Injectable()
export class AuthEffect {

    authenticate$ = createEffect(() => this.actions$.pipe(
        ofType(AUTHENTICATE),
        mergeMap((action: { payload: { credential: Credential } }) =>
            this.authService.authenticate(action.payload.credential).pipe(
                tap(() => {
                    let urlToReturn = this.route.snapshot.queryParams['returnTo'];
                    this.router.navigate([urlToReturn || '/app/harmonic-field'])
                }),
                switchMap((response) =>
                    [
                        authenticateSucess({
                            payload: {
                                authorizationTokenPair: {
                                    authorization: response.headers.get('Authorization'),
                                    refreshAuthorization: response.headers.get('Authorization')
                                },
                                identifier: response.body.credentialId
                            }
                        }),
                        decreaseLoaders()
                    ]
                ),
                catchError(appHttpErrorHandler)
            )
        )
    ))


    constructor(
        private route: ActivatedRoute,
        private router: Router,
        private authService: AuthService,
        private actions$: Actions
    ) { }
}