package com.luan.harmony.domain.tone.controller

import com.luan.harmony.domain.chord.model.note.Note
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField
import com.luan.harmony.domain.tone.model.Tone
import com.luan.harmony.domain.tone.service.ToneService
import org.springframework.http.HttpStatus.OK
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class ToneController(
        private val toneService: ToneService
) {

    @GetMapping("tones/{value}")
    @ResponseStatus(OK)
    fun findByToneValue(@PathVariable value: Note.Value): Tone {
        return this.toneService.findByToneValue(value)
    }

    @GetMapping("tones/{value}/harmonic-fields/{type}")
    @ResponseStatus(OK)
    fun findHarmonicFieldByTypeAndTone(
            @PathVariable type: HarmonicField.Type,
            @PathVariable value: Note.Value): HarmonicField {
        return this.toneService.findHarmonicFieldByTypeAndTone(type, value)
    }
}