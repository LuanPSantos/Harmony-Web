import { Injectable } from '@angular/core';
import { Actions, createEffect, ofType } from '@ngrx/effects';
import { mergeMap, map, catchError, tap, switchMap } from 'rxjs/operators'

import { ActivatedRoute, Router } from '@angular/router';
import { AuthService } from '../auth/auth.service';
import { Credential } from '../user/credential.model';
import { appHttpErrorHandler, decreaseLoaders } from '../app.action'
import { REQUEST_PASSWORD_RECOVERY } from './password-recovery.action';

@Injectable()
export class PasswordRecoveryEffect {

    requestPasswordRecovery$ = createEffect(() => this.actions$.pipe(
        ofType(REQUEST_PASSWORD_RECOVERY),
        mergeMap((action: { payload: { email: string } }) =>
            this.authService.requestPasswordRecovery(action.payload.email).pipe(
                switchMap((response) =>
                    [
                        decreaseLoaders()
                    ]
                ),
                catchError(appHttpErrorHandler)
            )
        )
    ))


    constructor(
        private authService: AuthService,
        private actions$: Actions
    ) { }
}