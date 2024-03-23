import { Injectable } from '@angular/core';
import { Actions, createEffect, ofType } from '@ngrx/effects';
import { mergeMap, map, catchError, tap, switchMap } from 'rxjs/operators'

import { ActivatedRoute, Router } from '@angular/router';
import { AuthService } from '../auth/auth.service';
import { Credential } from '../user/credential.model';
import { appHttpErrorHandler, decreaseLoaders } from '../app.action'
import { CREATE_PASSWORD } from './password-creation.action';

@Injectable()
export class PasswordCreationEffect {

    createPassword$ = createEffect(() => this.actions$.pipe(
        ofType(CREATE_PASSWORD),
        mergeMap((action: { payload: { token: string, password: string } }) =>
            this.authService.createPassword(action.payload.token, action.payload.password).pipe(
                switchMap((response) =>
                    [
                        decreaseLoaders(),
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