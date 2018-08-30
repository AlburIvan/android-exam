package com.raworkstudio.exam.features

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.findNavController
import com.raworkstudio.exam.R
import kotlinx.android.synthetic.main.activity_home.*

/**
 *
 *
 * @Author Ivan
 * @Date 5/30/2018 on 2:41 AM
 */
class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)
    }


    override fun onSupportNavigateUp() = findNavController(R.id.mainNavigationFragment).navigateUp()
}