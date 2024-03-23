package com.luan.harmony.domain.chord.repository

import com.luan.harmony.domain.chord.model.Chord
import com.luan.harmony.domain.chord.repository.prototype.ChordPrototype
import org.springframework.stereotype.Repository

@Repository
class ChordRepository(
        private val chordPrototype: ChordPrototype
) {

    fun findByName(name: Chord.Name): Chord {
        return chordPrototype.get(name)
    }
}