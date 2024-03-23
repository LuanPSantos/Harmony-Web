import { createAction, props } from '@ngrx/store';

export const SHOW_CHORD_DIAGRAM = "[Harmonic Field Module] Show Chord Diagram"
export const HIDE_CHORD_DIAGRAM = "[Harmonic Field Module] Hide Chord Diagram"


export const showChordDiagram = createAction(
    SHOW_CHORD_DIAGRAM,
    props<{ payload: { index: number }}>()
)

export const hideChordDiagram = createAction(
    HIDE_CHORD_DIAGRAM
)