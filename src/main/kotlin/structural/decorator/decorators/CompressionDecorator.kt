package structural.decorator.decorators

import structural.decorator.component.DataSource
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.InputStream
import java.util.*
import java.util.zip.Deflater
import java.util.zip.DeflaterOutputStream
import java.util.zip.InflaterInputStream


class  CompressionDecorator(dataSource: DataSource) : DataSourceDecorator(dataSource = dataSource) {
    override fun readData(): String {
        return decompress(super.readData())
    }

    override fun writeData(data: String) {
        super.writeData(compress(data))
    }

    private fun compress(data: String): String {
        val bout = ByteArrayOutputStream(512)
        val dos = DeflaterOutputStream(bout, Deflater(6))
        dos.write(data.toByteArray())
        dos.close()
        bout.close()
        return Base64.getEncoder().encodeToString(bout.toByteArray())
    }

    private fun decompress(data: String): String {
        val `in` = ByteArrayInputStream(Base64.getDecoder().decode(data))
        val iin = InflaterInputStream(`in`)
        val bout = ByteArrayOutputStream(512)
        var b: Int
        while (iin.read().also { b = it } != -1) {
            bout.write(b)
        }
        `in`.close()
        iin.close()
        bout.close()
        return String(bout.toByteArray())
    }
}