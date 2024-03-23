package com.luan.harmony.domain.tone.repository

import com.luan.harmony.domain.chord.model.note.Note.Value
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Type
import com.luan.harmony.domain.tone.model.Tone
import org.springframework.stereotype.Repository

@Repository
class ToneRepository(
        private val tones: List<Tone>
) {

    fun findByToneValue(value: Value): Tone {
        return tones
                .find { tone -> tone.value == value } ?: throw Exception("Tom não encontrado")
    }

    fun findHarmonicFieldByTypeAndTone(type: Type, value: Value): HarmonicField {
        return findByToneValue(value).harmonicFields
                .find { harmonicField -> harmonicField.type == type } ?: error("Campo harmonico não encontrado")
    }
}