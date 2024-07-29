package com.example.unitconverter

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var inputValue: TextInputEditText
    private lateinit var fromUnitSpinner: Spinner
    private lateinit var toUnitSpinner: Spinner
    private lateinit var resultTextView: TextView
    private lateinit var convertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputValue = findViewById(R.id.inputValue)
        fromUnitSpinner = findViewById(R.id.fromUnitSpinner)
        toUnitSpinner = findViewById(R.id.toUnitSpinner)
        resultTextView = findViewById(R.id.resultTextView)
        convertButton = findViewById(R.id.convertButton)

        val unitsArray = resources.getStringArray(R.array.units_array)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, unitsArray)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        fromUnitSpinner.adapter = adapter
        toUnitSpinner.adapter = adapter

        convertButton.setOnClickListener {
            val input = inputValue.text.toString().toDoubleOrNull()
            if (input != null) {
                val fromUnit = fromUnitSpinner.selectedItem.toString()
                val toUnit = toUnitSpinner.selectedItem.toString()
                val result = Converter.convert(input, fromUnit, toUnit)
                resultTextView.text = result.toString()
            } else {
                resultTextView.text = "Invalid input"
            }
        }
    }
}