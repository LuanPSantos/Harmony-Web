import { createReducer, on } from '@ngrx/store';
import {
    hideChordDiagram, 
    showChordDiagram
} from './chord.action';
 
export const initialState = {
    chordDiagramVisible: {
        isVisible: false,
        index: -1
    }
};
 
const _chordReducer = createReducer(
    initialState,
    on(showChordDiagram, (state, { payload }) => ({ ...state, chordDiagramVisible: { isVisible: true, index: payload.index} })),
    on(hideChordDiagram, (state) => ({ ...state, chordDiagramVisible: { isVisible: false, index: -1 } }))
);
 
export function chordReducer(state, action) {
  return _chordReducer(state, action);
}

export const chordFeatureKey = 'chordFeatureKey';