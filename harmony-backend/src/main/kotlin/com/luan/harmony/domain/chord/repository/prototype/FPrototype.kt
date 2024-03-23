package com.luan.harmony.domain.chord.repository.prototype

import com.luan.harmony.domain.chord.model.Chord
import com.luan.harmony.domain.chord.model.Chord.Name.*
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position.StringName.*
import com.luan.harmony.domain.chord.model.shape.AlternativeShape

class FPrototype {

    fun loadChords(): MutableMap<Chord.Name, Chord> {
        val chords: MutableMap<Chord.Name, Chord> = mutableMapOf()
        // Fb

        chords[F_FLAT_MAJOR_7M] = Tetrad(
                F_FLAT_MAJOR_7M,
                2,
                Fundamental(F_FLAT, Position(2, D4)),
                Third(A_FLAT, Position(4, E1)),
                Fifth(C_FLAT, Position(4, G3)),
                Seventh(E_FLAT, Position(4, B2))
        )

        chords[F_FLAT_MAJOR] = Triad(
                F_FLAT_MAJOR,
                0,
                Fundamental(F_FLAT, Position(0, E6)),
                Third(A_FLAT, Position(1, G3)),
                Fifth(C_FLAT, Position(2, A5)),
                listOf(
                        ChordNote(F_FLAT, Position(2, D4)),
                        ChordNote(C_FLAT, Position(0, B2)),
                        ChordNote(F_FLAT, Position(0, E1))
                )
        )

        chords[F_FLAT_MAJOR_7M_AND_5_AUGMENTED] = Tetrad(
                F_FLAT_MAJOR_7M_AND_5_AUGMENTED,
                4,
                Fundamental(F_FLAT, Position(7, A5)),
                Third(A_FLAT, Position(6, D4)),
                Fifth(C, Position(5, G3)),
                Seventh(E_FLAT, Position(4, B2))
        )

        chords[F_FLAT_MAJOR_5_AUGMENTED] = Triad(
                F_FLAT_MAJOR_5_AUGMENTED,
                4,
                Fundamental(F_FLAT, Position(7, A5)),
                Third(A_FLAT, Position(6, D4)),
                Fifth(C, Position(5, G3)),
                listOf(
                        ChordNote(F_FLAT, Position(5, B2))
                )
        )

        chords[F_FLAT_MAJOR_7] = Tetrad(
                F_FLAT_MAJOR_7,
                0,
                Fundamental(F_FLAT, Position(0, E6)),
                Third(A_FLAT, Position(1, G3)),
                Fifth(C_FLAT, Position(2, A5)),
                Seventh(E_DOUBLE_FLAT, Position(0, D4)),
                listOf(
                        ChordNote(C_FLAT, Position(0, B2)),
                        ChordNote(F_FLAT, Position(0, E1))
                )
        )

        // F

        chords[F_MAJOR_7M] = Tetrad(
                F_MAJOR_7M,
                1,
                Fundamental(F, Position(1, E6)),
                Third(A, Position(2, G3)),
                Fifth(C, Position(1, B2)),
                Seventh(E, Position(2, D4))
        )

        chords[F_MAJOR] = Triad(
                F_MAJOR,
                1,
                Fundamental(F, Position(1, E6)),
                Third(A, Position(2, G3)),
                Fifth(C, Position(3, A5)),
                listOf(
                        ChordNote(F, Position(3, D4)),
                        ChordNote(F, Position(1, E1)),
                        ChordNote(C, Position(1, B2))
                ),
                true
        )

        chords[F_MINOR] = Triad(
                F_MINOR,
                1,
                Fundamental(F, Position(1, E6)),
                Third(A_FLAT, Position(1, G3)),
                Fifth(C, Position(3, A5)),
                listOf(
                        ChordNote(F, Position(3, D4)),
                        ChordNote(F, Position(1, E1)),
                        ChordNote(C, Position(1, B2))
                ),
                true
        )

        chords[F_MINOR_7] = Tetrad(
                F_MINOR_7,
                1,
                Fundamental(F, Position(1, E6)),
                Third(A_FLAT, Position(1, G3)),
                Fifth(C, Position(1, B2)),
                Seventh(E_FLAT, Position(1, D4))
        ).addShape(AlternativeShape(3)
                .addNote(Fundamental(F, Position(3, D4)))
                .addNote(Third(A_FLAT, Position(4, E1)))
                .addNote(Fifth(C, Position(5, G3)))
                .addNote(Seventh(E_FLAT, Position(4, B2))))

        chords[F_MAJOR_7] = Tetrad(
                F_MAJOR_7,
                1,
                Fundamental(F, Position(1, E6)),
                Third(A, Position(2, G3)),
                Fifth(C, Position(3, A5)),
                Seventh(E_FLAT, Position(1, D4)),
                listOf(
                        ChordNote(F, Position(1, E1)),
                        ChordNote(C, Position(1, B2))
                ),
                true
        )

        chords[F_MAJOR_7M_AND_5_AUGMENTED] = Tetrad(
                F_MAJOR_7M_AND_5_AUGMENTED,
                1,
                Fundamental(F, Position(1, E6)),
                Third(A, Position(2, G3)),
                Fifth(C_SHARP, Position(2, B2)),
                Seventh(E, Position(2, D4))
        )

        chords[F_MAJOR_5_AUGMENTED] = Triad(
                F_MAJOR_5_AUGMENTED,
                1,
                Fundamental(F, Position(1, E6)),
                Third(A, Position(2, G3)),
                Fifth(C_SHARP, Position(2, B2)),
                listOf(
                        ChordNote(F, Position(3, D4))
                )
        )

        chords[F_HALF_DIMINISHED] = Tetrad(
                F_HALF_DIMINISHED,
                3,
                Fundamental(F, Position(3, D4)),
                Third(A_FLAT, Position(4, E1)),
                Fifth(C_FLAT, Position(4, G3)),
                Seventh(E_FLAT, Position(4, B2))
        )

        chords[F_DIMINISHED] = Triad(
                F_DIMINISHED,
                8,
                Fundamental(F, Position(8, A5)),
                Third(A_FLAT, Position(9, B2)),
                Fifth(C_FLAT, Position(9, D4)),
                listOf(
                        ChordNote(F, Position(10, G3))
                )
        )

        chords[F_MINOR_7M] = Tetrad(
                F_MINOR_7M,
                1,
                Fundamental(F, Position(1, E6)),
                Third(A_FLAT, Position(1, G3)),
                Fifth(C, Position(1, B2)),
                Seventh(E, Position(2, D4))
        )

        chords[F_DIMINISHED_TETRAD] = Tetrad(
                F_DIMINISHED_TETRAD,
                3,
                Fundamental(F, Position(3, D4)),
                Third(A_FLAT, Position(4, E1)),
                Fifth(C_FLAT, Position(4, G3)),
                Seventh(E_DOUBLE_FLAT, Position(3, B2))
        )

        // F#

        chords[F_SHARP_MINOR_7] = Tetrad(
                F_SHARP_MINOR_7,
                2,
                Fundamental(F_SHARP, Position(2, E6)),
                Third(A, Position(2, G3)),
                Fifth(C_SHARP, Position(2, B2)),
                Seventh(E, Position(2, D4))
        )

        chords[F_SHARP_MINOR] = Triad(
                F_SHARP_MINOR,
                2,
                Fundamental(F_SHARP, Position(2, E6)),
                Third(A, Position(2, G3)),
                Fifth(C_SHARP, Position(4, A5)),
                listOf(
                        ChordNote(F_SHARP, Position(4, D4)),
                        ChordNote(C_SHARP, Position(2, B2)),
                        ChordNote(F_SHARP, Position(2, E1))
                ),
                true
        )

        chords[F_SHARP_HALF_DIMINISHED] = Tetrad(
                F_SHARP_HALF_DIMINISHED,
                1,
                Fundamental(F_SHARP, Position(2, E6)),
                Third(A, Position(2, G3)),
                Fifth(C, Position(1, B2)),
                Seventh(E, Position(2, D4))
        )

        chords[F_SHARP_DIMINISHED] = Triad(
                F_SHARP_DIMINISHED,
                2,
                Fundamental(F_SHARP, Position(2, E6)),
                Third(A, Position(2, G3)),
                Fifth(C, Position(3, A5)),
                listOf(
                        ChordNote(F_SHARP, Position(4, D4))
                )
        )

        chords[F_SHARP_MAJOR_7] = Tetrad(
                F_SHARP_MAJOR_7,
                2,
                Fundamental(F_SHARP, Position(2, E6)),
                Third(A_SHARP, Position(3, G3)),
                Fifth(C_SHARP, Position(4, A5)),
                Seventh(E, Position(2, D4)),
                listOf(
                        ChordNote(C_SHARP, Position(2, B2)),
                        ChordNote(F_SHARP, Position(2, E1))
                ),
                true
        )

        chords[F_SHARP_MAJOR] = Triad(
                F_SHARP_MAJOR,
                2,
                Fundamental(F_SHARP, Position(2, E6)),
                Third(A_SHARP, Position(3, G3)),
                Fifth(C_SHARP, Position(4, A5)),
                listOf(
                        ChordNote(F_SHARP, Position(4, D4)),
                        ChordNote(C_SHARP, Position(2, B2)),
                        ChordNote(F_SHARP, Position(2, E1))
                ),
                true
        )

        return chords
    }
}