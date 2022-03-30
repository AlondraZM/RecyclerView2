package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"An awesone video title\", \"channel\": \"ChannelName\", \"views\": \"6k views\", \"datePosted\": \"5 days ago\", \"duration\": \"5:00:00\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"Channel\", \"views\": \"8k views\", \"datePosted\": \"5 days ago\", \"duration\": \"5:00:00\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"Channel\", \"views\": \"10k views\", \"datePosted\": \"5 days ago\", \"duration\": \"5:25:00\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"Channel\", \"views\": \"150k views\", \"datePosted\": \"A month ago\", \"duration\": \"5:02:00\"}"),
            JSONObject("{\"title\": \"John\", \"channel\": \"Channel\", \"views\": \"254k views\", \"datePosted\": \"2 years ago\", \"duration\": \"5:00:00\"}")
        )

        binding.rvVideoEntries.adapter = MainAdapter(fakeVideoData)
    }
}