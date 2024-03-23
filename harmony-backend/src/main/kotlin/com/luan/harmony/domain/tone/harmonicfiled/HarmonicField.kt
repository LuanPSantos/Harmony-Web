package com.luan.harmony.domain.tone.harmonicfiled

import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad

abstract class HarmonicField(
        val type: Type,
        val tetrads: List<Tetrad>,
        val triads: List<Triad>
) {

    enum class Type {
        NATURAL_MAJOR,
        NATURAL_MINOR,
        HARMONIC_MINOR,
        MELODIC_MINOR
    }

    enum class Grade(val value: String) {
        FIRST("I"),
        SECOND("II"),
        THIRD("III"),
        FORTH("IV"),
        FIFTH("V"),
        SIXTH("VI"),
        SEVENTH("VII");
    }


    override fun toString(): String {
        val tetradsString = tetrads.map { "\n\t\t\t\t${it}" }
        val triadsString = triads.map { "\n\t\t\t\t${it}" }
        return "HarmonicField(\n\t\t\ttype=$type, \n\t\t\ttetrads=$tetradsString, \n\t\t\ttriads=$triadsString)"
    }

    override fun equals(other: Any?): Boolean {
        other as HarmonicField

        if (type != other.type) return false

        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}