package com.luan.harmony.domain.chord.service

import com.luan.harmony.domain.chord.model.Chord.Name.C_MAJOR
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position.StringName.*
import com.luan.harmony.domain.chord.repository.ChordRepository
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Grade.FIFTH
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ChordServiceTest {

    @MockK
    lateinit var chordRepository: ChordRepository

    @InjectMockKs
    lateinit var chordService: ChordService

    @BeforeEach
    fun setUp() = MockKAnnotations.init(this)

    @Test
    fun `Should get chord by name`() {
        val chord = Triad(
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

        every { chordRepository.findByName(eq(C_MAJOR)) } returns chord

        val cMajorChord = chordService.findByNameWithGrade(C_MAJOR, FIFTH)

        assertEquals(chord.symbol, cMajorChord.symbol)
        assertEquals(chord.shapes.size, cMajorChord.shapes.size)
        assertEquals(FIFTH.value, cMajorChord.grade)
    }
}