package com.luan.harmony.domain.chord.repository.prototype

import com.luan.harmony.domain.chord.model.Chord
import com.luan.harmony.domain.chord.model.Chord.Name.*
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position.StringName.*

class APrototype {

    fun loadChords(): MutableMap<Chord.Name, Chord> {
        val chords: MutableMap<Chord.Name, Chord> = mutableMapOf()
        // Ab

        chords[A_FLAT_MAJOR_7M] = Tetrad(
                A_FLAT_MAJOR_7M,
                4,
                Fundamental(A_FLAT, Position(4, E6)),
                Third(C, Position(5, G3)),
                Fifth(E_FLAT, Position(4, B2)),
                Seventh(G, Position(5, D4))
        )

        chords[A_FLAT_MAJOR] = Triad(
                A_FLAT_MAJOR,
                4,
                Fundamental(A_FLAT, Position(4, E6)),
                Third(C, Position(5, G3)),
                Fifth(E_FLAT, Position(6, A5)),
                listOf(
                        ChordNote(A_FLAT, Position(6, D4)),
                        ChordNote(E_FLAT, Position(4, B2)),
                        ChordNote(A_FLAT, Position(4, E1))
                ),
                true
        )

        chords[A_FLAT_MAJOR_7] = Tetrad(
                A_FLAT_MAJOR_7,
                4,
                Fundamental(A_FLAT, Position(4, E6)),
                Third(C, Position(5, G3)),
                Fifth(E_FLAT, Position(6, A5)),
                Seventh(G_FLAT, Position(4, D4)),
                listOf(
                        ChordNote(E_FLAT, Position(4, B2)),
                        ChordNote(A_FLAT, Position(4, E1))
                ),
                true
        )

        chords[A_FLAT_MINOR_7] = Tetrad(
                A_FLAT_MINOR_7,
                4,
                Fundamental(A_FLAT, Position(4, E6)),
                Third(C_FLAT, Position(4, G3)),
                Fifth(E_FLAT, Position(4, B2)),
                Seventh(G_FLAT, Position(4, D4))
        )

        chords[A_FLAT_MINOR] = Triad(
                A_FLAT_MINOR,
                4,
                Fundamental(A_FLAT, Position(4, E6)),
                Third(C_FLAT, Position(4, G3)),
                Fifth(E_FLAT, Position(6, A5)),
                listOf(
                        ChordNote(A_FLAT, Position(6, D4)),
                        ChordNote(E_FLAT, Position(4, B2)),
                        ChordNote(A_FLAT, Position(4, E1))
                ),
                true
        )

        chords[A_FLAT_MAJOR_7M_AND_5_AUGMENTED] = Tetrad(
                A_FLAT_MAJOR_7M_AND_5_AUGMENTED,
                4,
                Fundamental(A_FLAT, Position(4, E6)),
                Third(C, Position(5, G3)),
                Fifth(E, Position(5, B2)),
                Seventh(G, Position(5, D4))
        )

        chords[A_FLAT_MAJOR_5_AUGMENTED] = Triad(
                A_FLAT_MAJOR_5_AUGMENTED,
                4,
                Fundamental(A_FLAT, Position(4, E6)),
                Third(C, Position(5, G3)),
                Fifth(E, Position(5, B2)),
                listOf(
                        ChordNote(A_FLAT, Position(6, D4))
                )
        )

        chords[A_FLAT_HALF_DIMINISHED] = Tetrad(
                A_FLAT_HALF_DIMINISHED,
                3,
                Fundamental(A_FLAT, Position(4, E6)),
                Third(C_FLAT, Position(4, G3)),
                Fifth(E_DOUBLE_FLAT, Position(3, B2)),
                Seventh(G_FLAT, Position(4, D4))
        )

        chords[A_FLAT_DIMINISHED] = Triad(
                A_FLAT_DIMINISHED,
                4,
                Fundamental(A_FLAT, Position(4, E6)),
                Third(C_FLAT, Position(4, G3)),
                Fifth(E_DOUBLE_FLAT, Position(5, A5)),
                listOf(
                        ChordNote(A_FLAT, Position(6, D4))
                )
        )

        chords[A_FLAT_MINOR_7M] = Tetrad(
                A_FLAT_MINOR_7M,
                4,
                Fundamental(A_FLAT, Position(4, E6)),
                Third(C_FLAT, Position(4, G3)),
                Fifth(E_FLAT, Position(4, B2)),
                Seventh(G, Position(5, D4))
        )

        // A

        chords[A_MINOR_7] = Tetrad(
                A_MINOR_7,
                0,
                Fundamental(A, Position(0, A5)),
                Third(C, Position(1, B2)),
                Fifth(E, Position(2, D4)),
                Seventh(G, Position(0, G3)),
                listOf(
                        ChordNote(E, Position(0, E1)))
        )

        chords[A_MINOR] = Triad(
                A_MINOR,
                0,
                Fundamental(A, Position(0, A5)),
                Third(C, Position(1, B2)),
                Fifth(E, Position(2, D4)),
                listOf(
                        ChordNote(E, Position(0, E1)),
                        ChordNote(A, Position(2, G3)))
        )

        chords[A_HALF_DIMINISHED] = Tetrad(
                A_HALF_DIMINISHED,
                4,
                Fundamental(A, Position(5, E6)),
                Third(C, Position(5, G3)),
                Fifth(E_FLAT, Position(4, B2)),
                Seventh(G, Position(5, D4))
        )

        chords[A_DIMINISHED] = Triad(
                A_DIMINISHED,
                0,
                Fundamental(A, Position(0, A5)),
                Third(C, Position(1, B2)),
                Fifth(E_FLAT, Position(1, D4)),
                listOf(
                        ChordNote(A, Position(2, G3))
                )
        )

        chords[A_MAJOR_7] = Tetrad(
                A_MAJOR_7,
                0,
                Fundamental(A, Position(0, A5)),
                Third(C_SHARP, Position(2, B2)),
                Fifth(E, Position(2, D4)),
                Seventh(G, Position(0, G3)),
                listOf(
                        ChordNote(E, Position(0, E1))
                )
        )

        chords[A_MAJOR] = Triad(
                A_MAJOR,
                0,
                Fundamental(A, Position(0, A5)),
                Third(C_SHARP, Position(2, B2)),
                Fifth(E, Position(2, D4)),
                listOf(
                        Seventh(A, Position(2, G3)),
                        ChordNote(E, Position(0, E1))
                )
        )

        chords[A_MAJOR_7M] = Tetrad(
                A_MAJOR_7M,
                0,
                Fundamental(A, Position(0, A5)),
                Third(C_SHARP, Position(2, B2)),
                Fifth(E, Position(2, D4)),
                Seventh(G_SHARP, Position(1, G3)),
                listOf(
                        ChordNote(E, Position(0, E1))
                )
        )

        chords[A_MINOR_7M] = Tetrad(
                A_MINOR_7M,
                0,
                Fundamental(A, Position(0, A5)),
                Third(C, Position(1, B2)),
                Fifth(E, Position(2, D4)),
                Seventh(G_SHARP, Position(1, G3)),
                listOf(
                        ChordNote(E, Position(0, E1))
                )
        )

        chords[A_DIMINISHED_TETRAD] = Tetrad(
                A_DIMINISHED_TETRAD,
                4,
                Fundamental(A, Position(5, E6)),
                Third(C, Position(5, G3)),
                Fifth(E_FLAT, Position(4, B2)),
                Seventh(G_FLAT, Position(4, D4))
        )

        // A#

        chords[A_SHARP_HALF_DIMINISHED] = Tetrad(
                A_SHARP_HALF_DIMINISHED,
                1,
                Fundamental(A_SHARP, Position(1, A5)),
                Third(C_SHARP, Position(2, B2)),
                Fifth(E, Position(2, D4)),
                Seventh(G_SHARP, Position(1, G3))
        )

        chords[A_SHARP_DIMINISHED] = Triad(
                A_SHARP_DIMINISHED,
                1,
                Fundamental(A_SHARP, Position(1, A5)),
                Third(C_SHARP, Position(2, B2)),
                Fifth(E, Position(2, D4)),
                listOf(
                        ChordNote(A_SHARP, Position(3, G3))
                )
        )

        chords[A_SHARP_DIMINISHED_TETRAD] = Tetrad(
                A_SHARP_DIMINISHED_TETRAD,
                0,
                Fundamental(A_SHARP, Position(1, A5)),
                Third(C_SHARP, Position(2, B2)),
                Fifth(E, Position(2, D4)),
                Seventh(G, Position(0, G3))
        )

        return chords
    }
}