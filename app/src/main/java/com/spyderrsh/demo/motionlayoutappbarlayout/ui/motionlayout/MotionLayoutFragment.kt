package com.spyderrsh.demo.motionlayoutappbarlayout.ui.motionlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.spyderrsh.demo.motionlayoutappbarlayout.R

class MotionLayoutFragment : Fragment() {

    private lateinit var motionLayoutViewModel: MotionLayoutViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        motionLayoutViewModel =
            ViewModelProvider(this).get(MotionLayoutViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_motion_layout, container, false)
        return root
    }
}