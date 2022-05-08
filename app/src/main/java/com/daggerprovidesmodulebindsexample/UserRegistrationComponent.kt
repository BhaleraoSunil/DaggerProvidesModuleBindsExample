package com.bpointer.userregdemowithoutdependencyapproach.fieldinjection

import com.daggerprovidesmodulebindsexample.MainActivity
import dagger.Component

@Component
interface UserRegistrationComponent {




    fun inject(activity: MainActivity)
}