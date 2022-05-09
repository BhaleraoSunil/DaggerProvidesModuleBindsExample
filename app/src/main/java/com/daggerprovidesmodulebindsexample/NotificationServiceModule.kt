package com.daggerprovidesmodulebindsexample


import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {
    //way 1
   /* @Provides
    fun getMessageService():NotificationService{
        return MessageService()
    }*/

    /*
    * If we provide Notification Servcice dependency using multiple ways then dagger ggenerates error like:
    * error: [Dagger/DuplicateBindings] com.daggerprovidesmodulebindsexample.NotificationService is bound multiple times
    * So we need to either provide only one type binding  dependency or need to use named annotations.
    * For now we only use one  type binding & will comment above
    * */

    //way 2
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}