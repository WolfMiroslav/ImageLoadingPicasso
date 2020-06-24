package com.app.sygictask.ui.home

import androidx.lifecycle.ViewModel

class HomeViewModel(private val args : HomeFragmentArguments) : ViewModel() {

    var name: String = args.text
    var imageUrl: String = args.url

}