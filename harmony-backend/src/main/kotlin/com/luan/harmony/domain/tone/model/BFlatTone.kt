package com.luan.harmony.domain.tone.model

import com.luan.harmony.domain.chord.model.note.Note.Value.B_FLAT
import com.luan.harmony.domain.tone.harmonicfiled.factory.BFlatHarmonicFieldsFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class BFlatTone private constructor(
        @Autowired
        factory: BFlatHarmonicFieldsFactory
) : Tone(B_FLAT, factory.harmonicFields())