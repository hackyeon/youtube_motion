package com.example.newbottom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ViewConfiguration
import androidx.cardview.widget.CardView
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newbottom.databinding.ActivityMainBinding
import com.example.newbottom.databinding.ActivityNewBinding
import com.example.newbottom.databinding.DefaultLaoutBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_new)



//        findViewById<RecyclerView>(R.id.recyclerview_front).apply {
//            adapter = MainAdapter()
//            isNestedScrollingEnabled = false
//            layoutManager = LinearLayoutManager(this@MainActivity)
//        }


        bindUi()
    }

    private fun bindUi() {
        binding.rvMain.adapter = MainAdapter()
        binding.rvMain.layoutManager = LinearLayoutManager(this)
//
//        binding.motionLayout.setDebugMode(MotionLayout.DEBUG_SHOW_PATH)

        binding.btnDown.setOnClickListener {
            binding.motionLayout.transitionToStart()
        }

//        binding.clAudio.setOnClickListener {
//            if(binding.motionLayout.currentState != binding.motionLayout.startState) return@setOnClickListener
//            binding.motionLayout.transitionToEnd()
//        }
        binding.cardImage.setOnClickListener{
            binding.motionLayout.transitionToEnd()
        }
        binding.clMiniPlayer.setOnClickListener {
            binding.motionLayout.transitionToEnd()
        }

        binding.btnMiniList.setOnClickListener {
            Log.d("aabb", "btnMiniList")
        }
        binding.btnMiniPlay.setOnClickListener {
            Log.d("aabb", "btnMiniPlay")
        }


    }




}