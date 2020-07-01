package com.example.custom.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.custom.R
import com.example.custom.ui.menu1.Menu1_button1_activity
import java.util.*

class GalleryFragment : Fragment(), View.OnClickListener  {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
       // val textView: TextView = root.findViewById(R.id.text_gallery)

        val image1 = root.findViewById<ImageView>(R.id.imageView1)
        image1.setOnClickListener(this);

        val image2 = root.findViewById<ImageView>(R.id.imageView2)
        image2.setOnClickListener(this);

        val image3 = root.findViewById<ImageView>(R.id.imageView3)
        image3.setOnClickListener(this);

        val image4 = root.findViewById<ImageView>(R.id.imageView4)
        image4.setOnClickListener(this);

        val image5 = root.findViewById<ImageView>(R.id.imageView5)
        image5.setOnClickListener(this);

        val image6 = root.findViewById<ImageView>(R.id.imageView6)
        image6.setOnClickListener(this);

        val image7 = root.findViewById<ImageView>(R.id.imageView7)
        image7.setOnClickListener(this);

        val image8 = root.findViewById<ImageView>(R.id.imageView8)
        image8.setOnClickListener(this);

        val image9 = root.findViewById<ImageView>(R.id.imageView9)
        image9.setOnClickListener(this);

        val image10 = root.findViewById<ImageView>(R.id.imageView10)
        image10.setOnClickListener(this);

        val image11 = root.findViewById<ImageView>(R.id.imageView11)
        image11.setOnClickListener(this);

        val image12 = root.findViewById<ImageView>(R.id.imageView12)
        image12.setOnClickListener(this);

        val image13 = root.findViewById<ImageView>(R.id.imageView13)
        image13.setOnClickListener(this);

        val image14 = root.findViewById<ImageView>(R.id.imageView14)
        image14.setOnClickListener(this);

        val image15 = root.findViewById<ImageView>(R.id.imageView15)
        image15.setOnClickListener(this);

        val image16 = root.findViewById<ImageView>(R.id.imageView16)
        image16.setOnClickListener(this);

        val image17 = root.findViewById<ImageView>(R.id.imageView17)
        image17.setOnClickListener(this);

        val image18 = root.findViewById<ImageView>(R.id.imageView18)
        image18.setOnClickListener(this);

        val image19 = root.findViewById<ImageView>(R.id.imageView19)
        image19.setOnClickListener(this);

        val image20 = root.findViewById<ImageView>(R.id.imageView20)
        image20.setOnClickListener(this);


        return root
    }

    override fun onClick(v: View?) {
        val intent = Intent(context, Menu1_button1_activity::class.java);
        when (v?.id) {
            R.id.imageView1 -> {
               intent.putExtra("imagesrc",R.drawable.g1_400x284)
            }
            R.id.imageView2 -> {
                intent.putExtra("imagesrc",R.drawable.g2_400x284)
            }
            R.id.imageView3 -> {
                intent.putExtra("imagesrc",R.drawable.g3_400x284)
            }
            R.id.imageView4 -> {
                intent.putExtra("imagesrc",R.drawable.g4_400x284)
            }
            R.id.imageView5 -> {
                intent.putExtra("imagesrc",R.drawable.g5_400x284)
            }
            R.id.imageView6 -> {
                intent.putExtra("imagesrc",R.drawable.g6_400x284)
            }
            R.id.imageView7 -> {
                intent.putExtra("imagesrc",R.drawable.g7_400x284)
            }
            R.id.imageView8 -> {
                intent.putExtra("imagesrc",R.drawable.g8_400x284)
            }
            R.id.imageView9 -> {
                intent.putExtra("imagesrc",R.drawable.g9_400x284)
            }
            R.id.imageView10 -> {
                intent.putExtra("imagesrc",R.drawable.g10_400x284)
            }
            R.id.imageView11-> {
                intent.putExtra("imagesrc",R.drawable.g11_400x284)
            }
            R.id.imageView12 -> {
                intent.putExtra("imagesrc",R.drawable.g12_400x284)
            }

            R.id.imageView13 -> {
                intent.putExtra("imagesrc",R.drawable.g13_400x284)
            }
            R.id.imageView14-> {
                intent.putExtra("imagesrc",R.drawable.g14_400x284)
            }
            R.id.imageView15 -> {
                intent.putExtra("imagesrc",R.drawable.g15_400x284)
            }
            R.id.imageView16-> {
                intent.putExtra("imagesrc",R.drawable.g16_400x284)
            }

        }
        startActivity(intent);
    }
}
