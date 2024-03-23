import { createFeatureSelector, createSelector } from '@ngrx/store';
import AppState, { HarmonicFieldFeatureState } from '../app.state';
import { harmonicFieldFeatureKey } from './harmonic-field.reducer';

export const selectFeature = createFeatureSelector<AppState, HarmonicFieldFeatureState>(harmonicFieldFeatureKey);

export const selectTriads = createSelector(
    selectFeature,
    (state: HarmonicFieldFeatureState) => {
        return state.harmonicField.triads
    }
)
export const selectTetrads = createSelector(
    selectFeature,
    (state: HarmonicFieldFeatureState) => {
        return state.harmonicField.tetrads
    }
)

