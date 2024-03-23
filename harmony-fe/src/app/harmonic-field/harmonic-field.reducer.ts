import { createReducer, on } from '@ngrx/store';
import { appFail } from '../app.action';
import { 
    loadHarmonicFieldSuccess
} from './harmonic-field.action';
 
export const initialState = {
    harmonicField: {
        type: "NATURAL_MAJOR",
        tetrads: [],
        triads: []
    }
};
 
const _harmonicFieldReducer = createReducer(
    initialState,
    on(loadHarmonicFieldSuccess, (state, { payload }) => ({ ...state, harmonicField: payload.harmonicField as any }))
);
 
export function harmonicFieldReducer(state, action) {
  return _harmonicFieldReducer(state, action);
}

export const harmonicFieldFeatureKey = 'harmonicFieldFeatureKey';