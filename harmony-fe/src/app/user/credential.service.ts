import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs";
import { environment } from '../../environments/environment'
import { Credential } from "./credential.model";
import { Store } from "@ngrx/store";
import { increaseLoaders } from "../app.action";

const BASE_URL = environment.gateway.url

@Injectable()
export class CredentialService {

    constructor(private httpClient: HttpClient, private store: Store) { }

    findCredentialById(id: string): Observable<Credential> {
        // TODO remover isso daqui?
        this.store.dispatch(increaseLoaders())
        return this.httpClient.get<Credential>(`${BASE_URL}/credentials/${id}`)
    }

    updateCredential(credential: Credential, oldRawPassword: string): Observable<Credential> {
        this.store.dispatch(increaseLoaders())
        return this.httpClient.patch<Credential>(`${BASE_URL}/credentials/${credential.id}`,
            { email: credential.email, rawPassword: credential.rawPassword, oldRawPassword: oldRawPassword })
    }
}