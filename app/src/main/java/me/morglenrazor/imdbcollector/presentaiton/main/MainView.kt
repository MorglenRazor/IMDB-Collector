package me.morglenrazor.imdbcollector.presentaiton.main

import me.morglenrazor.imdbcollector.presentaiton.base.BaseView
import moxy.viewstate.strategy.alias.AddToEndSingle

interface MainView : BaseView {
    @AddToEndSingle
    fun setText(text: String)
}