package de.hugo.hugo_entdeckt;

import de.hugo.HugoBaseActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.content.Intent;

public class SplashScreenActivity extends HugoBaseActivity {
	private boolean mIsBackButtonPressed;
	private Handler myhandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_splash);
		Log.i(DEBUG_TAG, "Splash! \nLaunching!");

		myhandler = new Handler();
		// run a thread to start the home screen
		myhandler.postDelayed(new Runnable() {
			@Override
			public void run() {
				finish();
				if (!mIsBackButtonPressed) {
					// start the home activity
					Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
					SplashScreenActivity.this.startActivity(intent);
				}
			}
		}, (this.checkGeneralDebug()) ? 500 : SPLASH_DURATION);
	}

}
