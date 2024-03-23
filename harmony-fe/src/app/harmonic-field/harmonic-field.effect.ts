import { Injectable } from '@angular/core';
import { HarmonicFieldService } from './harmonic-field.service'
import { Actions, createEffect, ofType } from '@ngrx/effects';
import { mergeMap, map, catchError, tap, switchMap } from 'rxjs/operators'
import * as fromActions from './harmonic-field.action'
import { appHttpErrorHandler, decreaseLoaders } from '../app.action';

@Injectable()
export class HarmonicFieldEffect {

    findHarmonicField$ = createEffect(() => this.actions$.pipe(
        ofType(fromActions.LOAD_HARMONIC_FIELD),
        mergeMap((action: { payload: { selectedHarmonicField: string, selectedTone: string } }) =>
            this.harmonicFieldSerivce.findHarmoninyFiledByType(action.payload.selectedHarmonicField, action.payload.selectedTone).pipe(
                switchMap((harmonicField) => [
                    fromActions.loadHarmonicFieldSuccess({ payload: { harmonicField } }),
                    decreaseLoaders()
                ]),
                catchError(appHttpErrorHandler)
            )
        )
    ))


    constructor(
        private harmonicFieldSerivce: HarmonicFieldService,
        private actions$: Actions
    ) { }
}