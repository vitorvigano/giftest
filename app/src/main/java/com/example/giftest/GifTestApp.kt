package com.example.giftest

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

class GifTestApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }
}