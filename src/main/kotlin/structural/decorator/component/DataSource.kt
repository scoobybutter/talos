package structural.decorator.component

interface DataSource {
    fun writeData(data: String)
    fun readData(): String
}