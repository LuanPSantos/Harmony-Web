package com.luan.harmony.domain.chord.repository.prototype

import com.luan.harmony.domain.chord.model.Chord
import com.luan.harmony.domain.chord.model.Chord.Name.*
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position.StringName.*

class CPrototype {

    fun loadChords(): MutableMap<Chord.Name, Chord> {
        val chords: MutableMap<Chord.Name, Chord> = mutableMapOf()

        chords[C_FLAT_MAJOR_7] = Tetrad(
                C_FLAT_MAJOR_7,
                2,
                Fundamental(C_FLAT, Position(2, A5)),
                Third(E_FLAT, Position(4, B2)),
                Fifth(G_FLAT, Position(4, D4)),
                Seventh(B_DOUBLE_FLAT, Position(2, G3)),
                listOf(
                        ChordNote(G_FLAT, Position(2, E1))
                ),
                true
        )

        chords[C_FLAT_MAJOR] = Triad(
                C_FLAT_MAJOR,
                2,
                Fundamental(C_FLAT, Position(2, A5)),
                Third(E_FLAT, Position(4, B2)),
                Fifth(G_FLAT, Position(4, D4)),
                listOf(
                        ChordNote(C_FLAT, Position(4, G3)),
                        ChordNote(G_FLAT, Position(2, E1))
                ),
                true
        )

        chords[C_FLAT_MAJOR_7M] = Tetrad(
                C_FLAT_MAJOR_7M,
                2,
                Fundamental(C_FLAT, Position(2, A5)),
                Third(E_FLAT, Position(4, B2)),
                Fifth(G_FLAT, Position(4, D4)),
                Seventh(B_FLAT, Position(3, G3)),
                listOf(
                        ChordNote(G_FLAT, Position(2, E1))
                ),
                true
        )

        chords[C_FLAT_MINOR] = Triad(
                C_FLAT_MINOR,
                2,
                Fundamental(C_FLAT, Position(2, A5)),
                Third(E_DOUBLE_FLAT, Position(3, B2)),
                Fifth(G_FLAT, Position(4, D4)),
                listOf(
                        ChordNote(C_FLAT, Position(4, G3)),
                        ChordNote(G_FLAT, Position(2, E1))
                ),
                true
        )

        chords[C_FLAT_MAJOR_7M_AND_5_AUGMENTED] = Tetrad(
                C_FLAT_MAJOR_7M_AND_5_AUGMENTED,
                7,
                Fundamental(C_FLAT, Position(7, E6)),
                Third(E_FLAT, Position(8, G3)),
                Fifth(G, Position(8, B2)),
                Seventh(B_FLAT, Position(8, D4))
        )

        chords[C_FLAT_MAJOR_5_AUGMENTED] = Triad(
                C_FLAT_MAJOR_5_AUGMENTED,
                7,
                Fundamental(C_FLAT, Position(7, E6)),
                Third(E_FLAT, Position(8, G3)),
                Fifth(G, Position(8, B2)),
                listOf(
                        ChordNote(C_FLAT, Position(9, D4))
                )
        )

        chords[C_FLAT_MINOR_7] = Tetrad(
                C_FLAT_MINOR_7,
                2,
                Fundamental(C_FLAT, Position(2, A5)),
                Third(E_DOUBLE_FLAT, Position(3, B2)),
                Fifth(G_FLAT, Position(4, D4)),
                Seventh(B_DOUBLE_FLAT, Position(2, G3)),
                listOf(
                        ChordNote(G_FLAT, Position(2, E1))
                ),
                true
        )

        // C

        chords[C_MAJOR_7M] = Tetrad(
                C_MAJOR_7M,
                0,
                Fundamental(C, Position(3, A5)),
                Third(E, Position(2, D4)),
                Fifth(G, Position(0, G3)),
                Seventh(B, Position(0, B2)),
                listOf(
                        ChordNote(E, Position(0, E1))
                )
        )

        chords[C_MAJOR] = Triad(
                C_MAJOR,
                0,
                Fundamental(C, Position(3, A5)),
                Third(E, Position(2, D4)),
                Fifth(G, Position(0, G3)),
                listOf(
                        ChordNote(C, Position(1, B2)),
                        ChordNote(E, Position(0, E1))
                )
        )

        chords[C_MINOR_7] = Tetrad(
                C_MINOR_7,
                3,
                Fundamental(C, Position(3, A5)),
                Third(E_FLAT, Position(4, B2)),
                Fifth(G, Position(5, D4)),
                Seventh(B_FLAT, Position(3, G3)),
                listOf(
                        ChordNote(G, Position(3, E1))
                ),
                true
        )

        chords[C_MINOR] = Triad(
                C_MINOR,
                3,
                Fundamental(C, Position(3, A5)),
                Third(E_FLAT, Position(4, B2)),
                Fifth(G, Position(5, D4)),
                listOf(
                        ChordNote(G, Position(3, E1)),
                        ChordNote(C, Position(5, G3))
                ),
                true
        )

        chords[C_MINOR_7M] = Tetrad(
                C_MINOR_7M,
                3,
                Fundamental(C, Position(3, A5)),
                Third(E_FLAT, Position(4, B2)),
                Fifth(G, Position(5, D4)),
                Seventh(B, Position(4, G3)),
                listOf(
                        ChordNote(G, Position(3, E1))
                ),
                true
        )

        chords[C_HALF_DIMINISHED] = Tetrad(
                C_HALF_DIMINISHED,
                3,
                Fundamental(C, Position(3, A5)),
                Third(E_FLAT, Position(4, B2)),
                Fifth(G_FLAT, Position(4, D4)),
                Seventh(B_FLAT, Position(3, G3))
        )

        chords[C_DIMINISHED] = Triad(
                C_DIMINISHED,
                3,
                Fundamental(C, Position(3, A5)),
                Third(E_FLAT, Position(4, B2)),
                Fifth(G_FLAT, Position(4, D4)),
                listOf(
                        ChordNote(C, Position(5, G3))
                )
        )

        chords[C_DIMINISHED_TETRAD] = Tetrad(
                C_DIMINISHED_TETRAD,
                2,
                Fundamental(C, Position(3, A5)),
                Third(E_FLAT, Position(4, B2)),
                Fifth(G_FLAT, Position(4, D4)),
                Seventh(B_DOUBLE_FLAT, Position(2, G3))
        )

        chords[C_MAJOR_7M_AND_5_AUGMENTED] = Tetrad(
                C_MAJOR_7M_AND_5_AUGMENTED,
                0,
                Fundamental(C, Position(3, A5)),
                Third(E, Position(2, D4)),
                Fifth(G_SHARP, Position(1, G3)),
                Seventh(B, Position(0, B2)),
                listOf(
                        ChordNote(E, Position(0, E1))
                )
        )

        chords[C_MAJOR_5_AUGMENTED] = Triad(
                C_MAJOR_5_AUGMENTED,
                0,
                Fundamental(C, Position(3, A5)),
                Third(E, Position(2, D4)),
                Fifth(G_SHARP, Position(1, G3)),
                listOf(
                        ChordNote(C, Position(1, B2)),
                        ChordNote(E, Position(0, E1))
                )
        )

        chords[C_MAJOR_7] = Tetrad(
                C_MAJOR_7,
                3,
                Fundamental(C, Position(3, A5)),
                Third(E, Position(5, B2)),
                Fifth(G, Position(5, D4)),
                Seventh(B_FLAT, Position(3, G3)),
                listOf(
                        ChordNote(G, Position(3, E1))
                ),
                true
        )

        // C#

        chords[C_SHARP_HALF_DIMINISHED] = Tetrad(
                C_SHARP_HALF_DIMINISHED,
                4,
                Fundamental(C_SHARP, Position(4, A5)),
                Third(E, Position(5, B2)),
                Fifth(G, Position(5, D4)),
                Seventh(B, Position(4, G3))
        )

        chords[C_SHARP_DIMINISHED] = Triad(
                C_SHARP_DIMINISHED,
                4,
                Fundamental(C_SHARP, Position(4, A5)),
                Third(E, Position(5, B2)),
                Fifth(G, Position(5, D4)),
                listOf(
                        ChordNote(C_SHARP, Position(6, G3))
                )
        )

        chords[C_SHARP_DIMINISHED_TETRAD] = Tetrad(
                C_SHARP_DIMINISHED_TETRAD,
                3,
                Fundamental(C_SHARP, Position(4, A5)),
                Third(E, Position(5, B2)),
                Fifth(G, Position(5, D4)),
                Seventh(B_FLAT, Position(3, G3))
        )

        chords[C_SHARP_MINOR_7] = Tetrad(
                C_SHARP_MINOR_7,
                4,
                Fundamental(C_SHARP, Position(4, A5)),
                Third(E, Position(5, B2)),
                Fifth(G_SHARP, Position(6, D4)),
                Seventh(B, Position(4, G3)),
                listOf(
                        ChordNote(G_SHARP, Position(4, E1))
                ),
                true
        )

        chords[C_SHARP_MINOR] = Triad(
                C_SHARP_MINOR,
                4,
                Fundamental(C_SHARP, Position(4, A5)),
                Third(E, Position(5, B2)),
                Fifth(G_SHARP, Position(6, D4)),
                listOf(
                        ChordNote(C_SHARP, Position(6, G3)),
                        ChordNote(G_SHARP, Position(4, E1))
                ),
                true
        )

        return chords
    }
}