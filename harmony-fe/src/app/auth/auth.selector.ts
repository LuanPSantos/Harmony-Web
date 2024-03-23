import { createSelector } from "@ngrx/store";
import AppState from '../app.state'

export const select = (state: AppState) => state;

export const selectAuthorizationTokenPair = createSelector(
    select,
    (state: AppState) => {
        return state.appFeatureKey.authorizationTokenPair
    }
);

export const selectIdentifier = createSelector(
    select,
    (state: AppState) => {
        return state.appFeatureKey.identifier
    }
);