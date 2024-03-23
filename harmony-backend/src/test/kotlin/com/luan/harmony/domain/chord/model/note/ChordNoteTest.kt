package com.luan.harmony.domain.chord.model.note

import com.luan.harmony.domain.chord.model.note.Note.Value.D
import com.luan.harmony.domain.chord.model.note.Note.Value.E
import com.luan.harmony.domain.chord.model.note.Position.StringName.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class ChordNoteTest {

    @Test
    fun `Should be equals by object`() {
        val note1 = ChordNote(E, Position(0, E1))

        assertTrue(note1.hashCode() == note1.hashCode())
        assertTrue(note1 == note1)
    }

    @Test
    fun `Should be equals`() {
        val note1 = ChordNote(E, Position(0, E1))
        val note2 = ChordNote(E, Position(0, E1))

        assertTrue(note1 == note2)
    }

    @Test
    fun `Should not be equals by class type`() {
        val note1 = ChordNote(E, Position(0, E1))

        assertFalse(note1.equals(String()))
    }

    @Test
    fun `Should not be equals by to null`() {
        val note1 = ChordNote(E, Position(0, E1))

        assertFalse(note1.equals(null))
    }

    @Test
    fun `Should not be equals by tile`() {
        val note1 = ChordNote(E, Position(0, E1))
        val note2 = ChordNote(D, Position(0, D4), Title.FUNDAMENTAL)

        assertFalse(note1 == note2)
    }

    @Test
    fun `Should not be equals by value`() {
        val note1 = ChordNote(E, Position(0, E1))
        val note2 = ChordNote(D, Position(0, D4))

        assertFalse(note1 == note2)
    }

    @Test
    fun `Should not be equals by position`() {
        val note1 = ChordNote(E, Position(0, E1))
        val note2 = ChordNote(E, Position(0, E6))

        assertFalse(note1 == note2)
    }

    @Test
    fun `Should have the default values`() {
        val position = Position(0, E1)
        val note = ChordNote(E, position)

        assertEquals(E.symbol, note.value)
        assertEquals(position, note.position)
        assertEquals(Title.UNNAMED, note.title)
    }

    @Test
    fun `Should return object as string`() {
        assertTrue(ChordNote(E, Position(0, E1)).toString().contains("value=E"))
        assertTrue(ChordNote(E, Position(0, E1)).toString().contains("position=${Position(0, E1)}"))
        assertTrue(ChordNote(E, Position(0, E1)).toString().contains("title=${Title.UNNAMED}"))
    }
}