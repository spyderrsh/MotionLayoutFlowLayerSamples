package com.spyderrsh.demo.motionlayoutappbarlayout.ui.layer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.spyderrsh.demo.motionlayoutappbarlayout.R
import com.spyderrsh.demo.motionlayoutappbarlayout.ui.motionlayout.LayerViewModel

class LayerFragment : Fragment() {

    private lateinit var motionLayoutViewModel: LayerViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        motionLayoutViewModel =
            ViewModelProvider(this).get(LayerViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_layer, container, false)
        return root
    }
}