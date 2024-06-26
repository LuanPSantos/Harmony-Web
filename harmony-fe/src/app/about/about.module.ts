import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AboutRoutingModule } from './about-routing.module';
import { AboutContainerComponent } from './about-container/about-container.component';


@NgModule({
  declarations: [AboutContainerComponent],
  imports: [
    CommonModule,
    AboutRoutingModule
  ],
  exports: [
    AboutContainerComponent
  ]
})
export class AboutModule { }
