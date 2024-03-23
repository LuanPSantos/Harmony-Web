package com.luan.harmony.domain.chord.model

import com.luan.harmony.domain.chord.model.note.Note.Value.*
import com.luan.harmony.domain.chord.model.shape.Shape
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Grade

abstract class Chord(
        val symbol: String,
        val shapes: MutableList<Shape> = mutableListOf(),
        var grade: String? = null
) : Cloneable {
    fun <T : Shape> addShape(shape: T): Chord {
        this.shapes.add(shape)
        return this
    }

    fun withGrade(grade: Grade): Chord {
        this.grade = grade.value;
        return this
    }

    public override fun clone(): Chord {
        return super.clone() as Chord
    }

    override fun equals(other: Any?): Boolean {
        other as Chord

        if (grade != other.grade) return false
        if (symbol != other.symbol) return false

        if (shapes.size != other.shapes.size) return false

        for (shape in shapes) {
            var hasShape = false
            for (otherShape in other.shapes) {
                if (shape == otherShape) {
                    hasShape = true
                    break
                }
            }

            if (!hasShape) return false
        }

        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    override fun toString(): String {
        val shapesString = shapes.map { "\n\t\t\t\t\t\t${it}" }
        return "Chord(\n\t\t\t\t\tgrade='$grade', \n\t\t\t\t\tshapes=$shapesString\n)"
    }

    enum class Name(
            val symbol: String
    ) {

        C_FLAT_MAJOR(C_FLAT.symbol),
        C_FLAT_MAJOR_7("${C_FLAT.symbol}7"),
        C_FLAT_MAJOR_7M("${C_FLAT.symbol}7M"),
        C_FLAT_MINOR_7("${C_FLAT.symbol}m7"),
        C_FLAT_MINOR("${C_FLAT.symbol}m"),
        C_FLAT_MAJOR_7M_AND_5_AUGMENTED("${C_FLAT.symbol}7M(#5)"),
        C_FLAT_MAJOR_5_AUGMENTED("${C_FLAT.symbol}(#5)"),

        C_HALF_DIMINISHED("${C.symbol}m7(b5)"),
        C_MAJOR_7M("${C.symbol}7M"),
        C_MAJOR(C.symbol),
        C_MINOR("${C.symbol}m"),
        C_MINOR_7("${C.symbol}m7"),
        C_MINOR_7M("${C.symbol}m7M"),
        C_DIMINISHED("${C.symbol}°"),
        C_DIMINISHED_TETRAD("${C.symbol}°"),
        C_MAJOR_7("${C.symbol}7"),
        C_MAJOR_7M_AND_5_AUGMENTED("${C.symbol}7M(#5)"),
        C_MAJOR_5_AUGMENTED("${C.symbol}(#5)"),

        C_SHARP_DIMINISHED_TETRAD("${C_SHARP.symbol}°"),
        C_SHARP_HALF_DIMINISHED("${C_SHARP.symbol}m7(b5)"),
        C_SHARP_DIMINISHED("${C_SHARP.symbol}°"),
        C_SHARP_MINOR_7("${C_SHARP.symbol}m7"),
        C_SHARP_MINOR("${C_SHARP.symbol}m"),

        D_FLAT_MAJOR_7M("${D_FLAT.symbol}7M"),
        D_FLAT_MAJOR(D_FLAT.symbol),
        D_FLAT_MINOR_7("${D_FLAT.symbol}m7"),
        D_FLAT_MINOR("${D_FLAT.symbol}m"),
        D_FLAT_MINOR_7M("${D_FLAT.symbol}m7M"),
        D_FLAT_MAJOR_7("${D_FLAT.symbol}7"),
        D_FLAT_MAJOR_7M_AND_5_AUGMENTED("${D_FLAT.symbol}7M(#5)"),
        D_FLAT_MAJOR_5_AUGMENTED("${D_FLAT.symbol}(#5)"),

        D_MAJOR_7M("${D.symbol}7M"),
        D_MINOR_7("${D.symbol}m7"),
        D_MINOR("${D.symbol}m"),
        D_HALF_DIMINISHED("${D.symbol}m7(b5)"),
        D_DIMINISHED("${D.symbol}°"),
        D_MAJOR(D.symbol),
        D_MINOR_7M("${D.symbol}m7M"),
        D_DIMINISHED_TETRAD("${D.symbol}°"),
        D_MAJOR_7("${D.symbol}7"),
        D_MAJOR_7M_AND_5_AUGMENTED("${D.symbol}7M(#5)"),
        D_MAJOR_5_AUGMENTED("${D.symbol}(#5)"),

        D_SHARP_HALF_DIMINISHED("${D_SHARP.symbol}m7(b5)"),
        D_SHARP_DIMINISHED("${D_SHARP.symbol}°"),
        D_SHARP_DIMINISHED_TETRAD("${D_SHARP.symbol}°"),
        D_SHARP_MINOR_7("${D_SHARP.symbol}m7"),
        D_SHARP_MINOR("${D_SHARP.symbol}m"),

        E_DOUBLE_FLAT_MAJOR_7M("${E_DOUBLE_FLAT.symbol}7M"),
        E_DOUBLE_FLAT_MAJOR(E_DOUBLE_FLAT.symbol),

        E_FLAT_MAJOR(E_FLAT.symbol),
        E_FLAT_MAJOR_5_AUGMENTED("${E_FLAT.symbol}(#5)"),
        E_FLAT_MAJOR_7M("${E_FLAT.symbol}7M"),
        E_FLAT_MAJOR_7M_AND_5_AUGMENTED("${E_FLAT.symbol}7M(#5)"),
        E_FLAT_MINOR_7("${E_FLAT.symbol}m7"),
        E_FLAT_MINOR("${E_FLAT.symbol}m"),
        E_FLAT_HALF_DIMINISHED("${E_FLAT.symbol}m7(b5)"),
        E_FLAT_DIMINISHED("${E_FLAT.symbol}°"),
        E_FLAT_MINOR_7M("${E_FLAT.symbol}m7M"),
        E_FLAT_MAJOR_7("${E_FLAT.symbol}7"),

        E_DIMINISHED_TETRAD("${E.symbol}°"),
        E_MAJOR_7("${E.symbol}7"),
        E_MINOR_7("${E.symbol}m7"),
        E_MINOR("${E.symbol}m"),
        E_HALF_DIMINISHED("${E.symbol}m7(b5)"),
        E_DIMINISHED("${E.symbol}°"),
        E_MAJOR_7M("${E.symbol}7M"),
        E_MAJOR(E.symbol),
        E_MINOR_7M("${E.symbol}m7M"),

        F_FLAT_MAJOR_5_AUGMENTED("${F_FLAT.symbol}(#5)"),
        F_FLAT_MAJOR_7M_AND_5_AUGMENTED("${F_FLAT.symbol}7M(#5)"),
        F_FLAT_MAJOR_7M("${F_FLAT.symbol}7M"),
        F_FLAT_MAJOR(F_FLAT.symbol),
        F_FLAT_MAJOR_7("${F_FLAT.symbol}7"),

        F_MAJOR_7M("${F.symbol}7M"),
        F_MAJOR(F.symbol),
        F_MINOR("${F.symbol}m"),
        F_MINOR_7("${F.symbol}m7"),
        F_MAJOR_7("${F.symbol}7"),
        F_MAJOR_7M_AND_5_AUGMENTED("${F.symbol}7M(#5)"),
        F_MAJOR_5_AUGMENTED("${F.symbol}(#5)"),
        F_HALF_DIMINISHED("${F.symbol}m7(b5)"),
        F_DIMINISHED("${F.symbol}°"),
        F_MINOR_7M("${F.symbol}m7M"),
        F_DIMINISHED_TETRAD("${F.symbol}°"),

        F_SHARP_MINOR("${F_SHARP.symbol}m"),
        F_SHARP_MINOR_7("${F_SHARP.symbol}m7"),
        F_SHARP_HALF_DIMINISHED("${F_SHARP.symbol}m7(b5)"),
        F_SHARP_DIMINISHED("${F_SHARP.symbol}°"),
        F_SHARP_MAJOR_7("${F_SHARP.symbol}7"),
        F_SHARP_MAJOR(F_SHARP.symbol),

        G_FLAT_MAJOR_7("${G_FLAT.symbol}7"),
        G_FLAT_MINOR("${G_FLAT.symbol}m"),
        G_FLAT_MINOR_7("${G_FLAT.symbol}m7"),
        G_FLAT_MAJOR_7M("${G_FLAT.symbol}7M"),
        G_FLAT_MAJOR(G_FLAT.symbol),
        G_FLAT_MAJOR_7M_AND_5_AUGMENTED("${G_FLAT.symbol}7M(#5)"),
        G_FLAT_MAJOR_5_AUGMENTED("${G_FLAT.symbol}(#5)"),
        G_FLAT_MINOR_7M("${G_FLAT.symbol}m7M"),

        G_MAJOR_7("${G.symbol}7"),
        G_MAJOR(G.symbol),
        G_MINOR("${G.symbol}m"),
        G_MINOR_7("${G.symbol}m7"),
        G_MAJOR_7M("${G.symbol}7M"),
        G_MAJOR_7M_AND_5_AUGMENTED("${G.symbol}7M(#5)"),
        G_MAJOR_5_AUGMENTED("${G.symbol}(#5)"),
        G_HALF_DIMINISHED("${G.symbol}m7(b5)"),
        G_DIMINISHED("${G.symbol}°"),
        G_MINOR_7M("${G.symbol}m7M"),
        G_DIMINISHED_TETRAD("${G.symbol}°"),

        G_SHARP_MINOR_7("${G_SHARP.symbol}m7"),
        G_SHARP_MINOR("${G_SHARP.symbol}m"),
        G_SHARP_HALF_DIMINISHED("${G_SHARP.symbol}m7(b5)"),
        G_SHARP_DIMINISHED("${G_SHARP.symbol}°"),
        G_SHARP_DIMINISHED_TETRAD("${G_SHARP.symbol}°"),

        A_FLAT_MINOR("${A_FLAT.symbol}m"),
        A_FLAT_MINOR_7("${A_FLAT.symbol}m7"),
        A_FLAT_MAJOR_7("${A_FLAT.symbol}7"),
        A_FLAT_MAJOR_7M("${A_FLAT.symbol}7M"),
        A_FLAT_MAJOR(A_FLAT.symbol),
        A_FLAT_MAJOR_7M_AND_5_AUGMENTED("${A_FLAT.symbol}7M(#5)"),
        A_FLAT_MAJOR_5_AUGMENTED("${A_FLAT.symbol}(#5)"),
        A_FLAT_HALF_DIMINISHED("${A_FLAT.symbol}m7(b5)"),
        A_FLAT_DIMINISHED("${A_FLAT.symbol}°"),
        A_FLAT_MINOR_7M("${A_FLAT.symbol}m7M"),

        A_DIMINISHED_TETRAD("${A.symbol}°"),
        A_MINOR_7("${A.symbol}m7"),
        A_MINOR("${A.symbol}m"),
        A_HALF_DIMINISHED("${A.symbol}m7(b5)"),
        A_DIMINISHED("${A.symbol}°"),
        A_MAJOR_7("${A.symbol}7"),
        A_MAJOR(A.symbol),
        A_MAJOR_7M("${A.symbol}7M"),
        A_MINOR_7M("${A.symbol}m7M"),

        A_SHARP_HALF_DIMINISHED("${A_SHARP.symbol}m7(b5)"),
        A_SHARP_DIMINISHED("${A_SHARP.symbol}°"),
        A_SHARP_DIMINISHED_TETRAD("${A_SHARP.symbol}°"),

        B_DOUBLE_FLAT_MAJOR(B_DOUBLE_FLAT.symbol),
        B_DOUBLE_FLAT_MAJOR_7M("${B_DOUBLE_FLAT.symbol}7M"),
        B_DOUBLE_FLAT_MAJOR_7M_AND_5_AUGMENTED("${B_DOUBLE_FLAT.symbol}7M(#5)"),
        B_DOUBLE_FLAT_MAJOR_5_AUGMENTED("${B_DOUBLE_FLAT.symbol}(#5)"),

        B_FLAT_DIMINISHED("${B_FLAT.symbol}°"),
        B_FLAT_HALF_DIMINISHED("${B_FLAT.symbol}m7(b5)"),
        B_FLAT_MAJOR(B_FLAT.symbol),
        B_FLAT_MAJOR_7("${B_FLAT.symbol}7"),
        B_FLAT_MINOR_7("${B_FLAT.symbol}m7"),
        B_FLAT_MINOR("${B_FLAT.symbol}m"),
        B_FLAT_MAJOR_7M("${B_FLAT.symbol}7M"),
        B_FLAT_MAJOR_7M_AND_5_AUGMENTED("${B_FLAT.symbol}7M(#5)"),
        B_FLAT_MAJOR_5_AUGMENTED("${B_FLAT.symbol}(#5)"),
        B_FLAT_MINOR_7M("${B_FLAT.symbol}m7M"),

        B_HALF_DIMINISHED("${B.symbol}m7(b5)"),
        B_DIMINISHED("${B.symbol}°"),
        B_DIMINISHED_TETRAD("${B.symbol}°"),
        B_MINOR_7("${B.symbol}m7"),
        B_MINOR("${B.symbol}m"),
        B_MAJOR_7("${B.symbol}7"),
        B_MAJOR(B.symbol),
        B_MAJOR_7M("${B.symbol}7M"),
        B_MINOR_7M("${B.symbol}m7M")
    }

}