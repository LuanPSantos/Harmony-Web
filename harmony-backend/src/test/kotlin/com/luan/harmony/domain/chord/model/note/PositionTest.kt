package com.luan.harmony.domain.chord.model.note

import com.luan.harmony.domain.chord.model.note.Position.StringName.D4
import com.luan.harmony.domain.chord.model.note.Position.StringName.E1
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PositionTest {

    @Test
    fun `Should be equals by object`() {
        val position1 = Position(0, E1)

        assertTrue(position1 == position1)
        assertTrue(position1.hashCode() == position1.hashCode())
    }

    @Test
    fun `Should be equals`() {
        val position1 = Position(0, E1)
        val position2 = Position(0, E1)

        assertTrue(position1 == position2)
        assertEquals(position1.fret, position2.fret)
        assertEquals(position1.stringName, position2.stringName)
    }

    @Test
    fun `Should not be equals by class type`() {
        val position1 = Position(0, E1)

        assertFalse(position1.equals(String()))
    }

    @Test
    fun `Should not be equals to null`() {
        val position1 = Position(0, E1)

        assertFalse(position1.equals(null))
    }

    @Test
    fun `Should not be equals by fret`() {
        val position1 = Position(0, E1)
        val position2 = Position(1, E1)

        assertFalse(position1 == position2)
    }

    @Test
    fun `Should not be equals by string`() {
        val position1 = Position(0, E1)
        val position2 = Position(0, D4)

        assertFalse(position1 == position2)
    }
}