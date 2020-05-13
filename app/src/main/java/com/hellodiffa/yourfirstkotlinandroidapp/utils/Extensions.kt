package com.hellodiffa.yourfirstkotlinandroidapp.utils

import android.app.Activity
import android.content.Context
import android.util.Log
import android.widget.Toast

fun Activity.log(message: String) {
    Log.d(this.javaClass.simpleName, message)
}

fun Context.toastLong(message: String){
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}