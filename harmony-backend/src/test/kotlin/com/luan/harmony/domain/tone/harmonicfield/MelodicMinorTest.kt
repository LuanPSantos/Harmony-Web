package com.luan.harmony.domain.tone.harmonicfield

import com.luan.harmony.domain.chord.model.Chord.Name.C_MINOR
import com.luan.harmony.domain.chord.model.Chord.Name.C_MINOR_7
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.repository.prototype.ChordPrototype
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Grade.FIRST
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Type.MELODIC_MINOR
import com.luan.harmony.domain.tone.harmonicfiled.MelodicMinor
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MelodicMinorTest {

    private val chordPrototype = ChordPrototype()

    @Test
    fun `Should have the default values`() {
        val harmonicField = MelodicMinor(
                listOf(chordPrototype.get(C_MINOR_7).withGrade(FIRST) as Tetrad),
                listOf(chordPrototype.get(C_MINOR).withGrade(FIRST) as Triad))

        Assertions.assertEquals(MELODIC_MINOR, harmonicField.type)
    }
}