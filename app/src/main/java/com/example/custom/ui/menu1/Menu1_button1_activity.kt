package com.example.custom.ui.menu1

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.custom.R

class Menu1_button1_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_menu1_button1_activity)
        val imageUri=intent.getIntExtra("imagesrc",0)
        val imageTitle=intent.getStringExtra("imagename")
      //  val imageDesc = intent.getIntExtra("imagedesc",0)

        val imageView = findViewById<ImageView>(R.id.imageView)


        val textView: TextView = findViewById(R.id.textDescription)
        setTitle(imageTitle)
        imageView.setImageResource(imageUri);
    //    textView.setText(imageDesc)


    }
}
