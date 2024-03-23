package com.luan.harmony.domain.tone.service

import com.luan.harmony.domain.chord.model.Chord.Name.C_MAJOR
import com.luan.harmony.domain.chord.model.Chord.Name.C_MAJOR_7M
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position.StringName.*
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Type.NATURAL_MAJOR
import com.luan.harmony.domain.tone.harmonicfiled.NaturalMajor
import com.luan.harmony.domain.tone.model.Tone
import com.luan.harmony.domain.tone.repository.ToneRepository
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class ToneServiceTest {

    @MockK
    lateinit var toneRepository: ToneRepository

    @InjectMockKs
    lateinit var toneService: ToneService

    @BeforeEach
    fun setUp() = MockKAnnotations.init(this)

    @Test
    fun `Should find tone by value`() {
        val returned = getTone()
        every { toneRepository.findByToneValue(eq(C)) } returns returned

        val tone = toneService.findByToneValue(C)

        assertEquals(returned, tone)

    }

    @Test
    fun `Should find harmonic filed by tone and type`() {
        val returned = getHarmonicField()

        every { toneRepository.findHarmonicFieldByTypeAndTone(eq(NATURAL_MAJOR), eq(C)) } returns returned

        val harmonicField = toneService.findHarmonicFieldByTypeAndTone(NATURAL_MAJOR, C)

        assertEquals(returned, harmonicField)
    }

    private fun getTone(): Tone {

        return object : Tone(
                C,
                listOf(getHarmonicField())
        ) {}
    }

    private fun getHarmonicField(): HarmonicField {
        val chordTriad = Triad(
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

        val chordTetrad = Tetrad(
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

        return NaturalMajor(
                listOf(chordTetrad),
                listOf(chordTriad))
    }
}