package com.example.testphotos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvPhotos:RecyclerView
    lateinit var ivImage:ImageView
    lateinit var tvCaptions:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getImages()
    }
    fun getImages(){
        rvPhotos=findViewById(R.id.rvPhotos)
        ivImage=findViewById(R.id.ivImage)
        tvCaptions=findViewById(R.id.tvcaptions)
    }
}