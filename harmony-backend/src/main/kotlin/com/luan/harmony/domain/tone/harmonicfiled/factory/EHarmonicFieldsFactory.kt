package com.luan.harmony.domain.tone.harmonicfiled.factory

import com.luan.harmony.domain.chord.model.Chord.Name.*
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.service.ChordService
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Grade.*
import org.springframework.stereotype.Component

@Component
class EHarmonicFieldsFactory(
        private val chordService: ChordService
) : HarmonicFieldsFactory() {

    override fun naturalMajorTetrads(): List<Tetrad> {
        return listOf(
                chordService.findByNameWithGrade(E_MAJOR_7M, FIRST) as Tetrad,
                chordService.findByNameWithGrade(F_SHARP_MINOR_7, SECOND) as Tetrad,
                chordService.findByNameWithGrade(G_SHARP_MINOR_7, THIRD) as Tetrad,
                chordService.findByNameWithGrade(A_MAJOR_7M, FORTH) as Tetrad,
                chordService.findByNameWithGrade(B_MAJOR_7, FIFTH) as Tetrad,
                chordService.findByNameWithGrade(C_SHARP_MINOR_7, SIXTH) as Tetrad,
                chordService.findByNameWithGrade(D_SHARP_HALF_DIMINISHED, SEVENTH) as Tetrad
        )
    }

    override fun naturalMajorTriads(): List<Triad> {
        return listOf(
                chordService.findByNameWithGrade(E_MAJOR, FIRST) as Triad,
                chordService.findByNameWithGrade(F_SHARP_MINOR, SECOND) as Triad,
                chordService.findByNameWithGrade(G_SHARP_MINOR, THIRD) as Triad,
                chordService.findByNameWithGrade(A_MAJOR, FORTH) as Triad,
                chordService.findByNameWithGrade(B_MAJOR, FIFTH) as Triad,
                chordService.findByNameWithGrade(C_SHARP_MINOR, SIXTH) as Triad,
                chordService.findByNameWithGrade(D_SHARP_DIMINISHED, SEVENTH) as Triad

        )
    }

    override fun naturalMinorTetrads(): List<Tetrad> {
        return listOf(
                chordService.findByNameWithGrade(E_MINOR_7, FIRST) as Tetrad,
                chordService.findByNameWithGrade(F_SHARP_HALF_DIMINISHED, SECOND) as Tetrad,
                chordService.findByNameWithGrade(G_MAJOR_7M, THIRD) as Tetrad,
                chordService.findByNameWithGrade(A_MINOR_7, FORTH) as Tetrad,
                chordService.findByNameWithGrade(B_MINOR_7, FIFTH) as Tetrad,
                chordService.findByNameWithGrade(C_MAJOR_7M, SIXTH) as Tetrad,
                chordService.findByNameWithGrade(D_MAJOR_7, SEVENTH) as Tetrad

        )
    }

    override fun naturalMinorTriads(): List<Triad> {
        return listOf(
                chordService.findByNameWithGrade(E_MINOR, FIRST) as Triad,
                chordService.findByNameWithGrade(F_SHARP_DIMINISHED, SECOND) as Triad,
                chordService.findByNameWithGrade(G_MAJOR, THIRD) as Triad,
                chordService.findByNameWithGrade(A_MINOR, FORTH) as Triad,
                chordService.findByNameWithGrade(B_MINOR, FIFTH) as Triad,
                chordService.findByNameWithGrade(C_MAJOR, SIXTH) as Triad,
                chordService.findByNameWithGrade(D_MAJOR, SEVENTH) as Triad
        )
    }

    override fun harmonicMinorTetrads(): List<Tetrad> {
        return listOf(
                chordService.findByNameWithGrade(E_MINOR_7M, FIRST) as Tetrad,
                chordService.findByNameWithGrade(F_SHARP_HALF_DIMINISHED, SECOND) as Tetrad,
                chordService.findByNameWithGrade(G_MAJOR_7M_AND_5_AUGMENTED, THIRD) as Tetrad,
                chordService.findByNameWithGrade(A_MINOR_7, FORTH) as Tetrad,
                chordService.findByNameWithGrade(B_MAJOR_7, FIFTH) as Tetrad,
                chordService.findByNameWithGrade(C_MAJOR_7M, SIXTH) as Tetrad,
                chordService.findByNameWithGrade(D_SHARP_DIMINISHED_TETRAD, SEVENTH) as Tetrad
        )
    }

    override fun harmonicMinorTriads(): List<Triad> {
        return listOf(
                chordService.findByNameWithGrade(E_MINOR, FIRST) as Triad,
                chordService.findByNameWithGrade(F_SHARP_DIMINISHED, SECOND) as Triad,
                chordService.findByNameWithGrade(G_MAJOR_5_AUGMENTED, THIRD) as Triad,
                chordService.findByNameWithGrade(A_MINOR, FORTH) as Triad,
                chordService.findByNameWithGrade(B_MAJOR, FIFTH) as Triad,
                chordService.findByNameWithGrade(C_MAJOR, SIXTH) as Triad,
                chordService.findByNameWithGrade(D_SHARP_DIMINISHED, SEVENTH) as Triad
        )
    }

    override fun melodicMinorTetrads(): List<Tetrad> {
        return listOf(
                chordService.findByNameWithGrade(E_MINOR_7M, FIRST) as Tetrad,
                chordService.findByNameWithGrade(F_SHARP_MINOR_7, SECOND) as Tetrad,
                chordService.findByNameWithGrade(G_MAJOR_7M_AND_5_AUGMENTED, THIRD) as Tetrad,
                chordService.findByNameWithGrade(A_MAJOR_7, FORTH) as Tetrad,
                chordService.findByNameWithGrade(G_MAJOR_7, FIFTH) as Tetrad,
                chordService.findByNameWithGrade(C_SHARP_HALF_DIMINISHED, SIXTH) as Tetrad,
                chordService.findByNameWithGrade(D_SHARP_HALF_DIMINISHED, SEVENTH) as Tetrad

        )
    }

    override fun melodicMinorTriads(): List<Triad> {
        return listOf(
                chordService.findByNameWithGrade(E_MINOR, FIRST) as Triad,
                chordService.findByNameWithGrade(F_SHARP_MINOR, SECOND) as Triad,
                chordService.findByNameWithGrade(G_MAJOR_5_AUGMENTED, THIRD) as Triad,
                chordService.findByNameWithGrade(A_MAJOR, FORTH) as Triad,
                chordService.findByNameWithGrade(G_MAJOR, FIFTH) as Triad,
                chordService.findByNameWithGrade(C_SHARP_DIMINISHED, SIXTH) as Triad,
                chordService.findByNameWithGrade(D_SHARP_DIMINISHED, SEVENTH) as Triad
        )
    }
}