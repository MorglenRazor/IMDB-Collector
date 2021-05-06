package me.morglenrazor.imdbcollector.presentaiton

import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    fun onButtonClicked(text: String){
        val newText = text + "World"
        viewState.setText(newText)
    }
}