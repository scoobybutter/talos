package behavioural.cor.auth_providers

import java.security.AuthProvider
import javax.security.auth.Subject
import javax.security.auth.callback.CallbackHandler

class UsernamePasswordProvider: AuthProvider("UsernamePasswordAuth", "1.0", "Test") {
    override fun login(subject: Subject?, handler: CallbackHandler?) {
        TODO("Not yet implemented")
    }

    override fun logout() {
        TODO("Not yet implemented")
    }

    override fun setCallbackHandler(handler: CallbackHandler?) {
        TODO("Not yet implemented")
    }
}