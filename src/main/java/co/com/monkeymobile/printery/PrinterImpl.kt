package co.com.monkeymobile.printery

import javax.inject.Inject

class PrinterImpl @Inject constructor(val paperTray: PaperTrayImpl,
                                      val tonerCartridge: TonerCartridgeImpl) : Printer {

    var on: Boolean = false
    var printing: Boolean = false

    override fun turnOn() {
        on = true
    }

    override fun turnOff() {
        on = false
    }

    override fun print() {
        printing = true
        paperTray.decrease()
        tonerCartridge.decrease()
        println("Paper remaining: ${paperTray.level}")
        println("Toner remaining: ${tonerCartridge.level}")
    }

    override fun startPrinting() {
        if (!on) {
            endPrinting()
        }

        if (paperTray.level <= 0) {
            endPrinting()
            paperTray.recharge()
        }

        if (tonerCartridge.level <= 0) {
            endPrinting()
            tonerCartridge.recharge()
        }

        print()
    }

    override fun endPrinting() {
        printing = false
    }

}