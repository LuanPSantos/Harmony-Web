package com.luan.harmony.domain.tone.model

import com.luan.harmony.domain.chord.model.note.Note.Value.G
import com.luan.harmony.domain.tone.harmonicfiled.factory.GHarmonicFieldsFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class GTone private constructor(
        @Autowired
        factory: GHarmonicFieldsFactory
) : Tone(G, factory.harmonicFields())