package com.miappconandroidauto

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template

class HelloWorldScreen(carContext: CarContext) : Screen(carContext) {
    
    override fun onGetTemplate(): Template {
        return MessageTemplate.Builder("¡Hola Mundo!\n\nEsta es mi primera app de Android Auto con React Native")
            .setTitle("Mi App React Native")
            .setHeaderAction(Action.APP_ICON)
            .build()
    }
}