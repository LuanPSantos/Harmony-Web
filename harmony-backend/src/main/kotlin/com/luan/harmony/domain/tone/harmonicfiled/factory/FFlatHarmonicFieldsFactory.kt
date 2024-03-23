package com.luan.harmony.domain.tone.harmonicfiled.factory

import com.luan.harmony.domain.chord.model.Chord.Name.*
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.service.ChordService
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Grade.*
import org.springframework.stereotype.Component

@Component
class FFlatHarmonicFieldsFactory(
        private val chordService: ChordService
) : HarmonicFieldsFactory() {

    override fun naturalMajorTetrads(): List<Tetrad> {
        return listOf(
                chordService.findByNameWithGrade(F_MAJOR_7M, FIRST) as Tetrad,
                chordService.findByNameWithGrade(G_MINOR_7, SECOND) as Tetrad,
                chordService.findByNameWithGrade(A_MINOR_7, THIRD) as Tetrad,
                chordService.findByNameWithGrade(B_FLAT_MAJOR_7M, FORTH) as Tetrad,
                chordService.findByNameWithGrade(C_MAJOR_7, FIFTH) as Tetrad,
                chordService.findByNameWithGrade(D_MINOR_7, SIXTH) as Tetrad,
                chordService.findByNameWithGrade(E_HALF_DIMINISHED, SEVENTH) as Tetrad
        )
    }

    override fun naturalMajorTriads(): List<Triad> {
        return listOf(
                chordService.findByNameWithGrade(F_MAJOR, FIRST) as Triad,
                chordService.findByNameWithGrade(G_MINOR, SECOND) as Triad,
                chordService.findByNameWithGrade(A_MINOR, THIRD) as Triad,
                chordService.findByNameWithGrade(B_FLAT_MAJOR, FORTH) as Triad,
                chordService.findByNameWithGrade(C_MAJOR, FIFTH) as Triad,
                chordService.findByNameWithGrade(D_MINOR, SIXTH) as Triad,
                chordService.findByNameWithGrade(E_DIMINISHED, SEVENTH) as Triad

        )
    }

    override fun naturalMinorTetrads(): List<Tetrad> {
        return listOf(
                chordService.findByNameWithGrade(F_MINOR_7, FIRST) as Tetrad,
                chordService.findByNameWithGrade(G_HALF_DIMINISHED, SECOND) as Tetrad,
                chordService.findByNameWithGrade(A_FLAT_MAJOR_7M, THIRD) as Tetrad,
                chordService.findByNameWithGrade(B_FLAT_MINOR_7, FORTH) as Tetrad,
                chordService.findByNameWithGrade(C_MINOR_7, FIFTH) as Tetrad,
                chordService.findByNameWithGrade(D_FLAT_MAJOR_7M, SIXTH) as Tetrad,
                chordService.findByNameWithGrade(E_FLAT_MAJOR_7, SEVENTH) as Tetrad

        )
    }

    override fun naturalMinorTriads(): List<Triad> {
        return listOf(
                chordService.findByNameWithGrade(F_MINOR, FIRST) as Triad,
                chordService.findByNameWithGrade(G_DIMINISHED, SECOND) as Triad,
                chordService.findByNameWithGrade(A_FLAT_MAJOR, THIRD) as Triad,
                chordService.findByNameWithGrade(B_FLAT_MINOR, FORTH) as Triad,
                chordService.findByNameWithGrade(C_MINOR, FIFTH) as Triad,
                chordService.findByNameWithGrade(D_FLAT_MAJOR, SIXTH) as Triad,
                chordService.findByNameWithGrade(E_FLAT_MAJOR, SEVENTH) as Triad
        )
    }

    override fun harmonicMinorTetrads(): List<Tetrad> {
        return listOf(
                chordService.findByNameWithGrade(F_MINOR_7M, FIRST) as Tetrad,
                chordService.findByNameWithGrade(G_HALF_DIMINISHED, SECOND) as Tetrad,
                chordService.findByNameWithGrade(A_FLAT_MAJOR_7M_AND_5_AUGMENTED, THIRD) as Tetrad,
                chordService.findByNameWithGrade(B_FLAT_MINOR_7, FORTH) as Tetrad,
                chordService.findByNameWithGrade(C_MAJOR_7, FIFTH) as Tetrad,
                chordService.findByNameWithGrade(D_FLAT_MAJOR_7M, SIXTH) as Tetrad,
                chordService.findByNameWithGrade(E_DIMINISHED_TETRAD, SEVENTH) as Tetrad
        )
    }

    override fun harmonicMinorTriads(): List<Triad> {
        return listOf(
                chordService.findByNameWithGrade(F_MINOR, FIRST) as Triad,
                chordService.findByNameWithGrade(G_DIMINISHED, SECOND) as Triad,
                chordService.findByNameWithGrade(A_FLAT_MAJOR_5_AUGMENTED, THIRD) as Triad,
                chordService.findByNameWithGrade(B_FLAT_MINOR, FORTH) as Triad,
                chordService.findByNameWithGrade(C_MAJOR, FIFTH) as Triad,
                chordService.findByNameWithGrade(D_FLAT_MAJOR, SIXTH) as Triad,
                chordService.findByNameWithGrade(E_DIMINISHED, SEVENTH) as Triad
        )
    }

    override fun melodicMinorTetrads(): List<Tetrad> {
        return listOf(
                chordService.findByNameWithGrade(F_MINOR_7M, FIRST) as Tetrad,
                chordService.findByNameWithGrade(G_MINOR_7, SECOND) as Tetrad,
                chordService.findByNameWithGrade(A_FLAT_MAJOR_7M_AND_5_AUGMENTED, THIRD) as Tetrad,
                chordService.findByNameWithGrade(B_FLAT_MAJOR_7, FORTH) as Tetrad,
                chordService.findByNameWithGrade(C_MAJOR_7, FIFTH) as Tetrad,
                chordService.findByNameWithGrade(D_HALF_DIMINISHED, SIXTH) as Tetrad,
                chordService.findByNameWithGrade(E_HALF_DIMINISHED, SEVENTH) as Tetrad

        )
    }

    override fun melodicMinorTriads(): List<Triad> {
        return listOf(
                chordService.findByNameWithGrade(F_MINOR, FIRST) as Triad,
                chordService.findByNameWithGrade(G_MINOR, SECOND) as Triad,
                chordService.findByNameWithGrade(A_FLAT_MAJOR_5_AUGMENTED, THIRD) as Triad,
                chordService.findByNameWithGrade(B_FLAT_MAJOR, FORTH) as Triad,
                chordService.findByNameWithGrade(C_MAJOR, FIFTH) as Triad,
                chordService.findByNameWithGrade(D_DIMINISHED, SIXTH) as Triad,
                chordService.findByNameWithGrade(E_DIMINISHED, SEVENTH) as Triad
        )
    }
}