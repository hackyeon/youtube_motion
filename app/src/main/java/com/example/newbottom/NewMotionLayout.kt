package com.example.newbottom

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.ViewConfiguration
import androidx.constraintlayout.motion.widget.MotionLayout

class NewMotionLayout @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0): MotionLayout(context, attrs, defStyleAttr) {
    private var mStartTime: Long = 0

    override fun onInterceptTouchEvent(event: MotionEvent?): Boolean {
        if(event == null) return super.onInterceptTouchEvent(null)
        if ( event.action == MotionEvent.ACTION_DOWN ) {
            mStartTime = event.eventTime
        } else if ( event.action == MotionEvent.ACTION_UP ) {
            if ( event.eventTime - mStartTime <= ViewConfiguration.getTapTimeout() ) {
                return false
            }
        }
        return super.onInterceptTouchEvent(event);
    }
}