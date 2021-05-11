package me.morglenrazor.imdbcollector.presentaiton.main

import me.morglenrazor.imdbcollector.presentaiton.base.BasePresenter

class MainPresenter : BasePresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.setRootScreen()
    }

}