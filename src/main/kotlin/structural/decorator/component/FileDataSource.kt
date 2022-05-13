package structural.decorator.component

class FileDataSource : DataSource {
    private lateinit var data: String

    override fun writeData(data: String) {
        println("$data written to file")
        this.data = data
    }

    override fun readData(): String {
        return data
    }
}