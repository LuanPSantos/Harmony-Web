import { createAction, props } from '@ngrx/store';
import { Credential } from '../user/credential.model';
import { User } from '../user/user.model'

export const CREATE_USER = "[Signup Module] Create User"
export const CREATE_USER_SUCCESS = "[Signup Module] Create User Success"
export const CREATE_USER_FAIL = "[Signup Module] Create User Fail"


export const createUser = createAction(
    CREATE_USER,
    props<{ payload: { user: User, credential: Credential }}>()
)

export const createUserSuccess = createAction(
    CREATE_USER_SUCCESS
)
