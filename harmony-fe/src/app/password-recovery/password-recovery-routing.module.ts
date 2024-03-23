import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { passwordRecoveryComponent } from './container/password-recovery.component';

const routes: Routes = [
  { path: '', component: passwordRecoveryComponent, pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PasswordRecoveryRoutingModule { }
