package me.morglenrazor.imdbcollector.ui.main

import android.os.Bundle
import me.morglenrazor.imdbcollector.presentaiton.main.MainView
import me.morglenrazor.imdbcollector.ui.base.BaseActivity

class MainActivity : BaseActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun setText(text: String) {
        TODO("Not yet implemented")
    }
}