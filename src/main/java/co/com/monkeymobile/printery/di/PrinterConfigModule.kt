package co.com.monkeymobile.printery.di

import co.com.monkeymobile.printery.PaperTrayImpl
import co.com.monkeymobile.printery.TonerCartridgeImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PrinterConfigModule {

    @Provides
    @Singleton
    fun providePaperTray(): PaperTrayImpl {
        return PaperTrayImpl().apply {
            capacity = 100
            recharge()
        }
    }

    @Provides
    @Singleton
    fun provideTonerCartridge(): TonerCartridgeImpl {
        return TonerCartridgeImpl().apply {
            capacity = 1000
            recharge()
        }
    }
}