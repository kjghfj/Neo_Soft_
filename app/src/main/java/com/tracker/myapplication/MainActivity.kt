package com.tracker.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tracker.myapplication.model.Car
import com.tracker.myapplication.model.RentalSession
import com.tracker.myapplication.service.NotificationService
import com.tracker.myapplication.service.SpeedMonitorService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        fetchDataFromCar()
    }

    fun fetchDataFromCar() {
        val car = Car("CAR123", 110)
        val session = RentalSession("SESSION001", "CAR123", "RENTER001", 100)

        val notificationService = NotificationService()
        val speedMonitor = SpeedMonitorService(notificationService)

        speedMonitor.checkSpeed(car, session)
    }
}