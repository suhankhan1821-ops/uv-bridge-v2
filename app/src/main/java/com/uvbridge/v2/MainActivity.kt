package com.uvbridge.v2

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "UV Bridge V2 - Working"
        tv.textSize = 22f
        setContentView(tv)
    }
}
