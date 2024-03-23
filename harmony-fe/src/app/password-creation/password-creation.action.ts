import { createAction, props } from "@ngrx/store"

export const CREATE_PASSWORD = "[Password Creation Module] Create Password"
export const CREATE_PASSWORD_SUCCESS = "[Password Creation Module] Create Password Success"

export const createPassword = createAction(
    CREATE_PASSWORD,
    props<{ payload: { token: string, password: string } }>()
)