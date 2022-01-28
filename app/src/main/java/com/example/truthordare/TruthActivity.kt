package com.example.truthordare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.truthordare.databinding.ActivityDareBinding
import com.example.truthordare.databinding.ActivityTruthBinding
import java.util.*

class TruthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTruthBinding
    val truthList = arrayListOf("Who would you hate to see naked?",
        "How long have you gone without brushing your teeth?",
        "If your crush told you he liked your best friend, what would you do?",
        "What if your best friend told you that she liked your crush?",
        "Have you ever lied to your best friend?","What do you think about him now?",
        "Have you ever told a secret you were told to keep?","What’s a secret you kept from your parents?",
        "What’s the most embarrassing music you listen to?",
        "Who is your secret crush?","When was the last time you wet the bed?",
        "What’s your biggest regret?", "When was the last time you lied?",
        "What animal do you think you most look like?","How many selfies do you take a day?",
        "When was the last time you cried?", "What was your favorite childhood show?",
        "What's your biggest fear?","What's your favorite part of your body?",
        "What’s the last thing you Googled?",
        )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTruthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val action =supportActionBar
        action!!.title ="Truth"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.chnTruth.setOnClickListener {
            val random = Random()
            val truthChange= random.nextInt(truthList.count())
            binding.txtTruth.text= truthList[truthChange]
        }
    }
}