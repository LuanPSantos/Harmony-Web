package com.luan.harmony.domain.chord.repository.prototype

import com.luan.harmony.domain.chord.model.Chord
import com.luan.harmony.domain.chord.model.Chord.Name.*
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position.StringName.*

class BPrototype {

    fun loadChords(): MutableMap<Chord.Name, Chord> {
        val chords: MutableMap<Chord.Name, Chord> = mutableMapOf()
        // Bb

        chords[B_DOUBLE_FLAT_MAJOR_7M] = Tetrad(
                B_DOUBLE_FLAT_MAJOR_7M,
                0,
                Fundamental(B_DOUBLE_FLAT, Position(0, A5)),
                Third(D_FLAT, Position(2, B2)),
                Fifth(F_FLAT, Position(2, D4)),
                Seventh(A_FLAT, Position(1, G3)),
                listOf(
                        ChordNote(F_FLAT, Position(0, E1))
                )
        )

        chords[B_DOUBLE_FLAT_MAJOR] = Triad(
                B_DOUBLE_FLAT_MAJOR,
                0,
                Fundamental(B_DOUBLE_FLAT, Position(0, A5)),
                Third(D_FLAT, Position(2, B2)),
                Fifth(F_FLAT, Position(2, D4)),
                listOf(
                        Seventh(B_DOUBLE_FLAT, Position(2, G3)),
                        ChordNote(F_FLAT, Position(0, E1))
                )
        )

        chords[B_DOUBLE_FLAT_MAJOR_7M_AND_5_AUGMENTED] = Tetrad(
                B_DOUBLE_FLAT_MAJOR_7M_AND_5_AUGMENTED,
                5,
                Fundamental(B_DOUBLE_FLAT, Position(5, E6)),
                Third(D_FLAT, Position(6, G3)),
                Fifth(F, Position(6, B2)),
                Seventh(A_FLAT, Position(6, D4))

        )

        chords[B_DOUBLE_FLAT_MAJOR_5_AUGMENTED] = Triad(
                B_DOUBLE_FLAT_MAJOR_5_AUGMENTED,
                5,
                Fundamental(B_DOUBLE_FLAT, Position(5, E6)),
                Third(D_FLAT, Position(6, G3)),
                Fifth(F, Position(6, B2)),
                listOf(
                        ChordNote(B_DOUBLE_FLAT, Position(7, D4))
                )
        )

        chords[B_FLAT_MAJOR] = Triad(
                B_FLAT_MAJOR,
                1,
                Fundamental(B_FLAT, Position(1, A5)),
                Third(D, Position(3, B2)),
                Fifth(F, Position(3, D4)),
                listOf(
                        ChordNote(B_FLAT, Position(3, G3)),
                        ChordNote(F, Position(1, E1))
                ),
                true
        )

        chords[B_FLAT_MAJOR_7] = Tetrad(
                B_FLAT_MAJOR_7,
                1,
                Fundamental(B_FLAT, Position(1, A5)),
                Third(D, Position(3, B2)),
                Fifth(F, Position(3, D4)),
                Seventh(A_FLAT, Position(1, G3)),
                listOf(
                        ChordNote(F, Position(1, E1))
                ),
                true
        )

        chords[B_FLAT_MINOR_7] = Tetrad(
                B_FLAT_MINOR_7,
                1,
                Fundamental(B_FLAT, Position(1, A5)),
                Third(D_FLAT, Position(2, B2)),
                Fifth(F, Position(3, D4)),
                Seventh(A_FLAT, Position(1, G3)),
                listOf(
                        ChordNote(F, Position(1, E1))
                ),
                true
        )

        chords[B_FLAT_MINOR] = Triad(
                B_FLAT_MINOR,
                1,
                Fundamental(B_FLAT, Position(1, A5)),
                Third(D_FLAT, Position(2, B2)),
                Fifth(F, Position(3, D4)),
                listOf(
                        ChordNote(B_FLAT, Position(3, G3)),
                        ChordNote(F, Position(1, E1))
                ),
                true
        )

        chords[B_FLAT_HALF_DIMINISHED] = Tetrad(
                B_FLAT_HALF_DIMINISHED,
                1,
                Fundamental(B_FLAT, Position(1, A5)),
                Third(D_FLAT, Position(2, B2)),
                Fifth(F_FLAT, Position(2, D4)),
                Seventh(A_FLAT, Position(1, G3))
        )

        chords[B_FLAT_DIMINISHED] = Triad(
                B_FLAT_DIMINISHED,
                1,
                Fundamental(B_FLAT, Position(1, A5)),
                Third(D_FLAT, Position(2, B2)),
                Fifth(F_FLAT, Position(2, D4)),
                listOf(
                        ChordNote(B_FLAT, Position(3, G3))
                )
        )

        chords[B_FLAT_MAJOR_7M] = Tetrad(
                B_FLAT_MAJOR_7M,
                1,
                Fundamental(B_FLAT, Position(1, A5)),
                Third(D, Position(3, B2)),
                Fifth(F, Position(3, D4)),
                Seventh(A, Position(2, G3)),
                listOf(
                        ChordNote(F, Position(1, E1))
                ),
                true
        )

        chords[B_FLAT_MAJOR_7M_AND_5_AUGMENTED] = Tetrad(
                B_FLAT_MAJOR_7M_AND_5_AUGMENTED,
                6,
                Fundamental(B_FLAT, Position(6, E6)),
                Third(D, Position(7, G3)),
                Fifth(F_SHARP, Position(7, B2)),
                Seventh(A, Position(7, D4))
        )

        chords[B_FLAT_MAJOR_5_AUGMENTED] = Triad(
                B_FLAT_MAJOR_5_AUGMENTED,
                6,
                Fundamental(B_FLAT, Position(6, E6)),
                Third(D, Position(7, G3)),
                Fifth(F_SHARP, Position(7, B2)),
                listOf(
                        ChordNote(B_FLAT, Position(8, D4))
                )
        )

        chords[B_FLAT_MINOR_7M] = Tetrad(
                B_FLAT_MINOR_7M,
                1,
                Fundamental(B_FLAT, Position(1, A5)),
                Third(D_FLAT, Position(2, B2)),
                Fifth(F, Position(3, D4)),
                Seventh(A, Position(2, G3)),
                listOf(
                        ChordNote(F, Position(1, E1))
                ),
                true
        )

        // B

        chords[B_HALF_DIMINISHED] = Tetrad(
                B_HALF_DIMINISHED,
                2,
                Fundamental(B, Position(2, A5)),
                Third(D, Position(3, B2)),
                Fifth(F, Position(3, D4)),
                Seventh(A, Position(2, G3))
        )

        chords[B_DIMINISHED] = Triad(
                B_DIMINISHED,
                2,
                Fundamental(B, Position(2, A5)),
                Third(D, Position(3, B2)),
                Fifth(F, Position(3, D4)),
                listOf(
                        ChordNote(B, Position(4, G3))
                )
        )

        chords[B_DIMINISHED_TETRAD] = Tetrad(
                B_DIMINISHED_TETRAD,
                1,
                Fundamental(B, Position(2, A5)),
                Third(D, Position(3, B2)),
                Fifth(F, Position(3, D4)),
                Seventh(A_FLAT, Position(1, G3))
        )

        chords[B_MINOR_7] = Tetrad(
                B_MINOR_7,
                2,
                Fundamental(B, Position(2, A5)),
                Third(D, Position(3, B2)),
                Fifth(F_SHARP, Position(4, D4)),
                Seventh(A, Position(2, G3)),
                listOf(
                        ChordNote(F_SHARP, Position(2, E1))
                ),
                true
        )

        chords[B_MINOR] = Triad(
                B_MINOR,
                2,
                Fundamental(B, Position(2, A5)),
                Third(D, Position(3, B2)),
                Fifth(F_SHARP, Position(4, D4)),
                listOf(
                        Seventh(B, Position(4, G3)),
                        ChordNote(F_SHARP, Position(2, E1))
                ),
                true
        )

        chords[B_MAJOR_7] = Tetrad(
                B_MAJOR_7,
                2,
                Fundamental(B, Position(2, A5)),
                Third(D_SHARP, Position(4, B2)),
                Fifth(F_SHARP, Position(4, D4)),
                Seventh(A, Position(2, G3)),
                listOf(
                        ChordNote(F_SHARP, Position(2, E1))
                ),
                true
        )

        chords[B_MAJOR] = Triad(
                B_MAJOR,
                2,
                Fundamental(B, Position(2, A5)),
                Third(D_SHARP, Position(4, B2)),
                Fifth(F_SHARP, Position(4, D4)),

                listOf(
                        ChordNote(B, Position(4, G3)),
                        ChordNote(F_SHARP, Position(2, E1))
                ),
                true
        )

        chords[B_MAJOR_7M] = Tetrad(
                B_MAJOR_7M,
                2,
                Fundamental(B, Position(2, A5)),
                Third(D_SHARP, Position(4, B2)),
                Fifth(F_SHARP, Position(4, D4)),
                Seventh(A_SHARP, Position(3, G3)),
                listOf(
                        ChordNote(F_SHARP, Position(2, E1))
                ),
                true
        )

        chords[B_MINOR_7M] = Tetrad(
                B_MINOR_7M,
                2,
                Fundamental(B, Position(2, A5)),
                Third(D, Position(3, B2)),
                Fifth(F_SHARP, Position(4, D4)),
                Seventh(A_SHARP, Position(3, G3)),
                listOf(
                        ChordNote(F_SHARP, Position(2, E1))
                ),
                true
        )

        return chords
    }
}