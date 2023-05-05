package com.life.photo

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.life.photo.databinding.PhotoLayoutBinding
import com.life.photo.viewmodel.PhotoLayoutModel

class Photo : AppCompatActivity() {
    private lateinit var mBinding: PhotoLayoutBinding
    private lateinit var mModel: PhotoLayoutModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initLoad()
    }

    override fun onResume() {
        super.onResume()

        bindEvent()
    }

    private fun initLoad() {
        mBinding = PhotoLayoutBinding.inflate(layoutInflater)

        setContentView(mBinding.root)

        mModel = PhotoLayoutModel()
    }

    @SuppressLint("ResourceType")
    private fun bindEvent() {
        val container = mBinding.photoContainer
        container.photograph.setOnClickListener {
            Log.d("@@@","photograph")
        }
        container.gallery.setOnClickListener {
            Log.d("@@@","gallery")
        }
    }
}