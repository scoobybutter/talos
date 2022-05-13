package behavioural.template.base

abstract class Record {
    final fun save() {
        println("started save record")
        val data = getData()
        println("saving $data")
        println("save record completed")
        onSaved()
    }

    abstract fun getData(): String
    abstract fun onSaved()
}