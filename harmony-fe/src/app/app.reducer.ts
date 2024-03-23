import { state } from '@angular/animations';
import { APP_ID } from '@angular/core';
import { createReducer, on } from '@ngrx/store';
import { appFail, clearStore, decreaseLoaders, increaseLoaders } from './app.action';
import { AppFeatureState } from './app.state';
import { authenticateSucess } from './auth/auth.action';

export const initialState: AppFeatureState = {
    authorizationTokenPair: {
        authorization: null,
        refreshAuthorization: null
    },
    errorData: {
        errors: [],
        statusCode: null
    },
    identifier: null,
    api: {
        runningAPICallsCount: 0
    }
};

const _appReducer = createReducer(
    initialState,
    on(authenticateSucess, (state, { payload }) => ({ ...state, authorizationTokenPair: { ...payload.authorizationTokenPair }, identifier: payload.identifier })),
    on(appFail, (state, { payload }) => ({ ...state, errorData: { ...payload.errorData } })),
    on(clearStore, () => ({ ...initialState })),
    on(increaseLoaders, (state) => ({ ...state, api: { runningAPICallsCount: state.api.runningAPICallsCount + 1 } })),
    on(decreaseLoaders, (state) => ({ ...state, api: { runningAPICallsCount: decrease(state.api.runningAPICallsCount) } }))
);

export function appReducer(state, action) {
    return _appReducer(state, action);
}

function decrease(num) {
    if(num - 1 < 0) {
        return 0;
    }

    return num - 1;
}

export const appFeatureKey = 'appFeatureKey';
