# Neo_Soft_
A car rental company wants notifications if the renter of a car drives at a speed above a given limit

Assumption of car rental assignment

1. A car has a GPS unit that constantly provides speed data.
2. Speed limit is set per rental session and is configurable before the rental starts.
3. Firebase Cloud Messaging (FCM) is used to send alerts.
4. Notifications are sent to:
The rental company (via Firebase, later can be extended to AWS SNS/SQS).

The renter (warning alert via Firebase).

No UI is needed; only core classes/interfaces.

Data classes and services will be created in Kotlin .

Project Structure
car-rental-speed-alert/
├── model/
│   ├── RentalSession.kt
│   └── Car.kt
├── service/
│   ├── SpeedMonitorService.kt
│   ├── NotificationService.kt
│ 
├── interface/
│   └── SpeedMonitor.kt
├── util/
│   └── FirebaseSender.kt
├── Main.kt
├── README.md
└── .gitignore
