package com.luan.harmony.domain.tone.model

import com.luan.harmony.domain.chord.model.note.Note.Value.D
import com.luan.harmony.domain.tone.harmonicfiled.factory.DHarmonicFieldsFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class DTone private constructor(
        @Autowired
        factory: DHarmonicFieldsFactory
) : Tone(D, factory.harmonicFields())