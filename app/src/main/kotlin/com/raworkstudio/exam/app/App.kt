package com.raworkstudio.exam.app

import android.app.Application
import org.koin.android.ext.android.startKoin

/**
 *
 *
 * @Author Ivan
 * @Date 8/30/2018 on 2:15 AM
 */
class App: Application() {

    override fun onCreate() {
        super.onCreate()

        // starting koin
//        startKoin(this, listOf(modules))
    }
}