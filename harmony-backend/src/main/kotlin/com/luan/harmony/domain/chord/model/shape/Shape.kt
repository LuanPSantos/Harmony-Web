package com.luan.harmony.domain.chord.model.shape

import com.luan.harmony.domain.chord.model.note.ChordNote

abstract class Shape private constructor(
        val notes: MutableList<ChordNote>,
        val name: Name,
        val startFret: Int,
        val isBarre: Boolean
) {

    protected constructor(name: Name, startFret: Int, isBarre: Boolean)
            : this(mutableListOf(), name, startFret, isBarre) {
    }

    fun addNote(note: ChordNote): Shape {
        if (notes.size < 6) {
            this.notes.add(note)
        }

        return this
    }

    override fun equals(other: Any?): Boolean {
        other as Shape

        if (notes.size != other.notes.size) return false

        for (note in notes) {
            var hasNote = false
            for (otherNote in other.notes) {
                if (note == otherNote) {
                    hasNote = true
                    break
                }
            }

            if (!hasNote) return false
        }

        if (startFret != other.startFret) return false

        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    override fun toString(): String {
        val notesString = notes.map { "\n\t\t\t\t\t\t\t\t${it}" }
        return "Shape(\n\t\t\t\t\t\t\tnotes=$notesString, \n\t\t\t\t\t\t\t\t\tisBarre=$isBarre \n\t\t\t\t\t\t\tname=$name \n\t\t\t\t\t\t\tstartFret=$startFret)"
    }

    enum class Name {
        DEFAULT,
        ALTERNATIVE
    }
}