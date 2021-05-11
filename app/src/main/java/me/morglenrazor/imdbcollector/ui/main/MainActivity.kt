package me.morglenrazor.imdbcollector.ui.main

import android.os.Bundle
import me.morglenrazor.imdbcollector.R
import me.morglenrazor.imdbcollector.presentaiton.main.MainPresenter
import me.morglenrazor.imdbcollector.presentaiton.main.MainView
import me.morglenrazor.imdbcollector.ui.base.BaseActivity
import moxy.presenter.InjectPresenter


class MainActivity : BaseActivity(), MainView {
    @InjectPresenter
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun setRootScreen() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.mainContainer, ShowFragment())
            .commit()
    }

}