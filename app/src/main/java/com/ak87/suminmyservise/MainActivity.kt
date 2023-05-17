package com.ak87.suminmyservise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ak87.suminmyservise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.simpleService.setOnClickListener {
            startService(MyService.newIntent(this, 25))

        }
    }
}