package com.pegion.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.pegion.app.ui.navigation.PegionNavHost
import com.pegion.app.ui.theme.PegionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Futuristic edge-to-edge display
        setContent {
            PegionTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    PegionNavHost()
                }
            }
        }
    }
}
