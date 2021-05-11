package me.morglenrazor.imdbcollector.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import me.morglenrazor.imdbcollector.R
import me.morglenrazor.imdbcollector.presentaiton.base.BaseView
import me.morglenrazor.imdbcollector.ui.CurrentMovieFragment
import moxy.MvpAppCompatFragment

abstract class BaseFragment : MvpAppCompatFragment(), BaseView{

    abstract val layoutResId : Int

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutResId, container, false)
    }

    fun openNextFragment(fragment: Fragment){
        activity?.supportFragmentManager?.beginTransaction()
            ?.add(R.id.mainContainer, fragment)?.commit()
    }
}

