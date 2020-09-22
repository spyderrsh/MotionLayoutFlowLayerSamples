package com.spyderrsh.demo.motionlayoutappbarlayout.ui.flow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.spyderrsh.demo.motionlayoutappbarlayout.R

class FlowFragment : Fragment() {

    private lateinit var flowViewModel: FlowViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        flowViewModel =
            ViewModelProvider(this).get(FlowViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_flow, container, false)
        return root
    }
}