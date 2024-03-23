package com.luan.harmony.domain.tone.service

import com.luan.harmony.domain.chord.model.note.Note
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField
import com.luan.harmony.domain.tone.model.Tone
import com.luan.harmony.domain.tone.repository.ToneRepository
import org.springframework.stereotype.Service

@Service
class ToneService(
        private val toneRepository: ToneRepository
) {

    fun findByToneValue(value: Note.Value): Tone {
        return this.toneRepository.findByToneValue(value)
    }

    fun findHarmonicFieldByTypeAndTone(type: HarmonicField.Type, value: Note.Value) : HarmonicField {
        return this.toneRepository.findHarmonicFieldByTypeAndTone(type, value)
    }
}