package com.luan.harmony.domain.tone.harmonicfiled

import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Type.HARMONIC_MINOR

class HarmonicMinor private constructor(
        type: Type,
        tetrads: List<Tetrad>,
        triads: List<Triad>
) : HarmonicField(type, tetrads, triads) {

    constructor(
            tetrads: List<Tetrad>,
            triads: List<Triad>
    ) : this(HARMONIC_MINOR, tetrads, triads)
}