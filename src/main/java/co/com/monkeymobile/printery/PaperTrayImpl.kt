package co.com.monkeymobile.printery

import javax.inject.Inject

class PaperTrayImpl @Inject constructor() : PaperTray {

    var level: Int = 0
    var capacity: Int = 0

    override fun recharge() {
        println("Rechargin paper...")
        level = capacity
    }

    override fun decrease() {
        level--
    }
}