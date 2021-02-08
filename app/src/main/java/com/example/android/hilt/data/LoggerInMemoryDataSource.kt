package com.example.android.hilt.data

import dagger.hilt.android.scopes.ActivityScoped
import java.util.*
import javax.inject.Inject

/**
 * Created by MasterChen on 2021/2/7
 */
@ActivityScoped
class LoggerInMemoryDataSource @Inject constructor(): LoggerDataSource {
    private val logs = LinkedList<Log>()
    override fun addLog(msg: String) {
        logs.addFirst(Log(msg, System.currentTimeMillis()))
    }

    override fun getAllLogs(callback: (List<Log>) -> Unit) {
        callback(logs)
    }

    override fun removeLogs() {
        logs.clear()
    }
}