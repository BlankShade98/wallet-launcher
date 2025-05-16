package com.shady.walletlauncher

import android.os.Bundle
import android.content.ComponentName
import android.content.Intent
import androidx.activity.ComponentActivity

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent().apply {
            component = ComponentName("com.google.android.gms", "com.google.android.gms.pay.deeplink.DeepLinkActivity")
        }
        try {
            startActivity(intent)
        } catch (e: android.content.ActivityNotFoundException) {
            finish()
        }
        finish()
    }
}