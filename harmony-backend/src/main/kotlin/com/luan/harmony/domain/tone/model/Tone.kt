package com.luan.harmony.domain.tone.model

import com.luan.harmony.domain.chord.model.note.Note
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField

abstract class Tone(
        val value: Note.Value,
        val harmonicFields: List<HarmonicField> = listOf()
) {

    override fun toString(): String {
        val harmonicFieldsString = harmonicFields.map { "\n\t\t${it}" }
        return "Tone(\n\tvalue=$value, \n\tharmonicFields=$harmonicFieldsString)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Tone

        if (value != other.value) return false
        if(harmonicFields.size != other.harmonicFields.size) return false

        for (note in harmonicFields) {
            var hasNote = false
            for (otherNote in other.harmonicFields) {
                if (note == otherNote) {
                    hasNote = true
                    break
                }
            }

            if (!hasNote) return false
        }

        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}