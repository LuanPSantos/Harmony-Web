import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Store } from '@ngrx/store';
import AppState from 'src/app/app.state';
import { requestPasswordRecovery } from '../password-recovery.action';

@Component({
  selector: 'app-container',
  templateUrl: './password-recovery.component.html',
  styleUrls: ['./password-recovery.component.scss']
})
export class passwordRecoveryComponent implements OnInit {

  requestPasswordRecoveryForm = new FormGroup({
    email: new FormControl()
  });

  constructor(private store: Store<AppState>) { }
  ngOnInit(): void {

  }

  onRequestPasswordRecoverySubmit() {
    this.requestPasswordRecovery(
      this.requestPasswordRecoveryForm.get('email').value
    )
  }

  requestPasswordRecovery(email) {
    this.store.dispatch(requestPasswordRecovery({ payload: { email } }))
  }

}
