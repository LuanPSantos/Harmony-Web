package com.luan.harmony.domain.tone.model

import com.luan.harmony.domain.chord.model.note.Note
import com.luan.harmony.domain.chord.model.note.Note.Value.F
import com.luan.harmony.domain.tone.harmonicfiled.factory.FFlatHarmonicFieldsFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class FTone private constructor(
        @Autowired
        factory: FFlatHarmonicFieldsFactory
) : Tone(F, factory.harmonicFields())