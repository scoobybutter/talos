package behavioural.cor.handlers

import behavioural.cor.auth_providers.OAuthProvider
import java.security.AuthProvider

class OAuthProcessor(nextProcessor: AuthenticationProcessor?) : AuthenticationProcessor(nextProcessor) {
    override fun isAuthorized(authProvider: AuthProvider): Boolean {
        if (authProvider is OAuthProvider) {
            return true
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider)
        }
        return false
    }
}