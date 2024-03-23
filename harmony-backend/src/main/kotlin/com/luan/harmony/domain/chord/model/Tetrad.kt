package com.luan.harmony.domain.chord.model

import com.luan.harmony.domain.chord.model.note.*
import com.luan.harmony.domain.chord.model.shape.DefaultShape

class Tetrad constructor(
        symbol: Name,
        startFret: Int,
        fundamental: Fundamental,
        third: Third,
        fifth: Fifth,
        seventh: Seventh,
        complementaryNotes: List<ChordNote> = listOf(),
        isBarre: Boolean = false
) : Chord(symbol.symbol) {

    init {
        val shape = DefaultShape(startFret, isBarre)
                .addNote(fundamental)
                .addNote(third)
                .addNote(fifth)
                .addNote(seventh)

        if (complementaryNotes.isNotEmpty()) {
            complementaryNotes.forEach { shape.addNote(it) }
        }

        this.addShape(shape)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}