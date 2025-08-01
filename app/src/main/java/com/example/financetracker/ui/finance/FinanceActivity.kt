package com.example.financetracker.ui.finance

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.financetracker.R
import com.google.android.material.textfield.MaterialAutoCompleteTextView

class FinanceActivity : AppCompatActivity() {
    private val TAG = "FinanceActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_finance)
        Log.d(TAG, "onCreate called")
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

        findViewById<ImageButton>(R.id.arrowBack).setOnClickListener{
            finish()
        }
    }

    override fun onCreateView(
        parent: View?,
        name: String,
        context: Context,
        attrs: AttributeSet
    ): View? {
        Log.d(TAG, "hello from onCreateView")
        return super.onCreateView(parent, name, context, attrs)
    }

    override fun onStart() { super.onStart(); Log.d(TAG, "onStart called") }
    override fun onResume() { super.onResume(); Log.d(TAG, "onResume called") }
    override fun onPause() { super.onPause(); Log.d(TAG, "onPause called") }
    override fun onStop() { super.onStop(); Log.d(TAG, "onStop called") }
    override fun onDestroy() { super.onDestroy(); Log.d(TAG, "onDestroy called") }


}