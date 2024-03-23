import { Component, Inject, Input } from '@angular/core';
import { MAT_SNACK_BAR_DATA } from '@angular/material/snack-bar';

@Component({
    selector: 'app-message',
    template: `
      <span class="message-component">
        {{message}}
      </span>
    `,
    styles: [`
      .message-component {
        color: #c2185b;
      }
    `],
})
export class MessageComponent { 

    message: string = null

    constructor(@Inject(MAT_SNACK_BAR_DATA) private data: any) {
        
    }

    ngOnInit() {
        this.message = this.data.message
    }
}