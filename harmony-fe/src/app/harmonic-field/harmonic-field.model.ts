export class HarmonicField {
    type: string;
    triads: Chord[];
    tetrads: Chord[];
}

export class Chord {
    symbol: string; 
    grade: string;
    shapes: Shape[]
}

export class Shape {
    name: string;
    startFret: number;
    isBarre: boolean;
    notes: Note[]
}

export class Note {
    value: string;
    position: Position;
    title: string;
}

export class Position {
    fret: number;
    stringName: string;
}