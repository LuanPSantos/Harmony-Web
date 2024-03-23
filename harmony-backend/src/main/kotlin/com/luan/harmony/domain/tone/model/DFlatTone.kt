package com.luan.harmony.domain.tone.model

import com.luan.harmony.domain.chord.model.note.Note.Value.D_FLAT
import com.luan.harmony.domain.tone.harmonicfiled.factory.DFlatHarmonicFieldsFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class DFlatTone private constructor(
        @Autowired
        factory: DFlatHarmonicFieldsFactory
) : Tone(D_FLAT, factory.harmonicFields())