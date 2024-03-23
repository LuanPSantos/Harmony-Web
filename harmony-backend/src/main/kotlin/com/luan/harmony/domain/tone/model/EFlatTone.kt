package com.luan.harmony.domain.tone.model


import com.luan.harmony.domain.chord.model.note.Note.Value.E_FLAT
import com.luan.harmony.domain.tone.harmonicfiled.factory.EFlatHarmonicFieldsFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class EFlatTone private constructor(
        @Autowired
        factory: EFlatHarmonicFieldsFactory
) : Tone(E_FLAT, factory.harmonicFields())