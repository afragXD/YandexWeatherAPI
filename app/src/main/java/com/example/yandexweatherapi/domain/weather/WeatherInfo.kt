package com.example.yandexweatherapi.domain.weather

import com.example.yandexweatherapi.domain.weather.WeatherData

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
