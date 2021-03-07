package com.example.advancedfragmentsmvvm.view.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.advancedfragmentsmvvm.R
import com.example.advancedfragmentsmvvm.viewmodel.RadioViewModel
import kotlinx.android.synthetic.main.podcast_fragment_layout.*



class PodcastFragment : androidx.fragment.app.Fragment() {

    private val radioViewModel by activityViewModels<RadioViewModel>()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
            ): View {
        return inflater. inflate(R.layout.podcast_fragment_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        radioViewModel.countLiveData.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            podcast_main_textview.text = "Live Count at : $it"
        })
    }
}