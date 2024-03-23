package com.luan.harmony.domain.chord.model.note

class Position(
        val fret: Int,
        val stringName: StringName
) {

    enum class StringName {
        E1, B2, G3, D4, A5, E6
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Position

        if (fret != other.fret) return false
        if (stringName != other.stringName) return false

        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    override fun toString(): String {
        return "Position(fret=$fret, stringName=$stringName)"
    }
}