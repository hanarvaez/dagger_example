package co.com.monkeymobile.printery

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PrinterConfigModule {

    @Provides
    @Singleton
    fun providePaperTray(): PaperTrayImpl {
        return PaperTrayImpl(100)
    }

    @Provides
    @Singleton
    fun provideTonerCartridge(): TonerCartridge {
        return TonerCartridgeImpl(1000)
    }
}