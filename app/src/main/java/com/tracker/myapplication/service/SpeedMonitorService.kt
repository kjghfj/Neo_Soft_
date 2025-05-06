package com.tracker.myapplication.service

import com.tracker.myapplication.`interface`.SpeedMonitor
import com.tracker.myapplication.model.Car
import com.tracker.myapplication.model.RentalSession

class SpeedMonitorService (private val notificationService: NotificationService) : SpeedMonitor {
    override fun checkSpeed(car: Car, session: RentalSession) {
        if (car.currentSpeed > session.maxAllowedSpeed) {
            notificationService.notifyRenter(session.renterId, car.currentSpeed)
            notificationService.notifyCompany(session.sessionId, car.currentSpeed)
        }
    }
}