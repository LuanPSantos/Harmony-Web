import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PasswordCreationRoutingModule } from './password-creation-routing.module';
import { PasswordCreationComponent } from './container/password-creation.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatButtonModule } from '@angular/material/button';
import { StoreModule } from '@ngrx/store';
import { EffectsModule } from '@ngrx/effects';
import * as fromPasswordCreation from './password-creation.reducer';
import { of } from 'rxjs';
import { PasswordCreationEffect } from './password-creation.effect';

@NgModule({
  declarations: [PasswordCreationComponent],
  imports: [
    ReactiveFormsModule,
    MatInputModule,
    MatFormFieldModule,
    MatButtonModule,
    CommonModule,
    PasswordCreationRoutingModule,
    StoreModule.forFeature(fromPasswordCreation.passwordCreationFeatureKey, fromPasswordCreation.passwordCreationReducer),
    EffectsModule.forFeature([PasswordCreationEffect])
  ]
})
export class PasswordCreationModule { }
