package me.morglenrazor.imdbcollector.presentaiton.base

import android.view.View
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import moxy.InjectViewState
import moxy.MvpPresenter
import java.lang.Error

@InjectViewState
open class BasePresenter<V : BaseView> : MvpPresenter<V>(),
    CoroutineScope by CoroutineScope(Dispatchers.Main) {
}