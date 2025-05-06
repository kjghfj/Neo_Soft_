package com.tracker.myapplication.`interface`

import com.tracker.myapplication.model.Car
import com.tracker.myapplication.model.RentalSession

interface SpeedMonitor {
    fun checkSpeed(car: Car, session: RentalSession)
}