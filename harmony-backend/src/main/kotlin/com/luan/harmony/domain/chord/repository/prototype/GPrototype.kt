package com.luan.harmony.domain.chord.repository.prototype

import com.luan.harmony.domain.chord.model.Chord
import com.luan.harmony.domain.chord.model.Chord.Name.*
import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.note.Position.StringName.*

class GPrototype {

    fun loadChords(): MutableMap<Chord.Name, Chord> {
        val chords: MutableMap<Chord.Name, Chord> = mutableMapOf()
        // Gb

        chords[G_FLAT_MAJOR_7M] = Tetrad(
                G_FLAT_MAJOR_7M,
                2,
                Fundamental(G_FLAT, Position(2, E6)),
                Third(B_FLAT, Position(3, G3)),
                Fifth(D_FLAT, Position(2, B2)),
                Seventh(F, Position(3, D4))
        )

        chords[G_FLAT_MAJOR] = Triad(
                G_FLAT_MAJOR,
                2,
                Fundamental(G_FLAT, Position(2, E6)),
                Third(B_FLAT, Position(3, G3)),
                Fifth(D_FLAT, Position(4, A5)),
                listOf(
                        ChordNote(G_FLAT, Position(4, D4)),
                        ChordNote(G_FLAT, Position(2, E1)),
                        ChordNote(D_FLAT, Position(2, B2))
                ),
                true
        )

        chords[G_FLAT_MINOR_7] = Tetrad(
                G_FLAT_MINOR_7,
                2,
                Fundamental(G_FLAT, Position(2, E6)),
                Third(B_DOUBLE_FLAT, Position(2, G3)),
                Fifth(D_FLAT, Position(2, B2)),
                Seventh(F_FLAT, Position(2, D4))
        )

        chords[G_FLAT_MINOR] = Triad(
                G_FLAT_MINOR,
                2,
                Fundamental(G_FLAT, Position(2, E6)),
                Third(B_DOUBLE_FLAT, Position(2, G3)),
                Fifth(D_FLAT, Position(4, A5)),
                listOf(
                        ChordNote(G_FLAT, Position(4, D4)),
                        ChordNote(D_FLAT, Position(2, B2)),
                        ChordNote(G_FLAT, Position(2, E1))
                )
        )

        chords[G_FLAT_MAJOR_7] = Tetrad(
                G_FLAT_MAJOR_7,
                2,
                Fundamental(G_FLAT, Position(2, E6)),
                Third(B_FLAT, Position(3, G3)),
                Fifth(D_FLAT, Position(4, A5)),
                Seventh(F_FLAT, Position(2, D4)),
                listOf(
                        ChordNote(D_FLAT, Position(2, B2)),
                        ChordNote(G_FLAT, Position(2, E1))
                ),
                true
        )

        chords[G_FLAT_MAJOR_7M_AND_5_AUGMENTED] = Tetrad(
                G_FLAT_MAJOR_7M_AND_5_AUGMENTED,
                2,
                Fundamental(G_FLAT, Position(2, E6)),
                Third(B_FLAT, Position(3, G3)),
                Fifth(D, Position(3, B2)),
                Seventh(F, Position(3, D4))
        )

        chords[G_FLAT_MAJOR_5_AUGMENTED] = Triad(
                G_FLAT_MAJOR_5_AUGMENTED,
                2,
                Fundamental(G_FLAT, Position(2, E6)),
                Third(B_FLAT, Position(3, G3)),
                Fifth(D, Position(3, B2)),
                listOf(
                        ChordNote(G_FLAT, Position(4, D4))
                )
        )

        chords[G_FLAT_MINOR_7M] = Tetrad(
                G_FLAT_MINOR_7M,
                2,
                Fundamental(G_FLAT, Position(2, E6)),
                Third(B_DOUBLE_FLAT, Position(2, G3)),
                Fifth(D_FLAT, Position(2, B2)),
                Seventh(F, Position(3, D4))
        )

        // G

        chords[G_MAJOR_7M_AND_5_AUGMENTED] = Tetrad(
                G_MAJOR_7M_AND_5_AUGMENTED,
                3,
                Fundamental(G, Position(3, E6)),
                Third(B, Position(4, G3)),
                Fifth(D_SHARP, Position(4, B2)),
                Seventh(F_SHARP, Position(4, D4))
        )

        chords[G_MAJOR_5_AUGMENTED] = Triad(
                G_MAJOR_5_AUGMENTED,
                3,
                Fundamental(G, Position(3, E6)),
                Third(B, Position(4, G3)),
                Fifth(D_SHARP, Position(4, B2)),
                listOf(
                        ChordNote(G, Position(5, D4))
                )
        )

        chords[G_HALF_DIMINISHED] = Tetrad(
                G_HALF_DIMINISHED,
                2,
                Fundamental(G, Position(3, E6)),
                Third(B_FLAT, Position(3, G3)),
                Fifth(D_FLAT, Position(2, B2)),
                Seventh(F, Position(3, D4))
        )

        chords[G_DIMINISHED] = Triad(
                G_DIMINISHED,
                3,
                Fundamental(G, Position(3, E6)),
                Third(B_FLAT, Position(3, G3)),
                Fifth(D_FLAT, Position(4, A5)),
                listOf(
                        ChordNote(G, Position(5, D4))
                )
        )

        chords[G_MINOR_7M] = Tetrad(
                G_MINOR_7M,
                3,
                Fundamental(G, Position(3, E6)),
                Third(B_FLAT, Position(3, G3)),
                Fifth(D, Position(3, B2)),
                Seventh(F_SHARP, Position(4, D4))
        )

        chords[G_DIMINISHED_TETRAD] = Tetrad(
                G_DIMINISHED_TETRAD,
                2,
                Fundamental(G, Position(3, E6)),
                Third(B_FLAT, Position(3, G3)),
                Fifth(D_FLAT, Position(2, B2)),
                Seventh(F_FLAT, Position(2, D4))
        )

        chords[G_MAJOR_7] = Tetrad(
                G_MAJOR_7,
                0,
                Fundamental(G, Position(3, E6)),
                Third(B, Position(2, A5)),
                Fifth(D, Position(0, D4)),
                Seventh(F, Position(1, E1)),
                listOf(
                        ChordNote(G, Position(0, G3)),
                        ChordNote(B, Position(0, B2)))
        )

        chords[G_MAJOR] = Triad(
                G_MAJOR,
                2,
                Fundamental(G, Position(3, E6)),
                Third(B, Position(2, A5)),
                Fifth(D, Position(0, D4)),
                listOf(
                        ChordNote(G, Position(3, E1)),
                        ChordNote(G, Position(0, G3)),
                        ChordNote(D, Position(3, B2)))
        )

        chords[G_MINOR] = Triad(
                G_MINOR,
                3,
                Fundamental(G, Position(3, E6)),
                Third(B_FLAT, Position(3, G3)),
                Fifth(D, Position(5, A5)),
                listOf(
                        ChordNote(G, Position(5, D4)),
                        ChordNote(G, Position(3, E1)),
                        ChordNote(D, Position(3, B2))
                ),
                true
        )

        chords[G_MINOR_7] = Tetrad(
                G_MINOR_7,
                3,
                Fundamental(G, Position(3, E6)),
                Third(B_FLAT, Position(3, G3)),
                Fifth(D, Position(3, B2)),
                Seventh(F, Position(3, D4))
        )

        chords[G_MAJOR_7M] = Tetrad(
                G_MAJOR_7M,
                3,
                Fundamental(G, Position(3, E6)),
                Third(B, Position(4, G3)),
                Fifth(D, Position(3, B2)),
                Seventh(F_SHARP, Position(4, D4))
        )

        // G#

        chords[G_SHARP_MINOR_7] = Tetrad(
                G_SHARP_MINOR_7,
                4,
                Fundamental(G_SHARP, Position(4, E6)),
                Third(B, Position(4, G3)),
                Fifth(D_SHARP, Position(4, B2)),
                Seventh(F_SHARP, Position(4, D4))
        )

        chords[G_SHARP_MINOR] = Triad(
                G_SHARP_MINOR,
                4,
                Fundamental(G_SHARP, Position(4, E6)),
                Third(B, Position(4, G3)),
                Fifth(D_SHARP, Position(6, A5)),
                listOf(
                        ChordNote(G_SHARP, Position(6, D4)),
                        ChordNote(D_SHARP, Position(4, B2)),
                        ChordNote(G_SHARP, Position(4, E1))
                ),
                true
        )

        chords[G_SHARP_HALF_DIMINISHED] = Tetrad(
                G_SHARP_HALF_DIMINISHED,
                3,
                Fundamental(G_SHARP, Position(4, E6)),
                Third(B, Position(4, G3)),
                Fifth(D, Position(3, B2)),
                Seventh(F_SHARP, Position(4, D4))
        )

        chords[G_SHARP_DIMINISHED] = Triad(
                G_SHARP_DIMINISHED,
                4,
                Fundamental(G_SHARP, Position(4, E6)),
                Third(B, Position(4, G3)),
                Fifth(D, Position(5, A5)),
                listOf(
                        ChordNote(G_SHARP, Position(6, D4))
                )
        )

        chords[G_SHARP_DIMINISHED_TETRAD] = Tetrad(
                G_SHARP_DIMINISHED_TETRAD,
                3,
                Fundamental(G_SHARP, Position(4, E6)),
                Third(B, Position(4, G3)),
                Fifth(D, Position(3, B2)),
                Seventh(F, Position(3, D4))
        )

        return chords
    }
}