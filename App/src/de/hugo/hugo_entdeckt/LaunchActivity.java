package de.hugo.hugo_entdeckt;

import de.hugo.HugoBaseActivity;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class LaunchActivity extends HugoBaseActivity {
	private boolean mIsBackButtonPressed;
	private static final int SPLASH_DURATION = 3 * 1000; // seconds
	private Handler myhandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launch);

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
