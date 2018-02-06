package com.kamedon.androidarchitecturesample.mvp.presenter

import com.kamedon.androidarchitecturesample.domain.User

/**
 * Created by kamei.hidetoshi on 2018/02/06.
 */
interface IFormView {
    fun showName(user: User)
}

class FormPresenter(val view: IFormView) {
    fun submit(user: User) {
        view.showName(user)
    }

}