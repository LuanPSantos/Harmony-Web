import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Store } from '@ngrx/store';
import { Subscription } from 'rxjs';
import AppState from 'src/app/app.state';
import { selectIdentifier } from 'src/app/auth/auth.selector';
import { Credential } from 'src/app/user/credential.model';
import { User } from 'src/app/user/user.model';
import { findCredentialById, findUserById, updateUser, updateCredential } from '../profile.action';
import { selectCredential, selectUser } from '../profile.selector';

@Component({
  selector: 'app-container',
  templateUrl: './profile-container.component.html',
  styleUrls: ['./profile-container.component.scss']
})
export class ProfileContainerComponent implements OnInit, OnDestroy {

  userForm = new FormGroup({
    id: new FormControl(),
    name: new FormControl()
  });

  credentialForm = new FormGroup({
    id: new FormControl(),
    email: new FormControl(),
    newPassword: new FormControl(),
    oldPassword: new FormControl()
  })

  userIdSubscription$: Subscription;
  userSubscription$: Subscription;
  credentialSubscription$: Subscription;

  constructor(private store: Store<AppState>) { }

  ngOnInit(): void {
    this.userIdSubscription$ = this.store.select(selectIdentifier)
      .subscribe(identifier => {
        this.store.dispatch(findUserById({ payload: { id: identifier } }))
        this.store.dispatch(findCredentialById({ payload: { id: identifier } }))
      })

    this.userSubscription$ = this.store.select(selectUser).subscribe((user) => {

      this.userForm.setValue({
        id: user?.id || null,
        name: user?.name || null
      })
    })

    this.credentialSubscription$ = this.store.select(selectCredential).subscribe((credential) => {
      this.credentialForm.setValue({
        id: credential?.id || null,
        email: credential?.email || null,
        newPassword: null,
        oldPassword: null
      })
    })
  }

  ngOnDestroy(): void {
    this.userIdSubscription$.unsubscribe();
    this.userSubscription$.unsubscribe();
    this.credentialSubscription$.unsubscribe();
  }

  onUserFormSubmit() {
    this.updateUser({
      id: this.userForm.get('id').value,
      name: this.userForm.get('name').value
    })
  }

  updateUser(user: User) {
    this.store.dispatch(updateUser({ payload: { user } }))
  }

  onCredentialFormSubmit() {
    this.updateCredential(
      {
        id: this.credentialForm.get('id').value,
        email: this.credentialForm.get('email').value,
        rawPassword: this.credentialForm.get('newPassword').value
      },
      this.credentialForm.get('oldPassword').value
    )
  }

  updateCredential(credential: Credential, oldPassword: string) {
    this.store.dispatch(updateCredential({ payload: { credential, oldPassword } }))
  }

  oldPasswordTiped(): boolean {
    return !this.credentialForm.get('oldPassword').value
  }

}
