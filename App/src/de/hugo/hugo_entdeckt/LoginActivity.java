package de.hugo.hugo_entdeckt;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import de.hugo.HugoBaseActivity;

public class LoginActivity extends HugoBaseActivity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		Log.i(this.DEBUG_TAG, "LoginActivity started");

		// Loginbutton
		final Button LoginButton = (Button) findViewById(R.id.LoginButton);
		LoginButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (login()) {
					Toast t = Toast.makeText(getApplicationContext(), "LOGIN!", Toast.LENGTH_LONG);
					t.show();
					Log.i(DEBUG_TAG, "Login successfull");
					Intent intent = new Intent(LoginActivity.this, HomeScreenActivity.class);
					LoginActivity.this.startActivity(intent);
				} else {
					Toast t = Toast.makeText(getApplicationContext(), "NO LOGIN!", Toast.LENGTH_LONG);
					t.show();
					Log.i(DEBUG_TAG, "Login NOT successfull");
				}
			}
		});

		// Cancel button
		final Button CancelButton = (Button) findViewById(R.id.LoginCancel);
		CancelButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// leere felder
				TextView tv = (TextView) findViewById(R.id.TextPassword);
				tv.setText("");
				tv = (TextView) findViewById(R.id.TextUsername);
				tv.setText("");

				Toast t = Toast.makeText(getApplicationContext(), "Login abgebrochen", Toast.LENGTH_LONG);
				t.show();
				Log.i(DEBUG_TAG, "Textfelder clean");
			}
		});
	}

	private boolean login() {
		if (this.checkGeneralDebug()) return true;

		return false;
	}
}
