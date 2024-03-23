import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ChordComponent } from './chord.component';
import { ChordDiagramComponent }  from './chord-diagram/chord-diagram.component';
import { StoreModule } from '@ngrx/store';
import { chordFeatureKey, chordReducer } from './chord.reducer'
import { MatIconModule } from '@angular/material/icon';
import { MatTooltipModule } from '@angular/material/tooltip';

@NgModule({
  declarations: [
    ChordComponent, 
    ChordDiagramComponent
  ],
  imports: [
    CommonModule,
    MatIconModule,
    MatTooltipModule,
    StoreModule.forFeature(chordFeatureKey, chordReducer)
  ],
  exports: [
    ChordComponent
  ]
})
export class ChordModule { }
