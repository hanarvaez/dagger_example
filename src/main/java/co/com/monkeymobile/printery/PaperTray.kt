package co.com.monkeymobile.printery

interface PaperTray {

    fun recharge()
    fun decrease()
    fun getPaperLevel(): Int
}