package com.daggerprovidesmodulebindsexample
import com.daggerprovidesmodulebindsexample.MainActivity
import com.daggerprovidesmodulebindsexample.NotificationServiceModule
import com.daggerprovidesmodulebindsexample.UserRepositoryModule
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(activity: MainActivity)
}