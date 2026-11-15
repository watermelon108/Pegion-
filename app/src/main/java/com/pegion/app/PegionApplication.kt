package com.pegion.app

import android.app.Application

class PegionApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Future: Initialize Room DB, Addon Engine, Download Manager here
    }
}
