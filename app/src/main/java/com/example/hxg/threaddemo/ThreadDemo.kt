package com.example.hxg.threaddemo

import android.util.Log

class ThreadDemo internal constructor(str: String) : Runnable {

    internal var t: Thread = Thread(this, str)

    init {
        // this will call run() function
        t.start()
    }

    override fun run() {

        for (i in 0..40) {
            // yields control to another thread every 5 iterations
            if (i % 5 == 0) {
                Log.v("ThreadDemo", Thread.currentThread().name + " yielding control...")

                /* causes the currently executing thread object to temporarily
            pause and allow other threads to execute */
                Thread.yield()
            }
        }

        Log.i("ThreadDemo", Thread.currentThread().name + " has finished executing.")
    }
}
