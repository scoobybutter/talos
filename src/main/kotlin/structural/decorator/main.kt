package structural.decorator

import structural.decorator.component.FileDataSource
import structural.decorator.decorators.CompressionDecorator
import structural.decorator.decorators.DataSourceDecorator
import structural.decorator.decorators.EncryptionDecorator


fun main() {
    val encoded: DataSourceDecorator = CompressionDecorator(
        EncryptionDecorator(
            FileDataSource()
        )
    )
    encoded.writeData("haider")
    println(encoded.readData())
}