package com.glantrox.dicoding_beginner_hamas.dataclass

import android.os.Parcel
import android.os.Parcelable


class RecipeModel(
    val title: String? = "",
    val description: String? = "",
    val imageLink: String? = "",
    val recipes: List<String>? = listOf(),
    val author: String? = ""
        ) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.createStringArrayList(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(description)
        parcel.writeString(imageLink)
        parcel.writeStringList(recipes)
        parcel.writeString(author)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RecipeModel> {
        override fun createFromParcel(parcel: Parcel): RecipeModel {
            return RecipeModel(parcel)
        }

        override fun newArray(size: Int): Array<RecipeModel?> {
            return arrayOfNulls(size)
        }
    }
}