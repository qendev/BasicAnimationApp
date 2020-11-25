package com.example.basicanimationapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var animFadein: Animation


    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //loading Animation
        animFadein = AnimationUtils.loadAnimation(applicationContext, R.transition.bounce)
        //loadAnimation() method is used to load the desired animation

        //handling aniamtion on button click
        buttonClickMe.setOnClickListener {
            textviewAnimateMe.setVisibility(View.VISIBLE)

            textviewAnimateMe.startAnimation(animFadein)
            //startAnimation() method is used to start an animation on a particular component
        }
    }


}