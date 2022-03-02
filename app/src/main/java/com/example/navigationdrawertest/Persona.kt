package com.example.navigationdrawertest

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Persona(private val nombre: String?, private val apellidos: String?, private val edad: Int) : Parcelable {

    override fun toString() = "Se ha recibido la persona $nombre $apellidos, de $edad años"

}
