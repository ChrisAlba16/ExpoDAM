package com.example.expo

import android.app.Activity;
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import android.widget.CalendarView;

class CalendarView  : Fragment()  {
    lateinit var simpleCalendarView: CalendarView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        super.onCreate(savedInstanceState)
        val calendarView: View  =  inflater.inflate(R.layout.fragment_calendarview, container, false)
        // Find your VideoView in your video_main.xml layout
        // Find your VideoView in your video_main.xml layout
        simpleCalendarView = calendarView.findViewById<CalendarView>(R.id.simpleCalendarView)

        return calendarView
    }
}