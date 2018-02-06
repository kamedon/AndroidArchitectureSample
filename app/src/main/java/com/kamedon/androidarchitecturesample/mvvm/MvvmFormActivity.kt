package com.kamedon.androidarchitecturesample.mvvm

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kamedon.androidarchitecturesample.R
import com.kamedon.androidarchitecturesample.databinding.ActivityMvvmFormBinding

class MvvmFormActivity : AppCompatActivity() {

    val binding: ActivityMvvmFormBinding by lazy {
        DataBindingUtil.setContentView<ActivityMvvmFormBinding >(this, R.layout.activity_mvvm_form)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = FormViewModel()
        binding.viewmodel = viewModel
    }

}
