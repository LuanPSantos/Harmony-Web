import { Injectable } from "@angular/core";
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from "rxjs";
import { environment } from '../../environments/environment'
import { Credential } from "../user/credential.model";
import { Store } from "@ngrx/store";
import { decreaseLoaders, increaseLoaders } from "../app.action";
import { tap } from "rxjs/operators";

const BASE_URL = environment.gateway.url

@Injectable()
export class AuthService {

    constructor(private httpClient: HttpClient, private store: Store) { }

    authenticate(credential: Credential): Observable<HttpResponse<any>> {
        this.store.dispatch(increaseLoaders())
        return this.httpClient.post<HttpResponse<any>>(`${BASE_URL}/authentications`, credential, {
            observe: 'response'
        })
    }

    requestPasswordRecovery(email: string): Observable<HttpResponse<any>> {
        this.store.dispatch(increaseLoaders())
        return this.httpClient.post<HttpResponse<any>>(`${BASE_URL}/passwords/recoveries`, { email }, {
            observe: 'response'
        })
    }

    createPassword(token: string, password: string): Observable<HttpResponse<any>> {
        this.store.dispatch(increaseLoaders())
        return this.httpClient.post<HttpResponse<any>>(`${BASE_URL}/passwords`, { password }, {
            observe: 'response',
            headers: {
                'X-Password-Recovery-Token': token
            }
        })
    }
}