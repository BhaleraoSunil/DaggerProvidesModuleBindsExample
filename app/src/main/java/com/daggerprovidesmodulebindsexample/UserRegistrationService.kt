package com.daggerprovidesmodulebindsexample

import javax.inject.Inject


class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository ,
    private val notificationService: NotificationService
) {


    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password);
        notificationService.send("sunil@gmail.com",email,"Welcome, thanks for registration.")
    }

}