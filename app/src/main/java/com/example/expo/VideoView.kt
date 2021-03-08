package com.example.expo

import android.media.MediaPlayer
import android.media.MediaPlayer.OnCompletionListener
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;


class VideoView  : Fragment()  {
    lateinit var simpleVideoView: VideoView
    lateinit var mediaControls: MediaController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        super.onCreate(savedInstanceState)
        val videoView: View  =  inflater.inflate(R.layout.fragment_videoview, container, false)
        simpleVideoView = videoView.findViewById<VideoView>(R.id.simpleVideoView)
        mediaControls = MediaController(activity)
        mediaControls.setAnchorView(this.simpleVideoView)
        simpleVideoView.setMediaController(mediaControls)
        simpleVideoView.setVideoURI(Uri.parse("android.resource://" + requireContext().getPackageName() + "/" + R.raw.video))
        return videoView
    }
}