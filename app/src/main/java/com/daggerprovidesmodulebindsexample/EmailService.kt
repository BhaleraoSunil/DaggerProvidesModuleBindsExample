package com.bpointer.userregdemowithoutdependencyapproach.fieldinjection

import android.util.Log
import com.bpointer.userregdemowithoutdependencyapproach.ctor_injection.Utils.Companion.TAG2
import javax.inject.Inject

class EmailService @Inject constructor(){

    fun send(from:String,to:String,emailBody:String){
        Log.e(TAG2,"Email sent")
    }
}