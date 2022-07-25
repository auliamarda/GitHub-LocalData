package com.aulmrd.githubuser

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class People(
    val imageview: Int,
    val txtTitle: String,
    val txtSubTitle: String,
    val tvFollowers: String,
    val tvFollowing: String,
    val tvRepository: String,
    val tvLocation: String,
    val tvCompany: String

    ) : Parcelable