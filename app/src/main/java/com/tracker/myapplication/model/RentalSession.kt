package com.tracker.myapplication.model

data class RentalSession( val sessionId: String,
                          val carId: String,
                          val renterId: String,
                          val maxAllowedSpeed: Int) // in km/h

