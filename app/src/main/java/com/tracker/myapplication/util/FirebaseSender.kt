package com.tracker.myapplication.util

object FirebaseSender {
    fun sendToUser(renterId: String, message: String) {
        // Placeholder for sending push notification to the user via Firebase
        println("Sending FCM to renter [$renterId]: $message")
        // Example (commented out real call)
        /*
        val json = JSONObject().apply {
            put("to", "/topics/$renterId")
            put("notification", JSONObject().apply {
                put("title", "Speed Limit Exceeded!")
                put("body", message)
            })
        }

        sendFirebaseMessage(json)
        */
    }

    fun sendToCompany(sessionId: String, message: String) {
        // Placeholder for sending push notification to the company via Firebase
        println("Sending FCM to company for session [$sessionId]: $message")
        // Example (commented out real call)
        /*
        val json = JSONObject().apply {
            put("to", "/topics/company_$sessionId")
            put("notification", JSONObject().apply {
                put("title", "Alert: Speed Violation")
                put("body", message)
            })
        }

        sendFirebaseMessage(json)
        */
    }
    // method for actual network call
    private fun sendFirebaseMessage(payload: Any) {
        // Use Retrofit or OkHttp to post the JSON to FCM endpoint with server key
        // This is left unimplemented for this exercise
    }
}