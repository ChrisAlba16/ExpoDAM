package com.example.expo

import android.app.Activity;
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class HorizontalDivider  : Fragment()  {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        super.onCreate(savedInstanceState)
        val horizontalView: View  =  inflater.inflate(R.layout.fragment_horizontaldivider, container, false)
        return horizontalView
    }
}