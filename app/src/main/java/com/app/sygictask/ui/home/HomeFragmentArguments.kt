package com.app.sygictask.ui.home

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HomeFragmentArguments(
    val text: String,
    val url: String
) : Parcelable