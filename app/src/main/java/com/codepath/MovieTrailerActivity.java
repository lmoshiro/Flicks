package com.codepath;

import android.os.Bundle;
import android.provider.MediaStore;

import com.google.android.youtube.player.YouTubeBaseActivity;

import org.parceler.Parcels;

public class MovieTrailerActivity extends YouTubeBaseActivity {

    MediaStore.Video video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_trailer);

        // temporary test video id -- TODO replace with movie trailer video id

        // unwrap the movie passed in via intent, using its simple name as a key
        video = (MediaStore.Video) Parcels.unwrap(getIntent().getParcelableExtra(MediaStore.Video.class.getSimpleName()));

        final String videoId = "tKodtNFpzBA";

        // resolve the player view from the layout
        //YouTubePlayerView playerView = (YouTubePlayerView) findViewById(R.id.player);

        // initialize with API key stored in secrets.xml
//        playerView.initialize(getString(R.string.youtube_api_key), new YouTubePlayer.OnInitializedListener() {
//            @Override
//            public void onInitializationSuccess(YouTubePlayer.Provider provider,
//                                                YouTubePlayer youTubePlayer, boolean b) {
//                 do any work here to cue video, play video, etc.
//                youTubePlayer.cueVideo(videoId);
//            }
//
//            @Override
//            public void onInitializationFailure(YouTubePlayer.Provider provider,
//                                                YouTubeInitializationResult youTubeInitializationResult) {
//                 log the error
//                Log.e("MovieTrailerActivity", "Error initializing YouTube player");
//            }
//        });
   }
}
