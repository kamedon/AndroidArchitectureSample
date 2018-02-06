package com.kamedon.androidarchitecturesample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kamedon.androidarchitecturesample.mvp.ui.form.MvpFormActivity
import com.kamedon.androidarchitecturesample.mvvm.MvvmFormActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btnMvp).setOnClickListener {
            val intent = Intent(this, MvpFormActivity::class.java)
            startActivity(intent)
        }
        findViewById<View>(R.id.btnMvvm).setOnClickListener {
            val intent = Intent(this, MvvmFormActivity::class.java)
            startActivity(intent)
        }
    }
}
