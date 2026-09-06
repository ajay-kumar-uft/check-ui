package com.ext.live.coreui

import android.content.Context
import android.content.Intent
import com.exe.engine.DocumentCallback
import com.exe.engine.DocumentEngine
import com.exe.engine.DocumentType

internal data class CheckRequest(val context: Context)

internal object CheckStarted

internal object CheckEvent

internal class CheckEngine : DocumentEngine<CheckRequest, CheckStarted, CheckEvent> {

    override val documentType: DocumentType = DocumentType.CHECK

    override fun process(
        model: CheckRequest,
        callback: DocumentCallback<CheckStarted, CheckEvent>
    ) {
        model.context.startActivity(Intent(model.context, CheckCaptureActivity::class.java))
        callback.onResult(CheckStarted)
    }
}
