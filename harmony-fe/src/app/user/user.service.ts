import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs";
import { environment } from '../../environments/environment'
import { User } from "./user.model";
import { Store } from "@ngrx/store";
import { increaseLoaders } from "../app.action";
import { Credential } from "./credential.model";

const BASE_URL = environment.gateway.url

@Injectable()
export class UserService {

    constructor(private httpClient: HttpClient, private store: Store) { }

    createUser(user: User, credential: Credential): Observable<void> {
        this.store.dispatch(increaseLoaders())
        return this.httpClient.post<void>(`${BASE_URL}/users`, {
            name: user.name,
            email: credential.email,
            rawPassword: credential.rawPassword
        })
    }

    findUserById(id: string): Observable<User> {
        // TODO remover isso daqui?
        this.store.dispatch(increaseLoaders())
        return this.httpClient.get<User>(`${BASE_URL}/users/${id}`)
    }

    updateUser(user: User): Observable<void> {
        this.store.dispatch(increaseLoaders())
        return this.httpClient.patch<void>(`${BASE_URL}/users/${user.id}`, user)
    }
}