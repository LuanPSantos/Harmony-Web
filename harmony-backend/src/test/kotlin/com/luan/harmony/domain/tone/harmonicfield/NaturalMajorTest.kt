package com.luan.harmony.domain.tone.harmonicfield

import com.luan.harmony.domain.chord.model.Chord.Name.C_MAJOR
import com.luan.harmony.domain.chord.model.Chord.Name.C_MAJOR_7M
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.repository.prototype.ChordPrototype
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Grade.FIRST
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Type.MELODIC_MINOR
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Type.NATURAL_MAJOR
import com.luan.harmony.domain.tone.harmonicfiled.NaturalMajor
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NaturalMajorTest {

    private val chordPrototype = ChordPrototype()

    @Test
    fun `Should be equal by object`() {
        val harmonicField = NaturalMajor(
                listOf(chordPrototype.get(C_MAJOR_7M).withGrade(FIRST) as Tetrad),
                listOf(chordPrototype.get(C_MAJOR).withGrade(FIRST) as Triad))

        assertTrue(harmonicField == harmonicField)
        assertTrue(harmonicField.hashCode() == harmonicField.hashCode())
    }

    @Test
    fun `Should be equal`() {
        val harmonicField1 = NaturalMajor(
                listOf(chordPrototype.get(C_MAJOR_7M).withGrade(FIRST) as Tetrad),
                listOf(chordPrototype.get(C_MAJOR).withGrade(FIRST) as Triad))

        val harmonicField2 = NaturalMajor(
                listOf(chordPrototype.get(C_MAJOR_7M).withGrade(FIRST) as Tetrad),
                listOf(chordPrototype.get(C_MAJOR).withGrade(FIRST) as Triad))

        assertTrue(harmonicField1 == harmonicField2)
        assertEquals(harmonicField1.tetrads.size, harmonicField2.tetrads.size)
        assertEquals(harmonicField1.triads.size, harmonicField2.triads.size)
        assertEquals(harmonicField1.type, harmonicField2.type)
    }

    @Test
    fun `Should be not equal by type`() {
        val harmonicField1 = NaturalMajor(
                listOf(chordPrototype.get(C_MAJOR_7M).withGrade(FIRST) as Tetrad),
                listOf(chordPrototype.get(C_MAJOR).withGrade(FIRST) as Triad))

        val harmonicField2 = object : HarmonicField(
                MELODIC_MINOR,
                listOf(chordPrototype.get(C_MAJOR_7M).withGrade(FIRST) as Tetrad),
                listOf(chordPrototype.get(C_MAJOR).withGrade(FIRST) as Triad)) {}

        assertFalse(harmonicField1.equals(harmonicField2))
    }

    @Test
    fun `Should return object as string`() {
        val harmonicField = NaturalMajor(
                listOf(chordPrototype.get(C_MAJOR_7M).withGrade(FIRST) as Tetrad),
                listOf(chordPrototype.get(C_MAJOR).withGrade(FIRST) as Triad))

        val tetradsString = harmonicField.tetrads.map { "\n\t\t\t\t${it}" }
        val triadsString = harmonicField.triads.map { "\n\t\t\t\t${it}" }

        assertTrue(harmonicField.toString().contains("type=NATURAL_MAJOR"))
        assertTrue(harmonicField.toString().contains("tetrads=${tetradsString}"))
        assertTrue(harmonicField.toString().contains("triads=${triadsString}"))
    }

    @Test
    fun `Should have the default values`() {
        val harmonicField = NaturalMajor(
                listOf(chordPrototype.get(C_MAJOR_7M).withGrade(FIRST) as Tetrad),
                listOf(chordPrototype.get(C_MAJOR).withGrade(FIRST) as Triad))

        assertEquals(NATURAL_MAJOR, harmonicField.type)
    }
}