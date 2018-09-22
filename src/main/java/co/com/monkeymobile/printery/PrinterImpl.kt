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
        println("Printing...")
        printing = true
        paperTray.decrease()
        tonerCartridge.decrease()
        println("Paper remaining: ${paperTray.level}")
        println("Toner remaining: ${tonerCartridge.level}")
    }

    override fun startPrinting() {
        if (!on) {
            endPrinting()
            return
        }

        if (paperTray.level <= 0) {
            println("There are not paper")
            endPrinting()
            paperTray.recharge()
            return
        }

        if (tonerCartridge.level <= 0) {
            println("There are not toner")
            endPrinting()
            tonerCartridge.recharge()
            return
        }

        print()
    }

    override fun endPrinting() {
        println("Ending printing...")
        printing = false
    }

}