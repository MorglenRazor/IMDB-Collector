package me.morglenrazor.imdbcollector.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import me.morglenrazor.imdbcollector.R
import me.morglenrazor.imdbcollector.presentaiton.MainPresenter
import me.morglenrazor.imdbcollector.presentaiton.MainView
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainButtonShowTxt.setOnClickListener {
            presenter.onButtonClicked(mainEditText.text.toString())
        }

    }

    override fun setText(text: String){
        mainTextView.text = text
    }
}