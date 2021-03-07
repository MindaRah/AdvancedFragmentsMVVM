package com.example.advancedfragmentsmvvm.view.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.advancedfragmentsmvvm.view.ui.LiveFragment
import com.example.advancedfragmentsmvvm.view.ui.PodcastFragment
import com.example.advancedfragmentsmvvm.view.ui.SettingsFragment


class RadioViewPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    //static variables
    companion object {
        val FRAGMENT_COUNT = 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> PodcastFragment()
            1 -> LiveFragment()
            else -> SettingsFragment()
        }
    }

    override fun getCount(): Int = FRAGMENT_COUNT

}