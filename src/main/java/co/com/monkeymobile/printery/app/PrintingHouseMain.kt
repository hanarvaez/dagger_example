package co.com.monkeymobile.printery.app

import co.com.monkeymobile.printery.PrinterImpl
import co.com.monkeymobile.printery.di.DaggerPrinterConfigComponent
import co.com.monkeymobile.printery.di.PrinterConfigModule
import javax.inject.Inject

object PrintingHouseMain {

    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello world")

        val printerObject = PrintingHouse()
        val printerConfigModule = DaggerPrinterConfigComponent.builder().printerConfigModule(PrinterConfigModule()).build()
        printerConfigModule.inject(printerObject)


        printerObject.printer.print()
        printerObject.printer.print()

    }

    class PrintingHouse {

        @Inject
        lateinit var printer: PrinterImpl
    }

}
