package com.example.login.custom.drawable

import android.graphics.*
import android.graphics.drawable.Drawable


class LoginHeadBGDrawable(val color: Int) : Drawable() {
    private val mPaint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)

    init {
        mPaint.color = color
    }

    override fun draw(canvas: Canvas) {
        val rect = bounds
        val mode: PorterDuff.Mode = PorterDuff.Mode.SRC

        val saveLayer = canvas.saveLayer(
            RectF(
                bounds.left.toFloat(),
                bounds.top.toFloat(),
                bounds.right.toFloat(),
                bounds.bottom.toFloat()
            ), null
        )

        canvas.drawOval(
            RectF(
                rect.left.toFloat() - 50f,
                rect.top.toFloat(),
                rect.right.toFloat() + 50f,
                rect.bottom.toFloat()
            ),
            mPaint
        )

        mPaint.xfermode = PorterDuffXfermode(mode)

        canvas.drawRect(
            RectF(
                rect.left.toFloat(),
                rect.top.toFloat(),
                rect.right.toFloat(),
                rect.bottom.toFloat() / 2
            ), mPaint
        )

        mPaint.xfermode = null

        canvas.restoreToCount(saveLayer)
    }

    override fun setAlpha(alpha: Int) {
        mPaint.alpha = alpha
        invalidateSelf()
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        mPaint.colorFilter = colorFilter
        invalidateSelf()
    }

    override fun getOpacity(): Int {
        return PixelFormat.TRANSLUCENT
    }
}