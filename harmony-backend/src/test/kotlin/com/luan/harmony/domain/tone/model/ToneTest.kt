package com.luan.harmony.domain.tone.model

import com.luan.harmony.domain.chord.model.Chord
import com.luan.harmony.domain.chord.model.Chord.Name.C_MAJOR
import com.luan.harmony.domain.chord.model.Chord.Name.C_MINOR
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position.StringName.*
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField
import com.luan.harmony.domain.tone.harmonicfiled.NaturalMajor
import com.luan.harmony.domain.tone.harmonicfiled.NaturalMinor
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ToneTest {

    @Test
    fun `Should be equals by object`() {
        val tone = getTone()

        assertTrue(tone == tone)
        assertTrue(tone.hashCode() == tone.hashCode())
    }

    @Test
    fun `Should be equals`() {
        val tone1 = getTone()
        val tone2 = getTone()

        assertTrue(tone1 == tone2)
        assertEquals(tone1.harmonicFields.size, tone2.harmonicFields.size)
        assertEquals(tone1.value, tone2.value)
    }

    @Test
    fun `Should not be equals by class type`() {
        val tone = getTone()

        assertFalse(tone.equals(String()))
    }

    @Test
    fun `Should not be equals to null`() {
        val tone = getTone()

        assertFalse(tone.equals(null))
    }

    @Test
    fun `Should not be equals by value`() {
        val tone1 = getTone()
        val tone2 = getTone(D)

        assertFalse(tone1 == tone2)
    }

    @Test
    fun `Should not be equals by harmonic fields amount`() {
        val tone1: Tone = TempTone(C, listOf(getHarmonicFieldMajor()))
        val tone2: Tone = TempTone(C, listOf(getHarmonicFieldMajor(), getHarmonicFieldMinor()))

        assertFalse(tone1 == tone2)
    }

    @Test
    fun `Should not be equals by harmonic field chords`() {
        val tone1: Tone = TempTone(C, listOf(getHarmonicFieldMajor()))
        val tone2: Tone = TempTone(C, listOf(getHarmonicFieldMinor()))

        assertFalse(tone1 == tone2)
    }

    @Test
    fun `Should return object as string`() {
        val tone = getTone()

        val harmonicFieldsString = tone.harmonicFields.map { "\n\t\t${it}" }

        assertTrue(tone.toString().contains("value=${tone.value}"))
        assertTrue(tone.toString().contains("harmonicFields=$harmonicFieldsString"))
    }

    private fun getTone(value: Note.Value = C): Tone {

        return TempTone(value, listOf(getHarmonicFieldMajor()))
    }

    class TempTone(
            value: Note.Value,
            harmonicFields: List<HarmonicField> = listOf())
        : Tone(value, harmonicFields) {}

    private fun getHarmonicFieldMajor(): HarmonicField {
        val chordTriad = Triad(
                C_MAJOR,
                0,
                Fundamental(C, Position(3, A5)),
                Third(E, Position(2, D4)),
                Fifth(G, Position(0, G3)),
                listOf(
                        ChordNote(C, Position(1, B2)),
                        ChordNote(E, Position(0, E1))
                )
        )

        val chordTetrad = Tetrad(
                Chord.Name.C_MAJOR_7M,
                0,
                Fundamental(C, Position(3, A5)),
                Third(E, Position(2, D4)),
                Fifth(G, Position(0, G3)),
                Seventh(B, Position(0, B2)),
                listOf(

                        ChordNote(E, Position(0, E1))
                )
        )

        return NaturalMajor(
                listOf(chordTetrad),
                listOf(chordTriad))
    }

    private fun getHarmonicFieldMinor(): HarmonicField {
        val chordTriad = Triad(
                C_MINOR,
                0,
                Fundamental(C, Position(3, A5)),
                Third(D_FLAT, Position(1, D4)),
                Fifth(G, Position(0, G3)),
                listOf(
                        ChordNote(C, Position(1, B2)),
                        ChordNote(E, Position(0, E1))
                )
        )

        val chordTetrad = Tetrad(
                Chord.Name.C_MINOR_7M,
                0,
                Fundamental(C, Position(3, A5)),
                Third(D_FLAT, Position(1, D4)),
                Fifth(G, Position(0, G3)),
                Seventh(B, Position(0, B2)),
                listOf(

                        ChordNote(E, Position(0, E1))
                )
        )

        return NaturalMinor(
                listOf(chordTetrad),
                listOf(chordTriad))
    }
}