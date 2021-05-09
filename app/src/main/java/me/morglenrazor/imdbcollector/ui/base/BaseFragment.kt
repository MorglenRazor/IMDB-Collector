package me.morglenrazor.imdbcollector.ui.base

import android.widget.Toast
import me.morglenrazor.imdbcollector.presentaiton.base.BaseView
import moxy.MvpAppCompatFragment

abstract class BaseFragment : MvpAppCompatFragment(), BaseView{

    override fun showMessage(msg: String) {
        Toast.makeText(activity, msg, Toast.LENGTH_LONG).show()
    }

}