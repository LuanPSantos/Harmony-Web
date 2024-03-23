  
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment }  from '../../environments/environment'
import { HarmonicField } from './harmonic-field.model'
import { Store } from '@ngrx/store';
import { increaseLoaders } from '../app.action';

const BASE_URL = environment.gateway.url

@Injectable()
export class HarmonicFieldService {

  constructor(private httpClient: HttpClient, private store: Store) { }

  findHarmoninyFiledByType(type: string, tone: string): Observable<HarmonicField> {
    this.store.dispatch(increaseLoaders())
    return this.httpClient.get<HarmonicField>(`${BASE_URL}/tones/${tone}/harmonic-fields/${type}`)
  }
}