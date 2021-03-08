package com.example.expo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.fragment.app.Fragment

class Ratingbar  : Fragment()  {
    lateinit var simpleRatingBar: RatingBar
    lateinit var submitButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        super.onCreate(savedInstanceState)
        val ratingView: View  =  inflater.inflate(R.layout.fragment_ratingbar, container, false)
        simpleRatingBar = ratingView.findViewById<RatingBar>(R.id.simpleRatingBar)
        submitButton = ratingView.findViewById<Button>(R.id.submitButton);
        submitButton.setOnClickListener { // get values and then displayed in a toast
            val rating = "Rating: " + simpleRatingBar.rating
            Toast.makeText(
                activity,
                """
                    $rating
                    """.trimIndent(),
                Toast.LENGTH_LONG
            ).show()
        }
        return ratingView
    }
}