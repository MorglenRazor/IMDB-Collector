package me.morglenrazor.imdbcollector.presentaiton.base

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle
import moxy.viewstate.strategy.alias.Skip

interface BaseView : MvpView {
    @Skip
    fun showMessage(msg: String)
}