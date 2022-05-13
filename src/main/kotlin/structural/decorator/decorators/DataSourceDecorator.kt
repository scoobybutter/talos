package structural.decorator.decorators

import structural.decorator.component.DataSource

open class DataSourceDecorator(dataSource: DataSource) : DataSource {
    private val dataSource: DataSource

    init {
        this.dataSource = dataSource
    }

    override fun writeData(data: String) {
        dataSource.writeData(data)
    }

    override fun readData(): String {
        return dataSource.readData()
    }
}