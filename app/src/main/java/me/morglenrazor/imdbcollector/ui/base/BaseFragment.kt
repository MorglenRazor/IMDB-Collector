package me.morglenrazor.imdbcollector.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.morglenrazor.imdbcollector.R
import me.morglenrazor.imdbcollector.presentaiton.base.BaseView
import moxy.MvpAppCompatFragment

abstract class BaseFragment : MvpAppCompatFragment(), BaseView{
    //Variable to save ID layout
    abstract val layoutResId : Int

    //Common method for initializing fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutResId, container, false)
    }

    //Method to open new Fragment on mainActivity
    fun addFragment(fragment: Fragment){
        activity?.supportFragmentManager?.beginTransaction()
            ?.add(R.id.mainContainer, fragment)?.commit()
    }
}

