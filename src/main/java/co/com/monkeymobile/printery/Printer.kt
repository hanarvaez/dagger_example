package co.com.monkeymobile.printery

interface Printer {

    fun on()
    fun off()
    fun isOn(): Boolean

    fun print()

    fun startPrinting()
    fun endPrinting()
    fun isPrinting(): Boolean
}