package de.hugo.hugo_entdeckt;

import de.hugo.HugoBaseActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.content.Intent;

public class LaunchActivity extends HugoBaseActivity {
	private boolean mIsBackButtonPressed;
	private static final int SPLASH_DURATION = 3 * 1000; // seconds
	private Handler myhandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launch);
		Log.i(DEBUG_TAG, "Launching!");

		myhandler = new Handler();
		// run a thread to start the home screen
		myhandler.postDelayed(new Runnable() {
			@Override
			public void run() {
				finish();
				if (!mIsBackButtonPressed) {
					// start the home activity
					Intent intent = new Intent(LaunchActivity.this, LoginActivity.class);
					LaunchActivity.this.startActivity(intent);
				}
			}
		}, SPLASH_DURATION);
	}

}
