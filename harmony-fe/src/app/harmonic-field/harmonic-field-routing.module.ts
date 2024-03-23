import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HarmonicFieldContainerComponent } from './harmonic-field-container/harmonic-field-container.component';

const routes: Routes = [
  { path: '', component: HarmonicFieldContainerComponent, pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HarmonicFieldRoutingModule { }
