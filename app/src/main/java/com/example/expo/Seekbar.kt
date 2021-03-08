package com.example.expo


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.Toast
import androidx.fragment.app.Fragment


class Seekbar  : Fragment()  {
    lateinit var simpleSeekBar: SeekBar
    lateinit var submitButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        super.onCreate(savedInstanceState)
        val seekView: View  =  inflater.inflate(R.layout.fragment_seekbar, container, false)
        simpleSeekBar = seekView.findViewById<SeekBar>(R.id.simpleSeekBar)
        simpleSeekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            var progressChangedValue = 0
            override fun onProgressChanged(
                seekBar: SeekBar,
                progress: Int,
                fromUser: Boolean
            ) {
                progressChangedValue = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // TODO Auto-generated method stub
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                Toast.makeText(
                    activity, "El avance del seekbar es: $progressChangedValue",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

        return seekView
    }
}