import { createAction, props } from "@ngrx/store"
import { Observable, of } from "rxjs"

export const APP_FAIL = "[App Module] App Fail"
export const CLEAR_STORE = "[App Module] Clear Store"
export const INCREASE_LOAD = "[App Module] Increase Load"
export const DECREASE_LOAD = "[App Module] Decrease Load"

export const appFail = createAction(
    APP_FAIL,
    props<{ payload: { errorData: { statusCode: string, errors: { code: string, message: string }[] } } }>()
)

export const clearStore = createAction(
    CLEAR_STORE
)

export const increaseLoaders = createAction(
    INCREASE_LOAD
)

export const decreaseLoaders = createAction(
    DECREASE_LOAD
)

export const appHttpErrorHandler = (response) => {
    return of(appFail({
        payload: {
            errorData: {
                errors: response.error.errors,
                statusCode: response.status
            }
        }
    }), decreaseLoaders())
}