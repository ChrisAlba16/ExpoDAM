package com.example.expo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment

class PaginaInicio  : Fragment()  {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        super.onCreate(savedInstanceState)
        val inicioView: View  =  inflater.inflate(R.layout.fragment_paginainicio, container, false)
        return inicioView
    }
}