package com.example.unitconverter

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {

    // Length conversion tests
    @Test
    fun testConvertFromMeterToKilometer() {
        val result = Converter.convert(1000.0, "Meter", "Kilometer")
        assertEquals(1.0, result, 0.0001)
    }

    @Test
    fun testConvertFromKilometerToMeter() {
        val result = Converter.convert(1.0, "Kilometer", "Meter")
        assertEquals(1000.0, result, 0.0001)
    }

    @Test
    fun testConvertFromMeterToCentimeter() {
        val result = Converter.convert(1.0, "Meter", "Centimeter")
        assertEquals(100.0, result, 0.0001)
    }

    @Test
    fun testConvertFromMeterToMillimeter() {
        val result = Converter.convert(1.0, "Meter", "Millimeter")
        assertEquals(1000.0, result, 0.0001)
    }

    @Test
    fun testConvertFromMeterToInch() {
        val result = Converter.convert(1.0, "Meter", "Inch")
        assertEquals(39.3701, result, 0.0001)
    }

    @Test
    fun testConvertFromMeterToFoot() {
        val result = Converter.convert(1.0, "Meter", "Foot")
        assertEquals(3.28084, result, 0.0001)
    }

    @Test
    fun testConvertFromMeterToYard() {
        val result = Converter.convert(1.0, "Meter", "Yard")
        assertEquals(1.09361, result, 0.0001)
    }

    @Test
    fun testConvertFromMeterToMile() {
        val result = Converter.convert(1609.34, "Meter", "Mile")
        assertEquals(1.0, result, 0.0001)
    }

    @Test
    fun testConvertFromKilometerToCentimeter() {
        val result = Converter.convert(1.0, "Kilometer", "Centimeter")
        assertEquals(100000.0, result, 0.0001)
    }

    @Test
    fun testConvertFromKilometerToMillimeter() {
        val result = Converter.convert(1.0, "Kilometer", "Millimeter")
        assertEquals(1000000.0, result, 0.0001)
    }

    @Test
    fun testConvertFromKilometerToInch() {
        val result = Converter.convert(1.0, "Kilometer", "Inch")
        assertEquals(39370.1, result, 0.0001)
    }

    @Test
    fun testConvertFromKilometerToFoot() {
        val result = Converter.convert(1.0, "Kilometer", "Foot")
        assertEquals(3280.84, result, 0.0001)
    }

    @Test
    fun testConvertFromKilometerToYard() {
        val result = Converter.convert(1.0, "Kilometer", "Yard")
        assertEquals(1093.61, result, 0.0001)
    }

    @Test
    fun testConvertFromKilometerToMile() {
        val result = Converter.convert(1.60934, "Kilometer", "Mile")
        assertEquals(1.0, result, 0.0001)
    }

    // Temperature conversion tests
    @Test
    fun testConvertFromCelsiusToFahrenheit() {
        val result = Converter.convert(0.0, "Celsius", "Fahrenheit")
        assertEquals(32.0, result, 0.0001)
    }

    @Test
    fun testConvertFromCelsiusToKelvin() {
        val result = Converter.convert(0.0, "Celsius", "Kelvin")
        assertEquals(273.15, result, 0.0001)
    }

    @Test
    fun testConvertFromFahrenheitToCelsius() {
        val result = Converter.convert(32.0, "Fahrenheit", "Celsius")
        assertEquals(0.0, result, 0.0001)
    }

    @Test
    fun testConvertFromFahrenheitToKelvin() {
        val result = Converter.convert(32.0, "Fahrenheit", "Kelvin")
        assertEquals(273.15, result, 0.0001)
    }

    @Test
    fun testConvertFromKelvinToCelsius() {
        val result = Converter.convert(273.15, "Kelvin", "Celsius")
        assertEquals(0.0, result, 0.0001)
    }

    @Test
    fun testConvertFromKelvinToFahrenheit() {
        val result = Converter.convert(273.15, "Kelvin", "Fahrenheit")
        assertEquals(32.0, result, 0.0001)
    }
}