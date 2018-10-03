package co.com.monkeymobile.printery

import javax.inject.Inject

class TonerCartridgeImpl @Inject constructor() : TonerCartridge {

    var level: Int = 0
    var capacity: Int = 0

    override fun recharge() {
        println("Rechargin toner...")
        level = capacity
    }

    override fun decrease() {
        level--
    }
}