package co.com.monkeymobile.printery

import javax.inject.Inject

class TonerCartridgeImpl @Inject constructor(private val capacity: Int) : TonerCartridge {

    var level: Int = 0

    init {
        level = capacity
    }

    override fun recharge() {
        println("Rechargin toner...")
        level = capacity
    }

    override fun decrease() {
        level--
    }
}