import { createReducer, on } from '@ngrx/store';
import { AppFeatureState } from '../app.state';

export const initialState: AppFeatureState = {
    authorizationTokenPair: {
        authorization: null,
        refreshAuthorization: null 
    },
    credentialId: null,
    errorData: {
        errors: [],
        statusCode: null
    },
    api: {
        runningAPICallsCount: 0
    }
};

const _authReducer = createReducer(
    initialState,
);

export function authReducer(state, action) {
    return _authReducer(state, action);
}

export const authFeatureKey = 'authFeatureKey';