package com.luan.harmony.domain.chord.service

import com.luan.harmony.domain.chord.model.Chord
import com.luan.harmony.domain.chord.repository.ChordRepository
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField
import org.springframework.stereotype.Service

@Service
class ChordService(
        private val chordRepository: ChordRepository
) {

    fun findByNameWithGrade(name: Chord.Name, grade: HarmonicField.Grade): Chord {
        return chordRepository.findByName(name).withGrade(grade)
    }
}