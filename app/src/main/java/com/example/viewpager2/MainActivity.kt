package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.kermit1,
            R.drawable.kermit2,
            R.drawable.kermit3
        )

        val adapter = ViewPagerAdapter(images)
        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        viewPager.adapter = adapter
        val tabLayout: TabLayout = findViewById(R.id.tabLayout)

        // Set tab title
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
    }
}

// https://www.youtube.com/watch?v=-wB_JE_PRTo
// https://www.youtube.com/watch?v=h41FnEH91D0
