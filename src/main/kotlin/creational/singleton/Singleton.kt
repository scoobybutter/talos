package creational.singleton


// Singleton can be implemented directly in Kotlin by using object instead of class.
// This is an implementation similar to Java.
class Singleton private constructor(){
    private object HOLDER {
        val instance = Singleton()
    }

    companion object {
        val instance: Singleton by lazy { HOLDER.instance }
    }
}