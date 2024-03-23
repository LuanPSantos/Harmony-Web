import { createReducer, on } from '@ngrx/store';
import {
    
} from './signup.action';

export const initialState = {
    credential: {
        id: null
    }
};

const _signupReducer = createReducer(
    initialState
);

export function signupReducer(state, action) {
    return _signupReducer(state, action);
}

export const signupFeatureKey = 'signupFeatureKey';