package com.tracker.myapplication.service

import com.tracker.myapplication.util.FirebaseSender

class NotificationService {
    fun notifyRenter(renterId: String, speed: Int) {
        val message = "You are driving at $speed km/h which exceeds the permitted limit."
        FirebaseSender.sendToUser(renterId, message)
    }

    fun notifyCompany(sessionId: String, speed: Int) {
        val message = "Renter exceeded speed limit: $speed km/h."
        FirebaseSender.sendToCompany(sessionId, message)
    }
}