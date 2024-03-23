package com.luan.harmony.domain.tone.model

import com.luan.harmony.domain.chord.model.note.Note.Value.G_FLAT
import com.luan.harmony.domain.tone.harmonicfiled.factory.GFlatHarmonicFieldsFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class GFlatTone private constructor(
        @Autowired
        factory: GFlatHarmonicFieldsFactory
) : Tone(G_FLAT, factory.harmonicFields())