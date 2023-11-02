package com.example.mymusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymusic.databinding.ActivityMusicNameBinding

class MusicNameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMusicNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMusicNameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val second=intent?.getStringExtra("key")
        binding.nameMusic.text=second
        binding.play.setOnClickListener {
            finish()
        }


    }



}