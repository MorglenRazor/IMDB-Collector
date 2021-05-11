package me.morglenrazor.imdbcollector.presentaiton.main

import me.morglenrazor.imdbcollector.presentaiton.base.BaseView
import moxy.viewstate.strategy.alias.AddToEndSingle
import moxy.viewstate.strategy.alias.Skip

interface MainView : BaseView {
    @Skip
    fun setRootScreen()
}