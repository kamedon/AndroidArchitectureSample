package com.kamedon.androidarchitecturesample.mvp.ui.form

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.kamedon.androidarchitecturesample.R
import com.kamedon.androidarchitecturesample.domain.User
import com.kamedon.androidarchitecturesample.mvp.presenter.FormPresenter
import com.kamedon.androidarchitecturesample.mvp.presenter.IFormView

class MvpFormActivity : AppCompatActivity(), IFormView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp_form)
        val presenter = FormPresenter(this)

        findViewById<View>(R.id.btnSubmit).setOnClickListener {
            val nameEdit = findViewById<EditText>(R.id.editName)
            val name = nameEdit.text.toString()
            presenter.submit(User(name))
        }

    }

    override fun showName(user: User) {
        val nameText = findViewById<TextView>(R.id.name)
        nameText.text = user.name
    }

}
