package com.example.spacex_hw2.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.spacex_hw2.frafments.FragmentLaunches
import com.example.spacex_hw2.frafments.FragmentRockets
import com.example.spacex_hw2.frafments.FragmentUpcoming
import com.example.spacex_hw2.R
import com.example.spacex_hw2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private val fragList = listOf(
        FragmentUpcoming.newInstance(),
        FragmentLaunches.newInstance(),
        FragmentRockets.newInstance()
    )
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.frgContainer, fragList[0]).commit()

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                supportFragmentManager.beginTransaction().replace(R.id.frgContainer, fragList[tab?.position!!]).commit()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }


}