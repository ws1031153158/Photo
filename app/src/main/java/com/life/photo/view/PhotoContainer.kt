package com.life.photo.view

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout

class PhotoContainer(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) :
    ConstraintLayout(context, attrs, defStyleAttr, defStyleRes) {
        constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0, 0)
}