package com.ext.live.coreui

import android.content.Context
import android.content.Intent
import com.exe.engine.ContourDocumentEngine
import com.exe.engine.ContourEngine
import com.exe.engine.DocumentCallback
import com.exe.engine.DocumentType

class CoreUI {

    fun callSdk(context: Context) {
        try {
            ContourEngine.process()

//            ContourDocumentEngine.process(
//                documentType = DocumentType.CHECK,
//                model = CheckRequest(context),
//                callback = object : DocumentCallback<CheckStarted, CheckEvent> {
//                    override fun onResult(result: CheckStarted) = Unit
//                }
//            )
        } catch (e: IllegalStateException) {
            e.printStackTrace()
            println("---- ${e.message}")
        }
        context.startActivity(Intent(context, CheckCaptureActivity::class.java))
    }
}
