package com.example.giftest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gifDrawable.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_gifDrawableFragment)
        }
        glide.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_glideFragment)
        }
        facebookFresco.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_facebookFrescoFragment)
        }
    }
}