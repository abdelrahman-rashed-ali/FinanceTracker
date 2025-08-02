package com.example.financetracker.ui.finance

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.financetracker.R
import com.example.financetracker.ui.main.TAG
import com.google.android.material.textfield.MaterialAutoCompleteTextView


class FinanceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_finance)
        Log.d(TAG, "Finance ▶ onCreate() called")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up the dropdown for MaterialAutoCompleteTextView
        val categoryAutoComplete =
            findViewById<MaterialAutoCompleteTextView>(R.id.categoryAutoComplete)
        val items = resources.getStringArray(R.array.dropdown_items)
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items)
        categoryAutoComplete.setAdapter(adapter)

        findViewById<ImageButton>(R.id.arrowBack).setOnClickListener {
            finish()
        }
    }


    override fun onStart() {
        super.onStart(); Log.d(TAG, "Finance ▶ onStart() called")
    }

    override fun onResume() {
        super.onResume(); Log.d(TAG, "Finance ▶ onResume() called")
    }

    override fun onPause() {
        super.onPause(); Log.d(TAG, "Finance ▶ onPause() called")
    }

    override fun onStop() {
        super.onStop(); Log.d(TAG, "Finance ▶ onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy(); Log.d(TAG, "Finance ▶ onDestroy() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Finance ▶ onRestart() called")
    }


}