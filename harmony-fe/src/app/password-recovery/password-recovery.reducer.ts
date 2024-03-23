import { createReducer, on } from '@ngrx/store';

export const initialState = {

};

const _passwordRecoveryReducer = createReducer(
    initialState,
);

export function passwordRecoveryReducer(state, action) {
    return _passwordRecoveryReducer(state, action);
}

export const passwordRecoveryFeatureKey = 'passwordRecoveryFeatureKey';