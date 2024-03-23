import { AuthenticationTokenPair } from "./auth/authentication-token-pair.model";
import { HarmonicField } from './harmonic-field/harmonic-field.model';
import { Credential } from "./user/credential.model";
import { User } from "./user/user.model";

export interface HarmonicFieldFeatureState {
    harmonicField: HarmonicField
}

export interface ProfileFeatureState {
    user: User,
    credential: Credential
}

export interface AppFeatureState {
    authorizationTokenPair: AuthenticationTokenPair,
    errorData: { statusCode: string, errors: { code: string, message: string }[] },
    identifier: string,
    api: { runningAPICallsCount: number }
}

export default interface AppState {
    harmonicFieldFeatureKey: HarmonicFieldFeatureState,
    appFeatureKey: AppFeatureState,
    profileFeatureKey: ProfileFeatureState
}