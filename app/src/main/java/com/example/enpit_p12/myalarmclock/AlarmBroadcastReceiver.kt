package com.example.enpit_p12.myalarmclock

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.newTask
import org.jetbrains.anko.toast

class AlarmBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        context?.run {
            startActivity(
                intentFor<MainActivity>("onReceive" to true) .newTask())
        }
    }
}