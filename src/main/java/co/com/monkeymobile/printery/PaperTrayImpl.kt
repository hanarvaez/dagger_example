package co.com.monkeymobile.printery

import javax.inject.Inject

abstract class PaperTrayImpl @Inject constructor(private val capacity: Int) : PaperTray {

    private var level: Int = 0

    override fun recharge() {
        println("Rechargin paper...")
        level = capacity
    }

    override fun decrease() {
        level--
    }

    override fun getPaperLevel(): Int {
        println("Getting paper level...")
        return level
    }
}