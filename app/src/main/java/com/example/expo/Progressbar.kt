package com.example.expo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import androidx.fragment.app.Fragment


class Progressbar  : Fragment()  {
    lateinit var simpleProgressBar: ProgressBar
    lateinit var startButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        super.onCreate(savedInstanceState)
        val progressBar: View  =  inflater.inflate(R.layout.fragment_progressbar, container, false)

        simpleProgressBar = progressBar.findViewById<ProgressBar>(R.id.simpleProgressBar)
        startButton = progressBar.findViewById<Button>(R.id.startButton) as Button

        startButton.setOnClickListener {
            simpleProgressBar.visibility = View.VISIBLE
        }
        return progressBar
    }
}