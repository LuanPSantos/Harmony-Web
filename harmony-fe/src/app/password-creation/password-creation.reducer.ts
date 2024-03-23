import { createReducer, on } from '@ngrx/store';

export const initialState = {

};

const _passwordCreationReducer = createReducer(
    initialState,
);

export function passwordCreationReducer(state, action) {
    return _passwordCreationReducer(state, action);
}

export const passwordCreationFeatureKey = 'passwordCreationFeatureKey';