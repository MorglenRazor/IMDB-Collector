package me.morglenrazor.imdbcollector.ui.base

import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import me.morglenrazor.imdbcollector.presentaiton.base.BaseView
import moxy.MvpAppCompatFragment

abstract class BaseFragment : MvpAppCompatFragment(), BaseView{

    override fun showMessage(msg: String) {
            val toast = Toast.makeText(activity, msg, Toast.LENGTH_LONG)
            toast.show()
    }

}