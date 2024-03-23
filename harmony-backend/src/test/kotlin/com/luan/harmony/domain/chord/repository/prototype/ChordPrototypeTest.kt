package com.luan.harmony.domain.chord.repository.prototype

import com.luan.harmony.domain.chord.model.Chord.Name.C_MAJOR_7M
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position.StringName.*
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.InjectMockKs
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


class ChordPrototypeTest {

    @InjectMockKs
    lateinit var chordPrototype: ChordPrototype

    @BeforeEach
    fun setUp() = MockKAnnotations.init(this)

    @Test
    fun `Should get a Chord`() {

        val chord1 = chordPrototype.get(C_MAJOR_7M)

        val chord2 = Tetrad(
                C_MAJOR_7M,
                0,
                Fundamental(C, Position(3, A5)),
                Third(E, Position(2, D4)),
                Fifth(G, Position(0, G3)),
                Seventh(B, Position(0, B2)),
                listOf(ChordNote(E, Position(0, E1)))
        )

        assertEquals(chord1, chord2)
    }
}