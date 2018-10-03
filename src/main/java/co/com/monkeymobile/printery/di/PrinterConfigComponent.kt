package co.com.monkeymobile.printery.di

import co.com.monkeymobile.printery.PaperTrayImpl
import co.com.monkeymobile.printery.TonerCartridgeImpl
import co.com.monkeymobile.printery.app.PrintingHouseMain
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [PrinterConfigModule::class])
interface PrinterConfigComponent {

    fun getPaperTray() : PaperTrayImpl

    fun getTonerCartridge() : TonerCartridgeImpl

    fun inject(main: PrintingHouseMain.PrintingHouse)
}