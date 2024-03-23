package com.luan.harmony.domain.chord.repository

import com.luan.harmony.domain.chord.model.Chord
import com.luan.harmony.domain.chord.model.Chord.Name.C_MAJOR_7M
import com.luan.harmony.domain.chord.model.Chord.Name.C_MINOR_7M
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position.StringName.*
import com.luan.harmony.domain.chord.repository.prototype.ChordPrototype
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ChordRepositoryTest {

    @MockK
    lateinit var chordPrototype: ChordPrototype

    @InjectMockKs
    lateinit var chordRepository: ChordRepository

    @BeforeEach
    fun setUp() = MockKAnnotations.init(this)

    @Test
    fun `Should get chord by name`() {
        every { chordPrototype.get(eq(C_MAJOR_7M)) } returns getChord()

        val chord = chordRepository.findByName(C_MAJOR_7M)

        assertEquals(getChord(), chord)
    }

    private fun getChord(): Chord {
        return Tetrad(
                C_MAJOR_7M,
                0,
                Fundamental(C, Position(3, A5)),
                Third(E, Position(2, D4)),
                Fifth(G, Position(0, G3)),
                Seventh(B, Position(0, B2)),
                listOf(

                        ChordNote(E, Position(0, E1))
                )
        )
    }
}