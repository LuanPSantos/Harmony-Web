package com.luan.harmony.domain.chord.model

import com.luan.harmony.domain.chord.model.Chord.Name.E_MAJOR_7
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position.StringName.*
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class TriadTest {

    @Test
    fun `Should be equals by object`() {
        val chord = Triad(
                E_MAJOR_7,
                0,
                Fundamental(E, Position(0, E6)),
                Third(G_SHARP, Position(1, G3)),
                Fifth(B, Position(2, A5)),
                listOf(ChordNote(E, Position(2, D4)))
        )

        assertTrue(chord == chord)
        assertTrue(chord.hashCode() == chord.hashCode())
    }

    @Test
    fun `Should be equals`() {
        val chord1 = Triad(
                E_MAJOR_7,
                0,
                Fundamental(E, Position(0, E6)),
                Third(G_SHARP, Position(1, G3)),
                Fifth(B, Position(2, A5)),
                listOf(ChordNote(E, Position(2, D4)))
        ).withGrade(HarmonicField.Grade.FIRST)

        val chord2 = Triad(
                E_MAJOR_7,
                0,
                Fundamental(E, Position(0, E6)),
                Third(G_SHARP, Position(1, G3)),
                Fifth(B, Position(2, A5)),
                listOf(ChordNote(E, Position(2, D4)))
        ).withGrade(HarmonicField.Grade.FIRST)

        assertTrue(chord1 == chord2)
        assertEquals(chord1.grade, chord2.grade)
        assertEquals(chord1.shapes.size, chord2.shapes.size)
    }

    @Test
    fun `Should not be equals by class type`() {
        val chord1 = Triad(
                E_MAJOR_7,
                0,
                Fundamental(E, Position(0, E6)),
                Third(G_SHARP, Position(1, G3)),
                Fifth(B, Position(2, A5))
        )

        Assertions.assertFalse(chord1.equals(String()))
    }

    @Test
    fun `Should not be equals to null`() {
        val chord1 = Triad(
                E_MAJOR_7,
                0,
                Fundamental(E, Position(0, E6)),
                Third(G_SHARP, Position(1, G3)),
                Fifth(B, Position(2, A5))
        )

        Assertions.assertFalse(chord1.equals(null))
    }
}