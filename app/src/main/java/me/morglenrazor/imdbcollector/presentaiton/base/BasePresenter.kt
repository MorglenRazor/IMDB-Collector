package me.morglenrazor.imdbcollector.presentaiton.base

import moxy.MvpPresenter

class BasePresenter : MvpPresenter<BaseView>() {

    fun onButtonClicked(text: String){
        val newText = text + "World"
        viewState.setText(newText)
    }
}