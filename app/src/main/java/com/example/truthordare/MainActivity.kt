package com.example.truthordare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.truthordare.databinding.ActivityMainBinding
import kotlin.random.Random
import android.view.animation.RotateAnimation
import android.view.animation.Animation


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val rand: Random = Random
    private var lstDr = 0
    private var spn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnDare.setOnClickListener {
           val intent = Intent(this, DareActivity::class.java)
           startActivity(intent)
       }

        binding.btnTruth.setOnClickListener {
            val truthIntent = Intent(this, TruthActivity::class.java)
            startActivity(truthIntent)

        }


    }

    fun spinBottle(view: View) {
        if (!spn) {
            val num: Int = rand.nextInt(1800)
            val pX = (binding.imgBottle.width / 2).toFloat()
            val pY = (binding.imgBottle.height / 2).toFloat()
            val rot: Animation = RotateAnimation(lstDr.toFloat(), num.toFloat(), pX, pY)
            rot.duration = 3000
            rot.fillAfter = true
            rot.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation) {
                    spn = true
                }

                override fun onAnimationEnd(animation: Animation) {
                    spn = false
                }

                override fun onAnimationRepeat(animation: Animation) {}
            })

            lstDr = num
            binding.imgBottle.startAnimation(rot)
        }


    }

}




