package me.morglenrazor.imdbcollector.presentaiton

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle

interface MainView : MvpView{
    @AddToEndSingle
    fun setText(text: String)
}