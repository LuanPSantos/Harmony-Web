import { createAction, props } from '@ngrx/store';
import { Credential } from '../user/credential.model';
import { User } from '../user/user.model';

export const FIND_USER_BY_ID = "[Profile Module] Find User By Id";
export const FIND_USER_BY_ID_SUCCESS = "[Profile Module] Find User By Id Success"
export const FIND_USER_BY_ID_FAIL = "[Profile Module] Find User By Id Fail"

export const UPDATE_USER = "[Profile Module] Update User"
export const UPDATE_USER_SUCCESS = "[Profile Module] Update User Success"
export const UPDATE_USER_FAIL = "[Profile Module] Update User Fail"

export const FIND_CREDENTIAL_BY_ID = "[Profile Module] Find Credential By Id";
export const FIND_CREDENTIAL_BY_ID_SUCCESS = "[Profile Module] Find Credential By Id Success"
export const FIND_CREDENTIAL_BY_ID_FAIL = "[Profile Module] Find Credential By Id Fail"

export const UPDATE_CREDENTIAL = "[Profile Module] Update Credential"
export const UPDATE_CREDENTIAL_SUCCESS = "[Profile Module] Update Credential Success"
export const UPDATE_CREDENTIAL_FAIL = "[Profile Module] Update Credential Fail"

export const findUserById = createAction(
    FIND_USER_BY_ID,
    props<{ payload: { id: string } }>()
);

export const findUserByIdSuccess = createAction(
    FIND_USER_BY_ID_SUCCESS,
    props<{ payload: { user: User } }>()
)

export const updateUser = createAction(
    UPDATE_USER,
    props<{ payload: { user: User } }>()
)

export const updateUserSuccess = createAction(
    UPDATE_USER_SUCCESS
)

export const findCredentialById = createAction(
    FIND_CREDENTIAL_BY_ID,
    props<{ payload: { id: string } }>()
)

export const findCredentialByIdSuccess = createAction(
    FIND_CREDENTIAL_BY_ID_SUCCESS,
    props<{ payload: { credential: Credential } }>()
)

export const updateCredential = createAction(
    UPDATE_CREDENTIAL,
    props<{ payload: { credential: Credential, oldPassword: string } }>()
)

export const updateCredentialSuccess = createAction(
    UPDATE_CREDENTIAL_SUCCESS,
    props<{ payload: { credential: Credential } }>()
)