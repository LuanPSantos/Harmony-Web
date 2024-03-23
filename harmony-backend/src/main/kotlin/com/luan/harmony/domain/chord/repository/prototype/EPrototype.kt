package com.luan.harmony.domain.chord.repository.prototype

import com.luan.harmony.domain.chord.model.Chord
import com.luan.harmony.domain.chord.model.Chord.Name.*
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position.StringName.*

class EPrototype {

    fun loadChords(): MutableMap<Chord.Name, Chord> {
        val chords: MutableMap<Chord.Name, Chord> = mutableMapOf()
        // Eb

        chords[E_FLAT_MAJOR] = Triad(
                E_FLAT_MAJOR,
                6,
                Fundamental(E_FLAT, Position(6, A5)),
                Third(G, Position(8, B2)),
                Fifth(B_FLAT, Position(8, D4)),
                listOf(
                        ChordNote(E_FLAT, Position(8, G3)),
                        ChordNote(B_FLAT, Position(6, E1))
                ),
                true
        )

        chords[E_FLAT_MAJOR_7M] = Tetrad(
                E_FLAT_MAJOR_7M,
                6,
                Fundamental(E_FLAT, Position(6, A5)),
                Third(G, Position(8, B2)),
                Fifth(B_FLAT, Position(8, D4)),
                Seventh(D, Position(7, G3)),
                listOf(
                        ChordNote(B_FLAT, Position(6, E1))
                ),
                true
        )

        chords[E_FLAT_MAJOR_5_AUGMENTED] = Triad(
                E_FLAT_MAJOR_5_AUGMENTED,
                4,
                Fundamental(E_FLAT, Position(6, A5)),
                Third(G, Position(5, D4)),
                Fifth(B, Position(4, G3)),
                listOf(
                        ChordNote(E_FLAT, Position(4, B2))
                )
        )

        chords[E_FLAT_MAJOR_7M_AND_5_AUGMENTED] = Tetrad(
                E_FLAT_MAJOR_7M_AND_5_AUGMENTED,
                3,
                Fundamental(E_FLAT, Position(6, A5)),
                Third(G, Position(5, D4)),
                Fifth(B, Position(4, G3)),
                Seventh(D, Position(3, B2))
        )

        chords[E_FLAT_MINOR_7] = Tetrad(
                E_FLAT_MINOR_7,
                6,
                Fundamental(E_FLAT, Position(6, A5)),
                Third(G_FLAT, Position(7, B2)),
                Fifth(B_FLAT, Position(8, D4)),
                Seventh(D_FLAT, Position(6, G3)),
                listOf(
                        ChordNote(B_FLAT, Position(6, E1))
                ),
                true
        )

        chords[E_FLAT_MINOR] = Triad(
                E_FLAT_MINOR,
                6,
                Fundamental(E_FLAT, Position(6, A5)),
                Third(G_FLAT, Position(7, B2)),
                Fifth(B_FLAT, Position(8, D4)),
                listOf(
                        ChordNote(E_FLAT, Position(8, G3)),
                        ChordNote(B_FLAT, Position(6, E1))
                ),
                true
        )

        chords[E_FLAT_HALF_DIMINISHED] = Tetrad(
                E_FLAT_HALF_DIMINISHED,
                6,
                Fundamental(E_FLAT, Position(6, A5)),
                Third(G_FLAT, Position(7, B2)),
                Fifth(B_DOUBLE_FLAT, Position(7, D4)),
                Seventh(D_FLAT, Position(6, G3))
        )

        chords[E_FLAT_DIMINISHED] = Triad(
                E_FLAT_DIMINISHED,
                6,
                Fundamental(E_FLAT, Position(6, A5)),
                Third(G_FLAT, Position(7, B2)),
                Fifth(B_DOUBLE_FLAT, Position(7, D4)),
                listOf(
                        ChordNote(E_FLAT, Position(8, G3))
                )
        )

        chords[E_FLAT_MINOR_7M] = Tetrad(
                E_FLAT_MINOR_7M,
                6,
                Fundamental(E_FLAT, Position(6, A5)),
                Third(G_FLAT, Position(7, B2)),
                Fifth(B_FLAT, Position(8, D4)),
                Seventh(D, Position(7, G3)),
                listOf(
                        ChordNote(B_FLAT, Position(6, E1))
                ),
                true
        )

        chords[E_DOUBLE_FLAT_MAJOR_7M] = Tetrad(
                E_DOUBLE_FLAT_MAJOR_7M,
                0,
                Fundamental(E_DOUBLE_FLAT, Position(0, D4)),
                Third(G_FLAT, Position(2, E1)),
                Fifth(B_DOUBLE_FLAT, Position(2, G3)),
                Seventh(D_FLAT, Position(2, B2))
        )

        chords[E_DOUBLE_FLAT_MAJOR] = Triad(
                E_DOUBLE_FLAT_MAJOR,
                0,
                Fundamental(E_DOUBLE_FLAT, Position(0, D4)),
                Third(G_FLAT, Position(2, E1)),
                Fifth(B_DOUBLE_FLAT, Position(2, G3)),
                listOf(
                        ChordNote(E_DOUBLE_FLAT, Position(3, B2))
                )
        )

        // E

        chords[E_MINOR_7] = Tetrad(
                E_MINOR_7,
                0,
                Fundamental(E, Position(0, E6)),
                Third(G, Position(0, G3)),
                Fifth(B, Position(2, A5)),
                Seventh(D, Position(3, B2)),
                listOf(
                        ChordNote(E, Position(0, E1)),
                        ChordNote(E, Position(2, D4)))
        )

        chords[E_MINOR] = Triad(
                E_MINOR,
                0,
                Fundamental(E, Position(0, E6)),
                Third(G, Position(0, G3)),
                Fifth(B, Position(2, A5)),
                listOf(
                        ChordNote(E, Position(0, E1)),
                        ChordNote(B, Position(0, B2)),
                        ChordNote(E, Position(2, D4)))
        )

        chords[E_HALF_DIMINISHED] = Tetrad(
                E_HALF_DIMINISHED,
                2,
                Fundamental(E, Position(2, D4)),
                Third(G, Position(3, E1)),
                Fifth(B_FLAT, Position(3, G3)),
                Seventh(D, Position(3, B2))
        )

        chords[E_DIMINISHED] = Triad(
                E_DIMINISHED,
                7,
                Fundamental(E, Position(7, A5)),
                Third(G, Position(8, B2)),
                Fifth(B_FLAT, Position(8, D4)),
                listOf(
                        ChordNote(E, Position(9, G3))
                )
        )

        chords[E_MAJOR_7M] = Tetrad(
                E_MAJOR_7M,
                0,
                Fundamental(E, Position(0, E6)),
                Third(G_SHARP, Position(1, G3)),
                Fifth(B, Position(2, A5)),
                Seventh(D_SHARP, Position(1, D4)),
                listOf(
                        ChordNote(B, Position(0, B2)),
                        ChordNote(E, Position(0, E1))
                )
        )

        chords[E_MAJOR] = Triad(
                E_MAJOR,
                0,
                Fundamental(E, Position(0, E6)),
                Third(G_SHARP, Position(1, G3)),
                Fifth(B, Position(2, A5)),
                listOf(
                        ChordNote(B, Position(0, B2)),
                        ChordNote(E, Position(0, E1)),
                        ChordNote(E, Position(2, D4))
                )
        )

        chords[E_MINOR_7M] = Tetrad(
                E_MINOR_7M,
                0,
                Fundamental(E, Position(0, E6)),
                Third(G, Position(0, G3)),
                Fifth(B, Position(2, A5)),
                Seventh(D_SHARP, Position(1, D4)),
                listOf(
                        ChordNote(B, Position(0, B2)),
                        ChordNote(E, Position(0, E1))
                )
        )

        chords[E_DIMINISHED_TETRAD] = Tetrad(
                E_DIMINISHED_TETRAD,
                2,
                Fundamental(E, Position(2, D4)),
                Third(G, Position(3, E1)),
                Fifth(B_FLAT, Position(3, G3)),
                Seventh(D_FLAT, Position(2, B2))
        )

        chords[E_MAJOR_7] = Tetrad(
                E_MAJOR_7,
                0,
                Fundamental(E, Position(0, E6)),
                Third(G_SHARP, Position(1, G3)),
                Fifth(B, Position(2, A5)),
                Seventh(D, Position(0, D4)),
                listOf(
                        ChordNote(B, Position(0, B2)),
                        ChordNote(E, Position(0, E1))
                )
        )

        chords[E_FLAT_MAJOR_7] = Tetrad(
                E_FLAT_MAJOR_7,
                6,
                Fundamental(E_FLAT, Position(6, A5)),
                Third(G, Position(8, B2)),
                Fifth(B_FLAT, Position(8, D4)),
                Seventh(D_FLAT, Position(6, G3)),
                listOf(
                        ChordNote(B_FLAT, Position(6, E1))
                ),
                true
        )

        return chords
    }
}