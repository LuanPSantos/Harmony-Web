package com.luan.harmony.domain.tone.repository

import com.luan.harmony.domain.chord.model.Chord
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.C
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Type.NATURAL_MAJOR
import com.luan.harmony.domain.tone.harmonicfiled.NaturalMajor
import com.luan.harmony.domain.tone.model.CTone
import com.luan.harmony.domain.tone.model.Tone
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.SpyK
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ToneRepositoryTest {

    @SpyK
    var tones: MutableList<Tone> = mutableListOf()

    @MockK
    lateinit var cTone: CTone

    @InjectMockKs
    lateinit var toneRepository: ToneRepository

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)

        tones.add(cTone)
    }

    @Test
    fun `Should find tone by value`() {

        every { cTone.value } returns C
        every { cTone.harmonicFields } returns listOf(getHarmonicField())

        val tone = toneRepository.findByToneValue(C)

        assertEquals(C, tone.value)
        assertEquals(1, tone.harmonicFields.size)
    }

    @Test
    fun `Should throw exception when tone was not found`() {

        tones.clear()

        val exception = assertThrows<Exception> { toneRepository.findByToneValue(C) }

        assertEquals("Tom não encontrado", exception.message)
    }

    @Test
    fun `Should find harmonic field by type and tone`() {
        every { cTone.value } returns C
        every { cTone.harmonicFields } returns listOf(getHarmonicField())

        val harmonicField = toneRepository.findHarmonicFieldByTypeAndTone(NATURAL_MAJOR, C)

        assertEquals(NATURAL_MAJOR, harmonicField.type)
    }

    @Test
    fun `Should throw exception when harmonic field was not found`() {
        every { cTone.value } returns C
        every { cTone.harmonicFields } returns listOf()

        val exception = assertThrows<Exception> { toneRepository.findHarmonicFieldByTypeAndTone(NATURAL_MAJOR, C) }


        assertEquals("Campo harmonico não encontrado", exception.message)
    }

    private fun getHarmonicField(): HarmonicField {
        val chordTriad = Triad(
                Chord.Name.C_MAJOR,
                0,
                Fundamental(C, Position(3, Position.StringName.A5)),
                Third(Note.Value.E, Position(2, Position.StringName.D4)),
                Fifth(Note.Value.G, Position(0, Position.StringName.G3)),
                listOf(
                        ChordNote(C, Position(1, Position.StringName.B2)),
                        ChordNote(Note.Value.E, Position(0, Position.StringName.E1))
                )
        )

        val chordTetrad = Tetrad(
                Chord.Name.C_MAJOR_7M,
                0,
                Fundamental(C, Position(3, Position.StringName.A5)),
                Third(Note.Value.E, Position(2, Position.StringName.D4)),
                Fifth(Note.Value.G, Position(0, Position.StringName.G3)),
                Seventh(Note.Value.B, Position(0, Position.StringName.B2)),
                listOf(

                        ChordNote(Note.Value.E, Position(0, Position.StringName.E1))
                )
        )

        return NaturalMajor(
                listOf(chordTetrad),
                listOf(chordTriad))
    }
}