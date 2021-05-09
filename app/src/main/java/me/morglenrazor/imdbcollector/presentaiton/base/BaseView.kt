package me.morglenrazor.imdbcollector.presentaiton.base

import android.view.View
import moxy.MvpView
import moxy.viewstate.strategy.StateStrategyType
import moxy.viewstate.strategy.alias.AddToEndSingle
import java.lang.Error

interface BaseView : MvpView {
    @AddToEndSingle
    fun showMessage(msg: String)
}