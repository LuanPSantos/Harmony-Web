package com.luan.harmony.domain.tone.model

import com.luan.harmony.domain.chord.model.note.Note.Value.A_FLAT
import com.luan.harmony.domain.tone.harmonicfiled.factory.AFlatHarmonicFieldsFactory
import com.luan.harmony.domain.tone.harmonicfiled.factory.AHarmonicFieldsFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class AFlatTone private constructor(
        @Autowired
        factory: AFlatHarmonicFieldsFactory
) : Tone(A_FLAT, factory.harmonicFields())
