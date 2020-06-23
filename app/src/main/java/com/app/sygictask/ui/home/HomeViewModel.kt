package com.app.sygictask.ui.home

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.ViewModel
import com.squareup.picasso.Picasso

class HomeViewModel : ViewModel() {

    var name: String = ""
    var imageUrl: String = ""

    @BindingAdapter("imageUrl")
    fun loadImage(view: ImageView, url: String) {
        Picasso.get()
            .load(url)
            .into(view)
    }

}