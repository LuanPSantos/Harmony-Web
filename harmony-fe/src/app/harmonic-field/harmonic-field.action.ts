import { createAction, props } from '@ngrx/store';
import { HarmonicField } from './harmonic-field.model'

export const LOAD_HARMONIC_FIELD = "[Harmonic Field Module] Load Harmonic Field"
export const LOAD_HARMONIC_FIELD_SUCCESS = "[Harmonic Field Module] Load Harmonic Field Success"
export const LOAD_HARMONIC_FIELD_FAIL = "[Harmonic Field Module] Load Harmonic Field Fail"

export const loadHarmonicField = createAction(
    LOAD_HARMONIC_FIELD,
    props<{ payload: { selectedHarmonicField: String, selectedTone: String }}>()
)

export const loadHarmonicFieldSuccess = createAction(
    LOAD_HARMONIC_FIELD_SUCCESS,
    props<{ payload: { harmonicField: HarmonicField }}>()
)