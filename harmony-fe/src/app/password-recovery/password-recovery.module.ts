import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PasswordRecoveryRoutingModule } from './password-recovery-routing.module';
import { passwordRecoveryComponent } from './container/password-recovery.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatButtonModule } from '@angular/material/button';
import { StoreModule } from '@ngrx/store';
import * as fromPasswordRecovery from './password-recovery.reducer';
import { EffectsModule } from '@ngrx/effects';
import { PasswordRecoveryEffect } from './password-recovery.effect';


@NgModule({
  declarations: [passwordRecoveryComponent],
  imports: [
    ReactiveFormsModule,
    MatInputModule,
    MatFormFieldModule,
    MatButtonModule,
    CommonModule,
    PasswordRecoveryRoutingModule,
    StoreModule.forFeature(fromPasswordRecovery.passwordRecoveryFeatureKey, fromPasswordRecovery.passwordRecoveryReducer),
    EffectsModule.forFeature([PasswordRecoveryEffect])
  ]
})
export class PasswordRecoveryModule { }
