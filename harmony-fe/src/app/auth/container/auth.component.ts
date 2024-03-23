import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Store } from '@ngrx/store';
import AppState from 'src/app/app.state';
import { authenticate } from '../auth.action';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.scss']
})
export class AuthComponent {

  authForm = new FormGroup({
    email: new FormControl(),
    password: new FormControl(),
  });

  constructor(private store: Store<AppState>) { }

  onAuthFormSubmit() {
    this.authenticate(
      this.authForm.get('email').value,
      this.authForm.get('password').value
    )
  }

  authenticate(email, password) {
    this.store.dispatch(authenticate({
      payload: {
        credential: {
          id: null,
          email: email,
          rawPassword: password
        }
      }
    }))
  }
}
