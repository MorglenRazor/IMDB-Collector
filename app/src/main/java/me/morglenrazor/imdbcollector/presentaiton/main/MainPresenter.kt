package me.morglenrazor.imdbcollector.presentaiton.main

import me.morglenrazor.imdbcollector.presentaiton.base.BasePresenter
import moxy.MvpPresenter

class MainPresenter : MvpPresenter<MainView>() {
    //Method which run fragment on mainActivity
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.setRootScreen()
    }

}