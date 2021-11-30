package com.sunnyweather.android.logic.model

data class RealtimeResponse(val status: String, val result: Result) {

    data class AQI(val chn: Float)

    data class AirQuality(val aqi: AQI)

    data class Realtime(val skycon: String, val temperature: Float, val airQuality: AirQuality)

    data class Result(val realtime: Realtime)

}
