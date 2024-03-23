package com.luan.harmony.domain.chord.model.shape

import com.luan.harmony.domain.chord.model.note.ChordNote
import com.luan.harmony.domain.chord.model.note.Note.Value.E
import com.luan.harmony.domain.chord.model.note.Position
import com.luan.harmony.domain.chord.model.note.Position.StringName.E6
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AlternativeShapeTest {

    @Test
    fun `Should be equals by object` () {
        val shape = AlternativeShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        assertTrue(shape == shape)
        assertTrue(shape.hashCode() == shape.hashCode())
    }

    @Test
    fun `Should be equals` () {
        val shape1 = AlternativeShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        val shape2 = AlternativeShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        assertTrue(shape1 == shape2)
        assertEquals(shape1.name, shape2.name)
        assertEquals(shape1.startFret, shape2.startFret)
        assertEquals(shape1.notes.size, shape2.notes.size)
    }

    @Test
    fun `Should have the default value` () {
        val shape = AlternativeShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        assertEquals(Shape.Name.ALTERNATIVE, shape.name)
    }

    @Test
    fun `Should not be equal by class type` () {
        val shape = AlternativeShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        assertFalse(shape.equals(String()))
    }

    @Test
    fun `Should not be equal to null` () {
        val shape = AlternativeShape(0)
                .addNote(ChordNote(E, Position(0, E6)))

        assertFalse(shape.equals(null))
    }
}