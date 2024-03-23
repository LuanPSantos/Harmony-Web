package com.luan.harmony.domain.tone.model

import com.luan.harmony.domain.chord.model.note.Note.Value.C
import com.luan.harmony.domain.tone.harmonicfiled.factory.CHarmonicFieldsFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CTone constructor(
        @Autowired
        factory: CHarmonicFieldsFactory
) : Tone(C, factory.harmonicFields())