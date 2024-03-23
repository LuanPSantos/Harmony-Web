import { Component, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import AppState from '../../app.state'
import { createUser } from '../signup.action';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-signup-container',
  templateUrl: './signup-container.component.html',
  styleUrls: ['./signup-container.component.scss']
})
export class SignupContainerComponent implements OnInit {

  userForm = new FormGroup({
    name: new FormControl(),
    email: new FormControl(),
    password: new FormControl(),
  });

  constructor(private store: Store<AppState>) { }

  ngOnInit(): void {

  }

  onUserFormSubmit() {
    this.createUser(
      this.userForm.get('name').value,
      this.userForm.get('email').value,
      this.userForm.get('password').value
    )
  }

  createUser(name, email, password) {
    this.store.dispatch(createUser({
      payload: {
        user: {
          id: null,
          name: name
        },
        credential: {
          id: null,
          email: email,
          rawPassword: password
        }
      }
    }))
  }
}
