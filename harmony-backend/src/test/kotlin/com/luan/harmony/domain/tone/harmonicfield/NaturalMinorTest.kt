package com.luan.harmony.domain.tone.harmonicfield

import com.luan.harmony.domain.chord.model.Chord.Name.C_MINOR
import com.luan.harmony.domain.chord.model.Chord.Name.C_MINOR_7
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.repository.prototype.ChordPrototype
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Grade.FIRST
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Type.NATURAL_MINOR
import com.luan.harmony.domain.tone.harmonicfiled.NaturalMinor
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NaturalMinorTest {

    private val chordPrototype = ChordPrototype()

    @Test
    fun `Should have the default values`() {
        val harmonicField = NaturalMinor(
                listOf(chordPrototype.get(C_MINOR_7).withGrade(FIRST) as Tetrad),
                listOf(chordPrototype.get(C_MINOR).withGrade(FIRST) as Triad))

        Assertions.assertEquals(NATURAL_MINOR, harmonicField.type)
    }
}