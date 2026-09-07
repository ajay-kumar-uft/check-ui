package com.ext.live.coreui

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import com.exe.engine.DocumentCallback
import com.exe.engine.DocumentEngine
import com.exe.engine.DocumentType
import com.exe.engine.models.DocumentInputModel
import com.exe.engine.models.DocumentResultModel

internal data class CheckRequest(val context: Context)

internal object CheckStarted

internal object CheckEvent

internal class CheckEngine : DocumentEngine {

    override val documentType: DocumentType = DocumentType.CHECK

    override fun process(
        model: DocumentInputModel,
        callback: DocumentCallback
    ) {
        println("------ process CheckEngine")
        model.context.startActivity(Intent(model.context, CheckCaptureActivity::class.java))
        val result = DocumentResultModel("front", "rear")
        callback.onResult(result)
    }
}
