package com.example.common.custom.view

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.Log
import androidx.core.content.ContextCompat
import com.example.common.R

class MyMaterialButton @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : com.google.android.material.button.MaterialButton(context, attributeSet, defStyleAttr) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun getBackground(): Drawable {
        return ContextCompat.getDrawable(context, R.drawable.button_background)
            ?: super.getBackground()
    }
}