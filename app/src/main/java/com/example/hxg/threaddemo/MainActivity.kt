package com.example.hxg.threaddemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ThreadDemo("Thread 1")
        ThreadDemo("Thread 2")
        ThreadDemo("Thread 3")
    }
}
