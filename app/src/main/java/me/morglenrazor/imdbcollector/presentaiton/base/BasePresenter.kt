package me.morglenrazor.imdbcollector.presentaiton.base

import moxy.MvpPresenter

open class BasePresenter<V: BaseView> : MvpPresenter<V>() {
}