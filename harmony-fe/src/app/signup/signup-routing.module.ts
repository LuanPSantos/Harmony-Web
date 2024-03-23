import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SignupContainerComponent } from './signup-container/signup-container.component';

const routes: Routes = [
  { path: '', component: SignupContainerComponent, pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SignupRoutingModule { }
