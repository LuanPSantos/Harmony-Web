import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProfileRoutingModule } from './profile-routing.module';
import { ProfileContainerComponent } from './profile-container/profile-container.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { EffectsModule } from '@ngrx/effects';
import { ProfileEffect } from './profile.effect';
import * as fromProfileReducer from './profile.reducer';
import { StoreModule } from '@ngrx/store';
import { UserService } from '../user/user.service';
import { CredentialService } from '../user/credential.service';
import { ReactiveFormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatButtonModule } from '@angular/material/button';


@NgModule({
  declarations: [ProfileContainerComponent, UpdateUserComponent],
  imports: [
    ReactiveFormsModule,
    MatInputModule,
    MatFormFieldModule,
    MatButtonModule,
    CommonModule,
    ProfileRoutingModule,
    StoreModule.forFeature(fromProfileReducer.profileFeatureKey, fromProfileReducer.profileReducer),
    EffectsModule.forFeature([ProfileEffect])
  ],
  providers: [UserService, CredentialService]
})
export class ProfileModule { }
