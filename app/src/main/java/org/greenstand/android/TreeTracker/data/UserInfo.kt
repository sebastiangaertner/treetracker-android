package org.greenstand.android.TreeTracker.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserInfo(val identification: String,
                    val firstName: String,
                    val lastName: String,
                    val organization: String?) : Parcelable