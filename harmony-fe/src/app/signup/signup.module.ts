import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SignupRoutingModule } from './signup-routing.module';
import { SignupContainerComponent } from './signup-container/signup-container.component';
import { UserService } from '../user/user.service';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { ReactiveFormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { SignupEffect } from './signup.effect'
import { StoreModule } from '@ngrx/store';
import { EffectsModule } from '@ngrx/effects';
import * as signup from './signup.reducer';

@NgModule({
  declarations: [SignupContainerComponent],
  imports: [
    ReactiveFormsModule,
    MatInputModule,
    MatFormFieldModule,
    MatButtonModule,
    CommonModule,
    SignupRoutingModule,
    StoreModule.forFeature(signup.signupFeatureKey, signup.signupReducer),
    EffectsModule.forFeature([SignupEffect])
  ],
  exports: [
    SignupContainerComponent
  ],
  providers: [
    UserService
  ],
})
export class SignupModule { }
