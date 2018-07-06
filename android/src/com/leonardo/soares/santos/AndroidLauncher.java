package com.leonardo.soares.santos;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {

	MediaPlayer mediaPlayer;
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new Flappy(), config);


	}
    @Override
    protected void onStart() {
        super.onStart();
        mediaPlayer = new MediaPlayer();
//
       mediaPlayer = MediaPlayer.create(this,R.raw.p);
       mediaPlayer.start();


    }
    @Override
    protected void onPause() {
        super.onPause();
     mediaPlayer.stop();
    }
}
