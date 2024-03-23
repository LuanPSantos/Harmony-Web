import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { Store } from '@ngrx/store';
import { of } from 'rxjs';
import { debounceTime, map, tap } from 'rxjs/operators';
import { clearStore } from './app.action';
import { selectErrorMessage, selectRunningAPICallsCount } from './app.selector';
import AppState from './app.state';
import { selectAuthorizationTokenPair } from './auth/auth.selector';
import { MessageComponent } from './message.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'harmony-fe';

  isAuthenticated$ = of(false)
  isLoading$ = of(false)

  constructor(private store: Store<AppState>, private snackBar: MatSnackBar, private router: Router) {

  }

  ngOnInit(): void {
    this.isAuthenticated$ = this.store.select(selectAuthorizationTokenPair).pipe(
      map(pair => pair.authorization != null && pair.refreshAuthorization != null)
    )

    this.store.select(selectErrorMessage).pipe(
      tap((errorData) => {
        // TODO melhorar tratamento de erro

        if (errorData.statusCode >= "500") {
          this.openSnackBar({
            code: '',
            message: "Tendi foi nada. Tenta de novo daqui a pouco "
          });
        } else {
          errorData?.errors.forEach((error) => {
            this.openSnackBar(error);

            this.handle(error, errorData.statusCode)
          })
        }


      })
    ).subscribe();

    this.isLoading$ = this.store.select(selectRunningAPICallsCount).pipe(
      debounceTime(100),
      map((count) => count > 0)
    )
  }

  handle(error, statusCode) {
    if (statusCode == 401) {
      this.router.navigate(['/app/auth'])
      this.store.dispatch(clearStore())
    }
  }

  openSnackBar(error) {
    this.snackBar.openFromComponent(MessageComponent, {
      duration: 5 * 1000,
      data: {
        message: error.message
      }
    });
  }
}
