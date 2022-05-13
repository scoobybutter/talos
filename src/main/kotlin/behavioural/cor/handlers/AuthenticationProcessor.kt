package behavioural.cor.handlers

import java.security.AuthProvider

abstract class AuthenticationProcessor(val nextProcessor: AuthenticationProcessor?) {
    abstract fun isAuthorized(authProvider: AuthProvider): Boolean
}