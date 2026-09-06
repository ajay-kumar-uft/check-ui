package com.ext.live.coreui

import android.content.Context
import androidx.startup.Initializer
import com.exe.engine.ContourDocumentEngine

class CheckInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        ContourDocumentEngine.register(CheckEngine())
    }

    override fun dependencies() = emptyList<Class<out Initializer<*>>>()
}
