package com.luan.harmony.domain.tone.harmonicfield

import com.luan.harmony.domain.chord.model.Chord.Name.C_MINOR
import com.luan.harmony.domain.chord.model.Chord.Name.C_MINOR_7
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.repository.prototype.ChordPrototype
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Grade.FIRST
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Type.HARMONIC_MINOR
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicMinor
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HarmonicMinorTest {

    private val chordPrototype = ChordPrototype()

    @Test
    fun `Should have the default values`() {
        val harmonicField = HarmonicMinor(
                listOf(chordPrototype.get(C_MINOR_7).withGrade(FIRST) as Tetrad),
                listOf(chordPrototype.get(C_MINOR).withGrade(FIRST) as Triad))

        Assertions.assertEquals(HARMONIC_MINOR, harmonicField.type)


    }
}