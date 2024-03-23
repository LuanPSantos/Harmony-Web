package com.luan.harmony.domain.chord.model.note

import com.luan.harmony.domain.chord.model.note.Title.SEVENTH

class Seventh private constructor(
        value: Value,
        title: Title,
        position: Position
) : ChordNote(value, position, title) {

    constructor(value: Value, position: Position)
            : this(value, SEVENTH, position)
}