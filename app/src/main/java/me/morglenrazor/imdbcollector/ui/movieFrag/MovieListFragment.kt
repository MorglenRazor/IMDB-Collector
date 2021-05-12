package me.morglenrazor.imdbcollector.ui.movieFrag

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_movie_list.*
import me.morglenrazor.imdbcollector.R
import me.morglenrazor.imdbcollector.ui.base.BaseFragment
import me.morglenrazor.imdbcollector.ui.movieFrag.CurrentMovieFragment

class MovieListFragment : BaseFragment() {

    override val layoutResId = R.layout.fragment_movie_list

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        movieListButtonShowTxt.setOnClickListener {
            addFragment(CurrentMovieFragment())
        }
    }
}