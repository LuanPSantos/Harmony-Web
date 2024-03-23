package com.luan.harmony.domain.tone.harmonicfiled.factory

import com.luan.harmony.domain.chord.model.Tetrad
import com.luan.harmony.domain.chord.model.Triad
import com.luan.harmony.domain.tone.harmonicfiled.*

abstract class HarmonicFieldsFactory {

    fun harmonicFields(): List<HarmonicField> {
        val naturalMajor = NaturalMajor(
                naturalMajorTetrads(),
                naturalMajorTriads()
        )

        val naturalMinor = NaturalMinor(
                naturalMinorTetrads(),
                naturalMinorTriads()
        )

        val harmonicMinor = HarmonicMinor(
                harmonicMinorTetrads(),
                harmonicMinorTriads()
        )

        val melodicMinor = MelodicMinor(
                melodicMinorTetrads(),
                melodicMinorTriads()
        )

        return listOf(
                naturalMajor,
                naturalMinor,
                harmonicMinor,
                melodicMinor
        )
    }

    abstract fun naturalMajorTetrads(): List<Tetrad>

    abstract fun naturalMajorTriads(): List<Triad>

    abstract fun naturalMinorTetrads(): List<Tetrad>

    abstract fun naturalMinorTriads(): List<Triad>

    abstract fun harmonicMinorTetrads(): List<Tetrad>

    abstract fun harmonicMinorTriads(): List<Triad>

    abstract fun melodicMinorTetrads(): List<Tetrad>

    abstract fun melodicMinorTriads(): List<Triad>
}