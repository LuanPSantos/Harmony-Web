package com.luan.harmony.domain.chord.model.note

import com.luan.harmony.domain.chord.model.note.Note.Value.E
import com.luan.harmony.domain.chord.model.note.Position.StringName.E1
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ThirdTest {

    @Test
    fun `Should have the default values`() {
        val third = Third(E, Position(0, E1))

        assertEquals(E.symbol, third.value)
        assertEquals(Title.THIRD, third.title)
        assertEquals(Position(0, E1), third.position)
    }
}