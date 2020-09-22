package com.spyderrsh.demo.motionlayoutappbarlayout.ui.toolbar
/*
Credit to camaelon:
https://gist.github.com/camaelon/7ab5fb5b22d7d73289917a2572663a43
 */
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.constraintlayout.motion.widget.MotionLayout
import com.google.android.material.appbar.AppBarLayout


class CollapsibleToolbarMotionLayout
@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : MotionLayout(context, attrs, defStyleAttr), AppBarLayout.OnOffsetChangedListener {
    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        appBarLayout?.totalScrollRange?.toFloat()?.let { scrollRange ->
            progress = -verticalOffset.toFloat() / scrollRange
            Log.d("MotionLayoutProgress","$progress")
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        val staticParent = parent
        if (staticParent is AppBarLayout) {
            staticParent.addOnOffsetChangedListener(this)
        } else {
            throw IllegalStateException("The parent of MotionCollapsibleToolbar must be an AppBarLayout. The parent was $staticParent")
        }
    }
}