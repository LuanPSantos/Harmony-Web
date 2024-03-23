package com.luan.harmony.domain.chord.repository.prototype

import com.luan.harmony.domain.chord.model.Chord
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Grade
import org.springframework.stereotype.Component

@Component
class ChordPrototype private constructor(
        private val chords: MutableMap<Chord.Name, Chord>
) {

    constructor() : this(mutableMapOf()) {
        this.loadChords()
    }

    fun get(chord: Chord.Name): Chord {
        return chords
                .getValue(chord)
                .clone()
    }

    private fun loadChords() {
        this.chords.putAll(CPrototype().loadChords())
        this.chords.putAll(DPrototype().loadChords())
        this.chords.putAll(EPrototype().loadChords())
        this.chords.putAll(FPrototype().loadChords())
        this.chords.putAll(GPrototype().loadChords())
        this.chords.putAll(APrototype().loadChords())
        this.chords.putAll(BPrototype().loadChords())
    }
}