package com.example.android.hilt.data

import javax.security.auth.callback.Callback

/**
 * Created by MasterChen on 2021/2/7
 */
interface LoggerDataSource {
    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()

}