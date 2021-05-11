package me.morglenrazor.imdbcollector.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_movie_list.*
import me.morglenrazor.imdbcollector.R
import me.morglenrazor.imdbcollector.ui.base.BaseFragment

class MovieListFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        movieListButtonShowTxt.setOnClickListener { openCurrentMovieScreen() }
    }

    fun openCurrentMovieScreen(){
        activity?.supportFragmentManager?.beginTransaction()
            ?.add(R.id.mainContainer, MovieListFragment())?.commit()
    }
}