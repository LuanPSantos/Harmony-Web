package com.luan.harmony.domain.tone.model

import com.luan.harmony.domain.chord.model.note.Note.Value.E
import com.luan.harmony.domain.tone.harmonicfiled.factory.EHarmonicFieldsFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ETone private constructor(
        @Autowired
        factory: EHarmonicFieldsFactory
) : Tone(E, factory.harmonicFields()) {

}