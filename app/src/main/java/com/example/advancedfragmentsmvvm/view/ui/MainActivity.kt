package com.example.advancedfragmentsmvvm.view.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.advancedfragmentsmvvm.R
import com.example.advancedfragmentsmvvm.databinding.ActivityMainBinding
import com.example.advancedfragmentsmvvm.view.adapter.RadioViewPagerAdapter


//Bottom-Navigation-View for Radio Station App
class MainActivity : AppCompatActivity(), ViewPager.OnPageChangeListener {

    private lateinit var binding: ActivityMainBinding

    private lateinit var radioViewGroupAdapter: FragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        radioViewGroupAdapter = RadioViewPagerAdapter(supportFragmentManager)
        binding.mainViewpager.adapter = radioViewGroupAdapter

        binding.mainViewpager.addOnPageChangeListener(this)

        binding.mainNavigationview.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.podcast_menu_item -> binding.mainViewpager.currentItem = 0
                R.id.live_menu_item -> binding.mainViewpager.currentItem = 1
                R.id.settings_menu_item -> binding.mainViewpager.currentItem = 2
            }
            true
        }
    }

    override fun onPageScrollStateChanged(state: Int) {
        //Do nothing
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        //Do nothing
    }

    override fun onPageSelected(position: Int) {
        binding.mainNavigationview.selectedItemId = when (position) {
            0 -> R.id.podcast_menu_item
            1 -> R.id.live_menu_item
            else -> R.id.settings_menu_item
        }
    }
}