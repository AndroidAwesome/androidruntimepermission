package com.example.androidruntimepermission

import android.Manifest
import android.app.Activity
import android.content.Context
import android.support.v4.app.ActivityCompat

/****
 *
 * Create by AndroidAwesome Date 25/06/2018
 *
 */

object AndroidRuntimePermission {

    fun onRequestLocationPermission(context: Context, intentCode: Int) {
        ActivityCompat.requestPermissions(context as Activity, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                intentCode)
    }

    fun onRequestCameraPermission(context: Context, intentCode: Int) {
        ActivityCompat.requestPermissions(context as Activity,
                arrayOf(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE),
                intentCode)
    }

    fun onRequestGalleryPermissions(context: Context, intentCode: Int) {
        ActivityCompat.requestPermissions(context as Activity,
                arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                intentCode)
    }

    fun onRequestRuntimePermissions(context: Context, intentCode: Int, permissions: Array<String>) {
        ActivityCompat.requestPermissions(context as Activity, permissions, intentCode)
    }

    fun onRequestVoiceRecordPermissions(context: Context, intentCode: Int) {
        ActivityCompat.requestPermissions(context as Activity, arrayOf(Manifest.permission.RECORD_AUDIO, Manifest.permission.WRITE_EXTERNAL_STORAGE),
                intentCode)
    }

    fun onRequestContactPermission(context: Context, intentCode: Int) {
        ActivityCompat.requestPermissions(context as Activity,
                arrayOf(Manifest.permission.READ_CONTACTS),
                intentCode)
    }

    fun onRequestWriteExternalStorage(context: Context, intentCode: Int) {
        ActivityCompat.requestPermissions(context as Activity, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                intentCode)
    }

    fun onRequestReadExternalStorage(context: Context, intentCode: Int) {
        ActivityCompat.requestPermissions(context as Activity, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                intentCode)
    }
}