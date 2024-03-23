import { createFeatureSelector, createSelector } from '@ngrx/store';
import AppState, { ProfileFeatureState } from '../app.state';
import { profileFeatureKey } from './profile.reducer';

export const selectFeature = createFeatureSelector<AppState, ProfileFeatureState>(profileFeatureKey);

export const selectUser = createSelector(
    selectFeature,
    (state: ProfileFeatureState) => {
        return state.user
    }
)

export const selectCredential = createSelector(
    selectFeature,
    (state: ProfileFeatureState) => {
        return state.credential
    }
)