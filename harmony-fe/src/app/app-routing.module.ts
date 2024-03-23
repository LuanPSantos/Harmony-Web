import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { of } from 'rxjs';
import { AppComponent } from './app.component';
import { AuthGuardService } from './auth/auth-guard.service';

const routes: Routes = [
  { path: '', redirectTo: 'app', pathMatch: 'full' },
  {
    path: 'app', children: [
      { path: '', redirectTo: 'harmonic-field', pathMatch: 'full' },
      {
        path: 'harmonic-field',
        loadChildren: () => import('./harmonic-field/harmonic-field.module').then(m => m.HarmonicFieldModule)
      }
      // {
      //   path: 'about',
      //   loadChildren: () => import('./about/about.module').then(m => m.AboutModule)
      // },
      // {
      //   path: 'signup',
      //   loadChildren: () => import('./signup/signup.module').then(m => m.SignupModule)
      // },
      // {
      //   path: 'auth',
      //   loadChildren: () => import('./auth/auth.module').then(m => m.AuthModule)
      // },
      // {
      //   path: 'profile',
      //   canActivate: [AuthGuardService],
      //   loadChildren: () => import('./profile/profile.module').then(m => m.ProfileModule)
      // },
      // {
      //   path: 'password-recovery',
      //   loadChildren: () => import('./password-recovery/password-recovery.module').then(m => m.PasswordRecoveryModule)
      // },
      // {
      //   path: 'password-creation',
      //   loadChildren: () => import('./password-creation/password-creation.module').then(m => m.PasswordCreationModule)
      // }
    ]
  },
  { path: '**', component: AppComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
