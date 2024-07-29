package com.example.unitconverter

object Converter {

    fun convert(value: Double, fromUnit: String, toUnit: String): Double {
        return when (fromUnit) {
            "Meter" -> convertFromMeter(value, toUnit)
            "Kilometer" -> convertFromKilometer(value, toUnit)
            "Celsius" -> convertFromCelsius(value, toUnit)
            "Fahrenheit" -> convertFromFahrenheit(value, toUnit)
            "Kelvin" -> convertFromKelvin(value, toUnit)
            else -> value
        }
    }

    private fun convertFromMeter(value: Double, toUnit: String): Double {
        return when (toUnit) {
            "Kilometer" -> value / 1000
            "Centimeter" -> value * 100
            "Millimeter" -> value * 1000
            "Inch" -> value * 39.3701
            "Foot" -> value * 3.28084
            "Yard" -> value * 1.09361
            "Mile" -> value / 1609.34
            else -> value
        }
    }

    private fun convertFromKilometer(value: Double, toUnit: String): Double {
        return when (toUnit) {
            "Meter" -> value * 1000
            "Centimeter" -> value * 100000
            "Millimeter" -> value * 1000000
            "Inch" -> value * 39370.1
            "Foot" -> value * 3280.84
            "Yard" -> value * 1093.61
            "Mile" -> value / 1.60934
            else -> value
        }
    }

    private fun convertFromCelsius(value: Double, toUnit: String): Double {
        return when (toUnit) {
            "Fahrenheit" -> value * 9 / 5 + 32
            "Kelvin" -> value + 273.15
            else -> value
        }
    }

    private fun convertFromFahrenheit(value: Double, toUnit: String): Double {
        return when (toUnit) {
            "Celsius" -> (value - 32) * 5 / 9
            "Kelvin" -> (value - 32) * 5 / 9 + 273.15
            else -> value
        }
    }

    private fun convertFromKelvin(value: Double, toUnit: String): Double {
        return when (toUnit) {
            "Celsius" -> value - 273.15
            "Fahrenheit" -> (value - 273.15) * 9 / 5 + 32
            else -> value
        }
    }
}