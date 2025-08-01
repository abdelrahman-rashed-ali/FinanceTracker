package com.example.financetracker.ui.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.financetracker.R
import com.example.financetracker.ui.finance.FinanceActivity

 const val TAG = "lifeCycle"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val mainBtn = findViewById<Button>(R.id.main_btn)
        mainBtn.setOnClickListener {
            val intent = Intent(this, FinanceActivity::class.java)
            startActivity(intent)
        }

        val shareButton = findViewById<ImageView>(R.id.share_btn)
        shareButton.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello from Finance Tracker App!")
            startActivity(Intent.createChooser(shareIntent, "Share via"))

        }
        Log.d(TAG, "Main ▶ onCreate() called")

    }

    override fun onStart() {
        super.onStart(); Log.d(TAG, "Main ▶ onStart() called")
    }

    override fun onResume() {
        super.onResume(); Log.d(TAG, "Main ▶ onResume() called")
    }

    override fun onPause() {
        super.onPause(); Log.d(TAG, "Main ▶ onPause() called")
    }

    override fun onStop() {
        super.onStop(); Log.d(TAG, "Main ▶ onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy(); Log.d(TAG, "Main ▶ onDestroy() called")
    }
}