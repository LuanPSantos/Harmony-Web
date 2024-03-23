import { Injectable } from "@angular/core";
import { Actions, createEffect, ofType } from '@ngrx/effects';
import { catchError, filter, map, mergeMap, switchMap } from "rxjs/operators";
import { User } from "../user/user.model";
import { UserService } from '../user/user.service';
import {
    FIND_USER_BY_ID,
    findUserByIdSuccess,
    UPDATE_USER,
    updateUserSuccess,
    FIND_CREDENTIAL_BY_ID,
    findCredentialByIdSuccess,
    UPDATE_CREDENTIAL,
    updateCredentialSuccess
} from './profile.action';
import { appHttpErrorHandler, decreaseLoaders } from "../app.action";
import { CredentialService } from "../user/credential.service";
import { Credential } from "../user/credential.model";

@Injectable()
export class ProfileEffect {

    findUserByid$ = createEffect(() => this.actions$.pipe(
        ofType(FIND_USER_BY_ID),
        filter((action: { payload: { id: string } }) => !!action.payload.id),
        mergeMap((action: { payload: { id: string } }) =>
            this.userService.findUserById(action.payload.id).pipe(
                switchMap((user) => [
                    findUserByIdSuccess({ payload: { user } }),
                    // TODO ou passar isso para dentro do serviço?
                    decreaseLoaders()
                ]),
                catchError(appHttpErrorHandler)
            )
        )
    ))

    updateUser$ = createEffect(() => this.actions$.pipe(
        ofType(UPDATE_USER),
        mergeMap((action: { payload: { user: User } }) =>
            this.userService.updateUser(action.payload.user).pipe(
                switchMap(() => [
                    updateUserSuccess(),
                    decreaseLoaders()
                ]),
                catchError(appHttpErrorHandler)
            )
        )
    ))

    findCredentialByid$ = createEffect(() => this.actions$.pipe(
        ofType(FIND_CREDENTIAL_BY_ID),
        filter((action: { payload: { id: string } }) => !!action.payload.id),
        mergeMap((action: { payload: { id: string } }) =>
            this.credentialService.findCredentialById(action.payload.id).pipe(
                switchMap((credential) => [
                    findCredentialByIdSuccess({ payload: { credential } }),
                    // TODO ou passar isso para dentro do serviço?
                    decreaseLoaders()
                ]),
                catchError(appHttpErrorHandler)
            )
        )
    ))

    updateCredential$ = createEffect(() => this.actions$.pipe(
        ofType(UPDATE_CREDENTIAL),
        mergeMap((action: { payload: { credential: Credential, oldPassword: string } }) =>
            this.credentialService.updateCredential(action.payload.credential, action.payload.oldPassword).pipe(
                switchMap((credential) => [
                    updateCredentialSuccess({ payload: { credential } }),
                    decreaseLoaders()
                ]),
                catchError(appHttpErrorHandler)
            )
        )
    ))

    constructor(
        private userService: UserService,
        private credentialService: CredentialService,
        private actions$: Actions
    ) { }
}