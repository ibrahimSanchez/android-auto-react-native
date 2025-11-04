package com.miappconandroidauto

import android.content.Intent
import androidx.car.app.CarAppService
import androidx.car.app.Screen
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator

class MyCarService : CarAppService() {
    
    override fun createHostValidator(): HostValidator {
        // Para desarrollo, permitir todos los hosts
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }

    override fun onCreateSession(): Session {
        return object : Session() {
            override fun onCreateScreen(intent: Intent): Screen {
                return HelloWorldScreen(carContext)
            }
        }
    }
}