package com.app.sygictask

import android.app.Application
import com.app.sygictask.ui.home.HomeViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application() {
    private val appModule = module {
        viewModel { HomeViewModel() }
    }

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            androidLogger()
            modules(appModule)
        }
    }
}