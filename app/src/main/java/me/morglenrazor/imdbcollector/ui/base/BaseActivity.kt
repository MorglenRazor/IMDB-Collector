package me.morglenrazor.imdbcollector.ui.base

import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import me.morglenrazor.imdbcollector.R
import me.morglenrazor.imdbcollector.presentaiton.base.BasePresenter
import me.morglenrazor.imdbcollector.presentaiton.base.BaseView
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

abstract class BaseActivity : MvpAppCompatActivity(), BaseView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun showMessage(msg: String) {
        val toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
        toast.show()
    }
}