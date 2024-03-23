package com.luan.harmony.domain.chord.repository.prototype

import com.luan.harmony.domain.chord.model.Chord
import com.luan.harmony.domain.chord.model.Chord.Name.*
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position.StringName.*

class DPrototype {

    fun loadChords(): MutableMap<Chord.Name, Chord> {
        val chords: MutableMap<Chord.Name, Chord> = mutableMapOf()

        // Db

        chords[D_FLAT_MAJOR_7M] = Tetrad(
                D_FLAT_MAJOR_7M,
                4,
                Fundamental(D_FLAT, Position(4, A5)),
                Third(F, Position(6, B2)),
                Fifth(A_FLAT, Position(6, D4)),
                Seventh(C, Position(5, G3)),
                listOf(
                        ChordNote(A_FLAT, Position(4, E1))
                ),
                true
        )

        chords[D_FLAT_MAJOR] = Triad(
                D_FLAT_MAJOR,
                4,
                Fundamental(D_FLAT, Position(4, A5)),
                Third(F, Position(6, B2)),
                Fifth(A_FLAT, Position(6, D4)),
                listOf(
                        ChordNote(D_FLAT, Position(6, G3)),
                        ChordNote(A_FLAT, Position(4, E1))
                ),
                true
        )

        chords[D_FLAT_MINOR_7] = Tetrad(
                D_FLAT_MINOR_7,
                4,
                Fundamental(D_FLAT, Position(4, A5)),
                Third(F_FLAT, Position(5, B2)),
                Fifth(A_FLAT, Position(6, D4)),
                Seventh(C_FLAT, Position(4, G3)),
                listOf(
                        ChordNote(A_FLAT, Position(4, E1))
                ),
                true
        )

        chords[D_FLAT_MINOR] = Triad(
                D_FLAT_MINOR,
                4,
                Fundamental(D_FLAT, Position(4, A5)),
                Third(F_FLAT, Position(5, B2)),
                Fifth(A_FLAT, Position(6, D4)),
                listOf(
                        ChordNote(D_FLAT, Position(6, G3)),
                        ChordNote(A_FLAT, Position(4, E1))
                ),
                true
        )

        chords[D_FLAT_MINOR_7M] = Tetrad(
                D_FLAT_MINOR_7M,
                4,
                Fundamental(D_FLAT, Position(4, A5)),
                Third(F_FLAT, Position(5, B2)),
                Fifth(A_FLAT, Position(6, D4)),
                Seventh(C, Position(5, G3)),
                listOf(
                        ChordNote(A_FLAT, Position(4, E1))
                ),
                true
        )

        chords[D_FLAT_MAJOR_7] = Tetrad(
                D_FLAT_MAJOR_7,
                4,
                Fundamental(D_FLAT, Position(4, A5)),
                Third(F, Position(6, B2)),
                Fifth(A_FLAT, Position(6, D4)),
                Seventh(C_FLAT, Position(4, G3)),
                listOf(
                        ChordNote(A_FLAT, Position(4, E1))
                ),
                true
        )

        chords[D_FLAT_MAJOR_7M_AND_5_AUGMENTED] = Tetrad(
                D_FLAT_MAJOR_7M_AND_5_AUGMENTED,
                1,
                Fundamental(D_FLAT, Position(4, A5)),
                Third(F, Position(3, D4)),
                Fifth(A, Position(2, G3)),
                Seventh(C, Position(1, B2))
        )

        chords[D_FLAT_MAJOR_5_AUGMENTED] = Triad(
                D_FLAT_MAJOR_5_AUGMENTED,
                2,
                Fundamental(D_FLAT, Position(4, A5)),
                Third(F, Position(3, D4)),
                Fifth(A, Position(2, G3)),
                listOf(
                        ChordNote(D_FLAT, Position(2, B2))
                )
        )

        // D

        chords[D_MINOR_7] = Tetrad(
                D_MINOR_7,
                0,
                Fundamental(D, Position(0, D4)),
                Third(F, Position(1, E1)),
                Fifth(A, Position(2, G3)),
                Seventh(C, Position(1, B2))
        )

        chords[D_MINOR] = Triad(
                D_MINOR,
                0,
                Fundamental(D, Position(0, D4)),
                Third(F, Position(1, E1)),
                Fifth(A, Position(2, G3)),
                listOf(
                        ChordNote(D, Position(3, B2))
                )
        )

        chords[D_DIMINISHED] = Triad(
                D_DIMINISHED,
                5,
                Fundamental(D, Position(5, A5)),
                Third(F, Position(6, B2)),
                Fifth(A_FLAT, Position(6, D4)),
                listOf(
                        ChordNote(D, Position(7, G3))
                )
        )

        chords[D_HALF_DIMINISHED] = Tetrad(
                D_HALF_DIMINISHED,
                5,
                Fundamental(D, Position(5, A5)),
                Third(F, Position(6, B2)),
                Fifth(A_FLAT, Position(6, D4)),
                Seventh(C, Position(5, G3))
        )

        chords[D_MAJOR_7M] = Tetrad(
                D_MAJOR_7M,
                0,
                Fundamental(D, Position(0, D4)),
                Third(F_SHARP, Position(2, E1)),
                Fifth(A, Position(2, G3)),
                Seventh(C_SHARP, Position(2, B2))
        )

        chords[D_MAJOR] = Triad(
                D_MAJOR,
                0,
                Fundamental(D, Position(0, D4)),
                Third(F_SHARP, Position(2, E1)),
                Fifth(A, Position(2, G3)),
                listOf(
                        ChordNote(D, Position(3, B2))
                )
        )

        chords[D_MINOR_7M] = Tetrad(
                D_MINOR_7M,
                0,
                Fundamental(D, Position(0, D4)),
                Third(F, Position(1, E1)),
                Fifth(A, Position(2, G3)),
                Seventh(C_SHARP, Position(2, B2))
        )

        chords[D_DIMINISHED_TETRAD] = Tetrad(
                D_DIMINISHED_TETRAD,
                4,
                Fundamental(D, Position(5, A5)),
                Third(F, Position(6, B2)),
                Fifth(A_FLAT, Position(6, D4)),
                Seventh(C_FLAT, Position(4, G3))
        )

        chords[D_MAJOR_7M_AND_5_AUGMENTED] = Tetrad(
                D_MAJOR_7M_AND_5_AUGMENTED,
                2,
                Fundamental(D, Position(5, A5)),
                Third(F_SHARP, Position(4, D4)),
                Fifth(A_SHARP, Position(3, G3)),
                Seventh(C_SHARP, Position(2, B2))
        )

        chords[D_MAJOR_5_AUGMENTED] = Triad(
                D_MAJOR_5_AUGMENTED,
                3,
                Fundamental(D, Position(5, A5)),
                Third(F_SHARP, Position(4, D4)),
                Fifth(A_SHARP, Position(3, G3)),
                listOf(
                        ChordNote(D, Position(3, B2))
                )
        )

        chords[D_MAJOR_7] = Tetrad(
                D_MAJOR_7,
                0,
                Fundamental(D, Position(0, D4)),
                Third(F_SHARP, Position(2, E1)),
                Fifth(A, Position(2, G3)),
                Seventh(C, Position(1, B2))
        )

        // D#

        chords[D_SHARP_HALF_DIMINISHED] = Tetrad(
                D_SHARP_HALF_DIMINISHED,
                1,
                Fundamental(D_SHARP, Position(1, D4)),
                Third(F_SHARP, Position(2, E1)),
                Fifth(A, Position(2, G3)),
                Seventh(C_SHARP, Position(2, B2))
        )

        chords[D_SHARP_DIMINISHED] = Triad(
                D_SHARP_DIMINISHED,
                6,
                Fundamental(D_SHARP, Position(6, A5)),
                Third(F_SHARP, Position(7, B2)),
                Fifth(A, Position(7, D4)),
                listOf(
                        ChordNote(D_SHARP, Position(8, G3))
                )
        )

        chords[D_SHARP_DIMINISHED_TETRAD] = Tetrad(
                D_SHARP_DIMINISHED_TETRAD,
                5,
                Fundamental(D_SHARP, Position(6, A5)),
                Third(F_SHARP, Position(7, B2)),
                Fifth(A, Position(7, D4)),
                Seventh(C, Position(5, G3))
        )

        chords[D_SHARP_MINOR_7] = Tetrad(
                D_SHARP_MINOR_7,
                6,
                Fundamental(D_SHARP, Position(6, A5)),
                Third(F_SHARP, Position(7, B2)),
                Fifth(A_SHARP, Position(8, D4)),
                Seventh(C_SHARP, Position(6, G3)),
                listOf(
                        ChordNote(A_SHARP, Position(6, E1))
                ),
                true
        )

        chords[D_SHARP_MINOR] = Triad(
                D_SHARP_MINOR,
                6,
                Fundamental(D_SHARP, Position(6, A5)),
                Third(F_SHARP, Position(7, B2)),
                Fifth(A_SHARP, Position(8, D4)),
                listOf(
                        ChordNote(D_SHARP, Position(8, G3)),
                        ChordNote(A_SHARP, Position(6, E1))
                ),
                true
        )

        return chords
    }
}