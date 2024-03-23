import { createAction, props } from "@ngrx/store"
import { Credential } from "../user/credential.model"

export const REQUEST_PASSWORD_RECOVERY = "[Password Recovery Module] Request Password Recovery"
export const REQUEST_PASSWORD_RECOVERY_SUCCESS = "[Password Recovery Module] Request Password Recovery Success"

export const requestPasswordRecovery = createAction(
    REQUEST_PASSWORD_RECOVERY,
    props<{ payload: { email: string } }>()
)

