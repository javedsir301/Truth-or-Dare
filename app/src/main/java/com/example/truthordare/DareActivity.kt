package com.example.truthordare


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.truthordare.databinding.ActivityDareBinding
import java.util.*

class DareActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDareBinding
    val dareList = arrayListOf("Do 21 squats."," Show the most embarrassing photo on your phone",
        "Give a foot massage to the person on your right",
        "Say something dirty to the person on your left",
        "Let the rest of the group DM someone from your Whatsapp account",
        "Like and Funny Comments the first 15 posts on your Instagram ",
        "Tell the saddest story you know","Attempt to do a magic trick",
        "Poll dance for 1 minute with an imaginary pole",
        "Hold a funny face for the rest of the round","Lick the floor",
        "Calling the most recent dail and start knowing the nation anthem ",
        "Put a break up post on instagram and whatsapp" )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDareBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val action =supportActionBar
        action!!.title ="Dare"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        binding.chnDare.setOnClickListener {
            val random = Random()
            val dareChange= random.nextInt(dareList.count())
            binding.txtDare.text= dareList[dareChange]
        }

    }
}