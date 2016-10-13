package com.chetang.youtubedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    YouTubePlayerView playerView;
    String VideoUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*AIzaSyBCV67wH_f2QOCS0OLiAQOf_1lni-kT8wI*/

        playerView = (YouTubePlayerView) findViewById(R.id.youtubeplayer);
        playerView.initialize("AIzaSyBCV67wH_f2QOCS0OLiAQOf_1lni-kT8wI", this);

        Intent intent = getIntent();
        Bundle bnd = intent.getExtras();
        VideoUrl = bnd.getString("VIDEOURL");

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        youTubePlayer.loadVideo(VideoUrl);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(MainActivity.this, "No video Available", Toast.LENGTH_SHORT).show();
    }
}
