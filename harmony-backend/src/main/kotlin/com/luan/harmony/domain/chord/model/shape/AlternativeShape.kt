package com.luan.harmony.domain.chord.model.shape

class AlternativeShape private constructor(
        name: Name,
        startFret: Int,
        isBarre: Boolean
) : Shape(name, startFret, isBarre) {
    constructor(startFret: Int, isBarre: Boolean = false) : this(Name.ALTERNATIVE, startFret, isBarre)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}