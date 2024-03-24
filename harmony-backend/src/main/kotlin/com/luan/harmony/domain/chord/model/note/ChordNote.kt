package com.luan.harmony.domain.chord.model.note

import com.luan.harmony.domain.chord.model.note.Title.UNNAMED

open class ChordNote(
        value: Value,
        position: Position,
        val title: Title = UNNAMED
) : Note(value.symbol, position) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ChordNote

        if (title != other.title) return false

        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return "Note(\n\t\t\t\t\t\t\t\t\ttitle=$title, \n\t\t\t\t\t\t\t\t\tvalue=$value, \n\t\t\t\t\t\t\t\t\tposition=$position)"
    }

}