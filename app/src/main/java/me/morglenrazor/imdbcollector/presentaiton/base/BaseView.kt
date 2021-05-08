package me.morglenrazor.imdbcollector.presentaiton.base

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle

interface BaseView : MvpView {

    @AddToEndSingle
    fun setText(text: String)
}