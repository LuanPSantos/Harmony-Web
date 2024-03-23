package com.luan.harmony.domain.chord.model

import com.luan.harmony.domain.chord.model.note.ChordNote
import com.luan.harmony.domain.chord.model.note.Fifth
import com.luan.harmony.domain.chord.model.note.Fundamental
import com.luan.harmony.domain.chord.model.note.Note.Value.B
import com.luan.harmony.domain.chord.model.note.Note.Value.E
import com.luan.harmony.domain.chord.model.note.Position
import com.luan.harmony.domain.chord.model.note.Position.StringName.*
import com.luan.harmony.domain.chord.model.shape.AlternativeShape
import com.luan.harmony.domain.chord.model.shape.DefaultShape
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Grade.FIRST
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Grade.SECOND
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PowerChordTest {

    @Test
    fun `Should be equals by object`() {
        val chord = PowerChord(
                "E5",
                0,
                Fundamental(E, Position(0, E6)),
                Fifth(B, Position(2, A5)),
                listOf(ChordNote(E, Position(2, D4)))
        )

        assertTrue(chord == chord)
        assertTrue(chord.hashCode() == chord.hashCode())
    }

    @Test
    fun `Should be equals`() {
        val chord1 = PowerChord(
                "E5",
                0,
                Fundamental(E, Position(0, E6)),
                Fifth(B, Position(2, A5)),
                listOf(ChordNote(E, Position(2, D4)))
        ).withGrade(FIRST)

        val chord2 = PowerChord(
                "E5",
                0,
                Fundamental(E, Position(0, E6)),
                Fifth(B, Position(2, A5)),
                listOf(ChordNote(E, Position(2, D4)))
        ).withGrade(FIRST)

        assertTrue(chord1 == chord2)
        assertEquals(chord1.symbol, chord2.symbol)
        assertEquals(chord1.grade, chord2.grade)
        assertEquals(chord1.shapes.size, chord2.shapes.size)
    }

    @Test
    fun `Should not be equals by class type`() {
        val chord1 = PowerChord(
                "E5",
                0,
                Fundamental(E, Position(0, E6)),
                Fifth(B, Position(2, A5))
        )

        assertFalse(chord1.equals(String()))
    }

    @Test
    fun `Should not be equals to null`() {
        val chord1 = PowerChord(
                "E5",
                0,
                Fundamental(E, Position(0, E6)),
                Fifth(B, Position(2, A5))
        )

        assertFalse(chord1.equals(null))
    }

    @Test
    fun `Should not be equals by grade`() {
        val chord1 = PowerChord(
                "E5",
                0,
                Fundamental(E, Position(0, E6)),
                Fifth(B, Position(2, A5)),
                listOf(ChordNote(E, Position(2, D4)))
        ).withGrade(FIRST)

        val chord2 = PowerChord(
                "E5",
                0,
                Fundamental(E, Position(0, E6)),
                Fifth(B, Position(2, A5)),
                listOf(ChordNote(E, Position(2, D4)))
        ).withGrade(SECOND)

        assertFalse(chord1 == chord2)
    }

    @Test
    fun `Should not be equals by shape amount`() {
        val chord1 = PowerChord(
                "E5",
                0,
                Fundamental(E, Position(0, E6)),
                Fifth(B, Position(2, A5)),
                listOf(ChordNote(E, Position(2, D4)))
        )

        chord1.addShape(AlternativeShape(7)
                .addNote(Fundamental(E, Position(7, A5)))
                .addNote(Fifth(B, Position(9, D4)))
                .addNote(ChordNote(E, Position(9, G3))))

        val chord2 = PowerChord(
                "E5",
                0,
                Fundamental(E, Position(0, E6)),
                Fifth(B, Position(2, A5)),
                listOf(ChordNote(E, Position(2, D4)))
        )

        assertFalse(chord1 == chord2)
    }

    @Test
    fun `Should not be equals by shape`() {
        val chord1 = PowerChord(
                "E5",
                0,
                Fundamental(E, Position(7, A5)),
                Fifth(B, Position(9, D4)),
                listOf(ChordNote(E, Position(9, G3)))
        )

        val chord2 = PowerChord(
                "E5",
                0,
                Fundamental(E, Position(0, E6)),
                Fifth(B, Position(2, A5)),
                listOf(ChordNote(E, Position(2, D4)))
        )

        assertFalse(chord1 == chord2)
    }

    @Test
    fun `Should not be equals by symbol`() {
        val chord1 = PowerChord(
                "E",
                0,
                Fundamental(E, Position(0, E6)),
                Fifth(B, Position(2, A5)),
                listOf(ChordNote(E, Position(2, D4)))
        )

        val chord2 = PowerChord(
                "E5",
                0,
                Fundamental(E, Position(0, E6)),
                Fifth(B, Position(2, A5)),
                listOf(ChordNote(E, Position(2, D4)))
        )

        assertFalse(chord1 == chord2)
    }

    @Test
    fun `Should clone the chord`() {
        val chord1 = PowerChord(
                "E5",
                7,
                Fundamental(E, Position(7, A5)),
                Fifth(B, Position(9, D4)),
                listOf(ChordNote(E, Position(9, G3)))
        )

        val chord2 = chord1.clone()

        assertEquals(chord1, chord2)
    }

    @Test
    fun `Should return object as string`() {
        val chord = PowerChord(
                "E5",
                7,
                Fundamental(E, Position(7, A5)),
                Fifth(B, Position(9, D4)),
                listOf(ChordNote(E, Position(9, G3)))
        ).withGrade(FIRST)

        print(chord)

        val shapesString = mutableListOf(DefaultShape(7)
                .addNote(Fundamental(E, Position(7, A5)))
                .addNote(Fifth(B, Position(9, D4)))
                .addNote(ChordNote(E, Position(9, G3)))).map { "\n\t\t\t\t\t\t${it}" }

        assertTrue(chord.toString().contains("grade='I'"))
        assertTrue(chord.toString().contains("shapes=$shapesString"))
    }


}