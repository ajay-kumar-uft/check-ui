package com.ext.live.coreui

import android.content.Context
import android.content.Intent
import com.exe.engine.ContourEngine

class CoreUI {

    fun callSdk(context: Context) {
        try {
            ContourEngine.process()
        } catch (e: IllegalStateException) {
            e.printStackTrace()
            println("---- ${e.message}")
        }
        context.startActivity(Intent(context, CheckCaptureActivity::class.java))
    }
}