import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { StoreModule } from '@ngrx/store';
import { EffectsModule } from '@ngrx/effects';
import { MatButtonModule } from '@angular/material/button';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import * as fromApp from './app.reducer';
import AuthorizationInterceptor from './auth/authorization.interceptor';
import { AuthService } from './auth/auth.service';
import { AuthEffect } from './auth/auth.effect';
import { AuthGuardService } from './auth/auth-guard.service';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MessageComponent } from './message.component';
import { LoaderComponent } from './loader/loader.component';
import { PasswordRecoveryModule } from './password-recovery/password-recovery.module';
import { PasswordCreationModule } from './password-creation/password-creation.module';

@NgModule({
  declarations: [
    AppComponent,
    MessageComponent,
    LoaderComponent
  ],
  imports: [
    MatButtonModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    MatToolbarModule,
    MatIconModule,
    MatSnackBarModule,
    StoreModule.forRoot({ appFeatureKey: fromApp.appReducer }),
    EffectsModule.forRoot([AuthEffect]),
    BrowserAnimationsModule,
    PasswordRecoveryModule,
    PasswordCreationModule
  ],
  providers: [
    { provide: HTTP_INTERCEPTORS, useClass: AuthorizationInterceptor, multi: true },
    AuthService,
    AuthGuardService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
