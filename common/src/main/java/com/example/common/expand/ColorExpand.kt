package com.example.common.expand

import android.graphics.Color

val Color.int
    get() = Color.parseColor(this.toString())