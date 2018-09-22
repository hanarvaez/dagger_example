package co.com.monkeymobile.printery

import javax.inject.Inject

class PaperTrayImpl @Inject constructor(private val capacity: Int) : PaperTray {

    var level: Int = 0

    init {
        level = capacity
    }

    override fun recharge() {
        println("Rechargin paper...")
        level = capacity
    }

    override fun decrease() {
        level--
    }
}