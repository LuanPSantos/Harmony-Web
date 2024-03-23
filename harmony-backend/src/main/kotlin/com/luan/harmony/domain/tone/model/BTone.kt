package com.luan.harmony.domain.tone.model

import com.luan.harmony.domain.chord.model.note.Note.Value.B
import com.luan.harmony.domain.tone.harmonicfiled.factory.BHarmonicFieldsFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class BTone private constructor(
        @Autowired
        factory: BHarmonicFieldsFactory
) : Tone(B, factory.harmonicFields()) {

}