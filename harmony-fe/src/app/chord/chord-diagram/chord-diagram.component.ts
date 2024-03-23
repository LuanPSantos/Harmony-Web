import { BreakpointObserver, Breakpoints } from '@angular/cdk/layout';
import { not } from '@angular/compiler/src/output/output_ast';
import { Component, Input, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import { Chord, Note, Shape } from 'src/app/harmonic-field/harmonic-field.model';
import { hideChordDiagram } from '../chord.action';
import { FeatureState } from '../chord.selector';


@Component({
  selector: 'app-chord-diagram',
  templateUrl: './chord-diagram.component.html',
  styleUrls: ['./chord-diagram.component.scss']
})
export class ChordDiagramComponent implements OnInit {

  @Input()
  chord: Chord = null
  horizontalPosition = 0
  containerPosition = 'absolute'

  selectedShape: Shape
  selectedShapeIndex = 0

  fretAmount = 5

  isHandPortrait = false

  constructor(
    private store: Store<FeatureState>,
    breakpointObserver: BreakpointObserver){
      // TODO melhoria: Criar um strategy para cada breakpont.
      // Dessa forma o mtetodo getChordDiagramStyles não cresce em IFs.
      // Mas só se for ter mais breakpoints.
      breakpointObserver.observe([
        Breakpoints.HandsetPortrait
      ]).subscribe(result => {
        this.isHandPortrait = result.matches
      })
    }

  @Input()
  set parentWith(value: any) {
      // TODO poderia ter uma forma de linkar o valor do css aqui
      let chordDiagramAbsoluteContainerWidth = 120;
      let chordDiagramAbsoluteContainerPadding = 18;
      this.horizontalPosition = value/2 - ((chordDiagramAbsoluteContainerWidth + 3 * chordDiagramAbsoluteContainerPadding)/2) 
  }

  ngOnInit(): void {
    this.selectedShape = this.chord.shapes.find(shape => shape.name == "DEFAULT")
  }

  nextShape() {
    this.selectedShapeIndex++;
    if(this.selectedShapeIndex > (this.chord.shapes.length - 1)) {
      this.selectedShapeIndex = 0;
    }
    this.selectedShape = this.chord.shapes[this.selectedShapeIndex]
  }

  backShape() {
    this.selectedShapeIndex--;
    if(this.selectedShapeIndex < 0) {
      this.selectedShapeIndex = this.chord.shapes.length - 1;
    }
    this.selectedShape = this.chord.shapes[this.selectedShapeIndex]
  }

  hideDiagram() {
    this.store.dispatch(hideChordDiagram())
  }

  getNotePositionClasses(note: Note): any[] {
    return [
      "note-string-position-" + note.position.stringName,
      "note-fret-position-" + this.normalizeNoteFretPosition(note.position.fret)
    ]
  }

  getNoteColorClasses(note: Note): any[] {
    return [
      "note-color-" + note.title
    ]
  }

  getFingerFretPositionClasses(shape: Shape): any[] {
    let note = shape.notes.find(note => note.title == "FUNDAMENTAL")
    return [
      "finger-fret-start-string-" + note.position.stringName,
      "finger-fret-position-" + this.normalizeNoteFretPosition(note.position.fret)
    ]
  }

  getPlayableIcons(shape: Shape): any[] {
    let playableIcons = []
    let stringNames = ["E6", "A5", "D4", "G3", "B2", "E1"] // TODO buscar de um endpoint

    for(let index = 0; index < stringNames.length; index++) {

      let note = shape.notes.find(note => note.position.stringName == stringNames[index]) 

      if(note) {
        playableIcons.push({
          icon: note.title == "FUNDAMENTAL" ? "radio_button_checked" : "radio_button_unchecked",
          styleClass: "playable-string-icon-position-" + note.position.stringName
        })
      }else {
        playableIcons.push({
          icon: "close",
          styleClass: "playable-string-icon-position-" + stringNames[index]
        })
      }
    }

    return playableIcons
  }

  showStartFretNumberRef(shape: Shape): boolean {
    return shape.startFret >= 1
  }

  getStartFretPositionClasses(shape: Shape): any[] {
    return [
      "startfret-number-ref-position-" + this.normalizeNoteFretPosition(shape.startFret)
    ]
  }

  getNutVisibilityClasses(): any[] {
    return [
      this.getHighestFretNumber() >= this.fretAmount ? "no-nut" : ""
    ]
  }

  getTitleDescription(note: Note): string {
    switch(note.title) {
      case "FUNDAMENTAL": return "Fundamental";
      case "THIRD": return "Terça";
      case "FIFTH": return "Quinta";
      case "SEVENTH": return "Sétima";
      default: return "Oitava";
    }
  }

  getChordDiagramStyles(): any {
    if(this.isHandPortrait) {
      let chordDiagramAbsoluteContainerHeight = 200;
      return {
        'left.px': this.horizontalPosition, 
        'position': 'fixed',
        'top.px': window.innerWidth/2 - chordDiagramAbsoluteContainerHeight / 2
      }
    }

    return {
      'left.px': this.horizontalPosition, 
      'position': 'absulute',
    }
  }

  private normalizeNoteFretPosition(fretNumber: number): number {
    let highestFretNumber = this.getHighestFretNumber()
    if(highestFretNumber >= this.fretAmount) {
      fretNumber =  (fretNumber - (this.selectedShape.startFret - 1))
    }

    return fretNumber
  }

  private getHighestFretNumber(): number {
    return this.selectedShape.notes.map((note) => note.position.fret).reduce((a, b) => Math.max(a, b))

  }
}
