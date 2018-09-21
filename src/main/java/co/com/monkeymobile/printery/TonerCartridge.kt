package co.com.monkeymobile.printery

interface TonerCartridge {

    fun recharge()
    fun decrease()
    fun getLevel(): Int
}