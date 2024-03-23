import { createReducer, on } from '@ngrx/store';
import { ProfileFeatureState } from '../app.state';
import {
    findUserByIdSuccess,
    findCredentialByIdSuccess,
    updateCredentialSuccess
} from './profile.action';

export const initialState: ProfileFeatureState = {
    user: {
        id: null,
        name: null
    },
    credential: {
        id: null,
        email: null,
        rawPassword: null
    }
};

const _profileReducer = createReducer(
    initialState,
    on(findUserByIdSuccess, (state, { payload }) => (
        {
            ...state,
            user: {
                ...payload.user
            }
        })),
    on(findCredentialByIdSuccess, (state, { payload }) => (
        {
            ...state,
            credential: {
                ...payload.credential
            }
        })),
    on(updateCredentialSuccess, (state, { payload }) => (
        {
            ...state,
            credential: {
                ...state.credential,
                email: payload.credential.email,
                rawPassword: null
            }
        }))
);

export function profileReducer(state, action) {
    return _profileReducer(state, action);
}

export const profileFeatureKey = 'profileFeatureKey';