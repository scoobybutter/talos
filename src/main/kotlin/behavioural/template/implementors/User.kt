package behavioural.template.implementors

class User(user: String) : behavioural.template.base.Record() {
    private val user: String

    init {
        this.user = user
    }

    override fun getData(): String {
        return user
    }

    override fun onSaved() {
        println("$user saved")
    }
}