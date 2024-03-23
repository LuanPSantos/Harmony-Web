import { createSelector } from "@ngrx/store";
import AppState from './app.state'

export const select = (state: AppState) => state;

export const selectErrorMessage = createSelector(
    select,
    (state: AppState) => {
        return state.appFeatureKey.errorData
    }
);

export const selectRunningAPICallsCount = createSelector(
    select,
    (state: AppState) => {
        return state.appFeatureKey.api.runningAPICallsCount
    }
)
