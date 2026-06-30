package com.ext.live.coreui

import com.exe.engine.ContourEngine

class CoreUI {

    fun callSdk() {
        try {
            ContourEngine.process()
        } catch (e: IllegalStateException) {
            e.printStackTrace()
            println("---- ${e.message}")
        }
    }
}