package com.kamedon.androidarchitecturesample.mvvm

import android.databinding.ObservableField
import android.view.View

/**
 * Created by kamei.hidetoshi on 2018/02/06.
 */
class FormViewModel {
    val editName: ObservableField<String> = ObservableField()
    val name: ObservableField<String> = ObservableField()

    fun submit(view: View) {
        name.set(editName.get() ?: "")
    }

}