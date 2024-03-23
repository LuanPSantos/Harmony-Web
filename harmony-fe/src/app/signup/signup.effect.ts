import { Injectable } from '@angular/core';
import { Actions, createEffect, ofType } from '@ngrx/effects';
import { mergeMap, map, catchError, tap, switchMap } from 'rxjs/operators'
import * as fromSignupActions from './signup.action'
import { User } from '../user/user.model';
import { UserService } from '../user/user.service';
import { Router } from '@angular/router';
import { appHttpErrorHandler, decreaseLoaders } from '../app.action';
import { Credential } from '../user/credential.model';

@Injectable()
export class SignupEffect {

    createUser$ = createEffect(() => this.actions$.pipe(
        ofType(fromSignupActions.CREATE_USER),
        mergeMap((action: { payload: { user: User, credential: Credential } }) =>
            this.userService.createUser(action.payload.user, action.payload.credential).pipe(
                tap(() => this.router.navigate(['/app/auth'])),
                switchMap(() => [
                    fromSignupActions.createUserSuccess(),
                    decreaseLoaders()
                ]),
                catchError(appHttpErrorHandler)
            )
        )
    ))


    constructor(
        private router: Router,
        private userService: UserService,
        private actions$: Actions
    ) { }
}