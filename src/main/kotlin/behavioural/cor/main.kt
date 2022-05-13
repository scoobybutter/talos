package behavioural.cor

import behavioural.cor.auth_providers.OAuthProvider
import behavioural.cor.auth_providers.UsernamePasswordProvider
import behavioural.cor.handlers.OAuthProcessor
import behavioural.cor.handlers.UsernamePasswordProcessor


fun main() {
    val usernamePasswordProcessor = UsernamePasswordProcessor(OAuthProcessor(null))
    println(usernamePasswordProcessor.isAuthorized(UsernamePasswordProvider()))
    println(usernamePasswordProcessor.isAuthorized(OAuthProvider()))
}