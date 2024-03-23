import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HarmonicFieldRoutingModule } from './harmonic-field-routing.module';
import { HarmonicFieldContainerComponent } from './harmonic-field-container/harmonic-field-container.component';
import { StoreModule } from '@ngrx/store';
import * as fromHarmonicField from './harmonic-field.reducer';
import { MatButtonToggleModule } from '@angular/material/button-toggle';
import { MatSelectModule } from '@angular/material/select';
import { LayoutModule } from '@angular/cdk/layout';
import { MatIconModule } from '@angular/material/icon';
import { ChordModule } from '../chord/chord.module';
import { HarmonicFieldService } from './harmonic-field.service'
import { EffectsModule } from '@ngrx/effects';
import { HarmonicFieldEffect } from './harmonic-field.effect'

@NgModule({
  declarations: [
    HarmonicFieldContainerComponent
  ],
  imports: [
    ChordModule,
    CommonModule,
    HarmonicFieldRoutingModule,
    MatButtonToggleModule,
    MatSelectModule,
    LayoutModule,
    MatIconModule,
    ChordModule,
    StoreModule.forFeature(fromHarmonicField.harmonicFieldFeatureKey, fromHarmonicField.harmonicFieldReducer),
    EffectsModule.forFeature([HarmonicFieldEffect])
  ],
  exports: [
    HarmonicFieldContainerComponent
  ],
  providers: [
    HarmonicFieldService
  ]
})
export class HarmonicFieldModule { }
