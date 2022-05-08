package com.bpointer.userregdemowithoutdependencyapproach.fieldinjection

import javax.inject.Inject


class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository ,
    private val emailService: EmailService
) {


    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password);
        emailService.send("sunil@gmail.com",email,"Welcome, thanks for registration.")
    }

}