import { Component, OnInit } from '@angular/core';
import { of } from 'rxjs';
import { Store, select } from '@ngrx/store';
import { loadHarmonicField } from '../harmonic-field.action';
import { selectTetrads, selectTriads } from '../harmonic-field-selector'
import { BreakpointObserver, Breakpoints } from '@angular/cdk/layout';
import AppState from 'src/app/app.state';
import { selectAuthorizationTokenPair } from 'src/app/auth/auth.selector';


@Component({
  selector: 'app-harmonic-field-container',
  templateUrl: './harmonic-field-container.component.html',
  styleUrls: ['./harmonic-field-container.component.scss']
})
export class HarmonicFieldContainerComponent implements OnInit {

  tetrads$ = of([])
  triads$ = of([])
  toggleGroupIsVertical = false

  selectedHarmonicField = null
  selectedTone = null

  constructor(
    private store: Store<AppState>,
    breakpointObserver: BreakpointObserver
  ) { 
    breakpointObserver.observe([
      Breakpoints.HandsetPortrait
    ]).subscribe(result => {
      this.toggleGroupIsVertical = result.matches
    });
  }

  ngOnInit(): void {    
    this.tetrads$ = this.store.pipe(select(selectTetrads))
    this.triads$ = this.store.pipe(select(selectTriads))
  }

  loadHarmonicField() {
    if(this.selectedHarmonicField && this.selectedTone) {
      this.store.dispatch(loadHarmonicField({ payload: {
        selectedHarmonicField: this.selectedHarmonicField,
        selectedTone: this.selectedTone
      }}))
    }
  }

  changeHarmonicFieldType(event) {
    this.selectedHarmonicField = event.value

    this.loadHarmonicField()
  }

  changeTone(event) {
    this.selectedTone = event.value

    this.loadHarmonicField()
  }
}
