package com.example.giftest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.imagepipeline.request.ImageRequestBuilder
import kotlinx.android.synthetic.main.fragment_facebook_fresco.*

class FacebookFrescoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_facebook_fresco, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadGif()
    }

    private fun loadGif() {
        val request = ImageRequestBuilder.newBuilderWithResourceId(R.drawable.welcome_screen).build()
        val controller = Fresco.newDraweeControllerBuilder()
            .setUri(request.sourceUri)
            .setAutoPlayAnimations(true)
            .build()
        myGif.controller = controller
    }
}