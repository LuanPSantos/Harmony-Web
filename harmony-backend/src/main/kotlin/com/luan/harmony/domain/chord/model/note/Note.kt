package com.luan.harmony.domain.chord.model.note

abstract class Note(
        val value: String,
        val position: Position
) {

    enum class Value(val symbol: String) {
        C_FLAT("Cb"),
        C("C"),
        C_SHARP("C#"),
        D_FLAT("Db"),
        D("D"),
        D_SHARP("D#"),
        E_DOUBLE_FLAT("Ebb"),
        E_FLAT("Eb"),
        E("E"),
        F_FLAT("Fb"),
        F("F"),
        F_SHARP("F#"),
        G_FLAT("Gb"),
        G_SHARP("G#"),
        G("G"),
        A_FLAT("Ab"),
        A("A"),
        A_SHARP("A#"),
        B_DOUBLE_FLAT("Bbb"),
        B_FLAT("Bb"),
        B("B")
    }

    override fun equals(other: Any?): Boolean {
        other as Note

        if (value != other.value) return false
        if (position != other.position) return false

        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}