package me.morglenrazor.imdbcollector.presentaiton.main

import me.morglenrazor.imdbcollector.presentaiton.base.BasePresenter

class MainPresenter : BasePresenter<MainView>() {

    fun onButtonClicked(text: String){
        if(text == ""){
            viewState.showMessage("Error: Please Enter your Word")
        }else{
            viewState.setText(text)
        }
    }

}