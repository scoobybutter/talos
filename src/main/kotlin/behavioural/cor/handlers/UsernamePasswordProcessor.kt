package behavioural.cor.handlers

import behavioural.cor.auth_providers.UsernamePasswordProvider
import java.security.AuthProvider

class UsernamePasswordProcessor(nextProcessor: AuthenticationProcessor?) :
    AuthenticationProcessor(nextProcessor) {
    override fun isAuthorized(authProvider: AuthProvider): Boolean {
        if (authProvider is UsernamePasswordProvider) {
            return true
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider)
        }
        return false
    }
}