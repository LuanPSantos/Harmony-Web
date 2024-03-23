export interface FeatureState {
    chordFeatureKey: {
        chordDiagramVisible: {
            isVisible: false,
            symbolRef: null
        }
    }
}

export const selectChordDiagramVisibility = (state: FeatureState) => {
    return state.chordFeatureKey.chordDiagramVisible
}