import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router, } from '@angular/router';
import { Store } from '@ngrx/store';
import AppState from 'src/app/app.state';
import { createPassword } from '../password-creation.action';

@Component({
  selector: 'password-creation-container',
  templateUrl: './password-creation.component.html',
  styleUrls: ['./password-creation.component.scss']
})
export class PasswordCreationComponent implements OnInit {

  passwordCreationForm = new FormGroup({
    email: new FormControl(),
    password: new FormControl(),
  });

  constructor(private store: Store<AppState>, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
  }

  onPasswordCreationSubmit() {
    this.createPassword(
      this.passwordCreationForm.get('password').value
    )
  }

  createPassword(password) {
    this.store.dispatch(createPassword({
      payload: {
        token: this.route.snapshot.queryParams['token'],
        password
      }
    }))
    this.router.navigate(['/app/auth'])
  }

}
