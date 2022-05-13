package structural.decorator.decorators

import structural.decorator.component.DataSource
import java.util.*

class EncryptionDecorator(dataSource: DataSource) : DataSourceDecorator(dataSource = dataSource) {
    override fun writeData(data: String) {
        super.writeData(encode(data))
    }

    override fun readData(): String {
        return decode(super.readData())
    }

    private fun encode(data: String) = Base64.getEncoder().encodeToString(data.toByteArray())


    private fun decode(data: String) = Base64.getDecoder().decode(data).decodeToString()
}