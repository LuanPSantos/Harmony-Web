import { createAction, props } from "@ngrx/store"
import { Credential } from "../user/credential.model"

export const AUTHENTICATE = "[Auth Module] Authenticate"
export const AUTHENTICATE_SUCCESS = "[Auth Module] Authenticate Success"
export const AUTHENTICATE_FAIL = "[Auth Module] Authenticate Fail"

export const authenticate = createAction(
    AUTHENTICATE,
    props<{ payload: { credential: Credential } }>()
)

export const authenticateSucess = createAction(
    AUTHENTICATE_SUCCESS,
    props<{
        payload: {
            authorizationTokenPair: {
                authorization: string,
                refreshAuthorization: string
            },
            identifier: string
        }
    }>()
)
