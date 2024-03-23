import { Component, OnInit, Input } from '@angular/core';
import { Store } from '@ngrx/store';
import { of } from 'rxjs';
import { FeatureState, selectChordDiagramVisibility } from './chord.selector';
import { showChordDiagram } from './chord.action';
import { Chord } from '../harmonic-field/harmonic-field.model';
import { BreakpointObserver, Breakpoints } from '@angular/cdk/layout';

@Component({
  selector: 'app-chord',
  templateUrl: './chord.component.html',
  styleUrls: ['./chord.component.scss']
})
export class ChordComponent implements OnInit {

  @Input()
  chord: Chord = null
  @Input()
  index = -1

  chordDiagramIsVisible$ = of()
  componentWith = 0

  isHandPortrait = false

  constructor(private store: Store<FeatureState>,
    breakpointObserver: BreakpointObserver) {
    this.chordDiagramIsVisible$ = store.select(selectChordDiagramVisibility)
    
      breakpointObserver.observe([
        Breakpoints.HandsetPortrait
      ]).subscribe(result => {
        this.isHandPortrait = result.matches
      })
  }

  ngOnInit(): void {

  }

  showDiagram(index) {
    this.store.dispatch(showChordDiagram({payload: { index }}))
  }

  getWith(element) {
    if(this.isHandPortrait) {
      this.componentWith = window.innerWidth
    }else{
      this.componentWith = element.clientWidth
    }
  }

}
