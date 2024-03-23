package com.luan.harmony.domain.chord.model.shape

import com.luan.harmony.domain.chord.model.note.ChordNote
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position
import com.luan.harmony.domain.chord.model.note.Position.StringName.*
import com.luan.harmony.domain.chord.model.note.Title
import com.luan.harmony.domain.chord.model.shape.Shape.Name.ALTERNATIVE
import com.luan.harmony.domain.chord.model.shape.Shape.Name.DEFAULT
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DefaultShapeTest {

    @Test
    fun `Should be equals by object` () {
        val shape = DefaultShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        assertTrue(shape == shape)
        assertTrue(shape.hashCode() == shape.hashCode())
    }

    @Test
    fun `Should be equals` () {
        val shape1 = DefaultShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        val shape2 = DefaultShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        assertTrue(shape1 == shape2)
        assertEquals(shape1.name, shape2.name)
        assertEquals(shape1.startFret, shape2.startFret)
        assertEquals(shape1.notes.size, shape2.notes.size)
        assertEquals(shape1.isBarre, shape2.isBarre)
    }

    @Test
    fun `Should have the default value` () {
        val shape = DefaultShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        assertEquals(DEFAULT, shape.name)
        assertEquals(false, shape.isBarre)
    }

    @Test
    fun `Should not be equal by class type` () {
        val shape = DefaultShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        assertFalse(shape.equals(String()))
    }

    @Test
    fun `Should not be equal to null` () {
        val shape = DefaultShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        assertFalse(shape.equals(null))
    }

    @Test
    fun `Should not be equal by notes amount` () {
        val shape1 = DefaultShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        val shape2 = DefaultShape(0)
                .addNote(ChordNote(E, Position(0, E6)))
                .addNote(ChordNote(E, Position(0, E6)))

        assertFalse(shape1 == shape2)
    }

    @Test
    fun `Should not be equal by notes` () {
        val shape1 = DefaultShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        val shape2 = DefaultShape(0)
                .addNote(ChordNote(B, Position(0, B2)))

        assertFalse(shape1 == shape2)
    }

    @Test
    fun `Should not be equals by startFret` () {
        val shape1 = DefaultShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        val shape2 = DefaultShape(1)
                .addNote(ChordNote(E, Position(0, E6)))

        assertFalse(shape1 == shape2)
    }

    @Test
    fun `Should return object as string`() {
        val shape = DefaultShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        val notesString = mutableListOf(ChordNote(E, Position(0, E6))).map { "\n\t\t\t\t\t\t\t\t${it}" }

        assertTrue(shape.toString().contains("name=${shape.name}"))
        assertTrue(shape.toString().contains("notes=$notesString"))
        assertTrue(shape.toString().contains("startFret=${shape.startFret}"))
    }

    @Test
    fun `Should not add more then 6 chords`() {
        val shape = DefaultShape(0)
                .addNote(ChordNote(E, Position(0, E1)))
                .addNote(ChordNote(B, Position(0, B2)))
                .addNote(ChordNote(G, Position(0, G3)))
                .addNote(ChordNote(D, Position(0, D4)))
                .addNote(ChordNote(A, Position(0, A5)))
                .addNote(ChordNote(E, Position(0, E6)))
                .addNote(ChordNote(E, Position(0, E6)))

        assertEquals(6, shape.notes.size)
    }
}