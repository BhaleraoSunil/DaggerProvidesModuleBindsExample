package com.bpointer.userregdemowithoutdependencyapproach.fieldinjection

import android.util.Log
import com.bpointer.userregdemowithoutdependencyapproach.ctor_injection.Utils.Companion.TAG
import com.bpointer.userregdemowithoutdependencyapproach.ctor_injection.Utils.Companion.TAG2
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email:String,password:String){
        Log.e(TAG2,"USer saved in db")
    }
}