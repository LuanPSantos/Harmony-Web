package com.luan.harmony.domain.tone.model

import com.luan.harmony.domain.chord.model.note.Note
import com.luan.harmony.domain.chord.model.note.Note.Value.A
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField
import com.luan.harmony.domain.tone.harmonicfiled.factory.AHarmonicFieldsFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ATone private constructor(
        @Autowired
        factory: AHarmonicFieldsFactory
) : Tone(A, factory.harmonicFields()) {

}