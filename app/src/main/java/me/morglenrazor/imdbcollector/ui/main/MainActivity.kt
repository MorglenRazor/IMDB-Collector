package me.morglenrazor.imdbcollector.ui.main

import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
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

        mainButtonShowTxt.setOnClickListener {
            val txt = mainEditText.text.toString()
            presenter.onButtonClicked(txt)
        }

    }


    override fun setText(text: String) {
        mainTextView.text = text
    }

    override fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

}