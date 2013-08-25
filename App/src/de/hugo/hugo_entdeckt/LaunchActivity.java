package de.hugo.hugo_entdeckt;

import de.hugo.HugoBaseActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class LaunchActivity extends HugoBaseActivity {
	private CharSequence text = "Hello toast!";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launch);

		final Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Context context = getApplicationContext();
				int duration = Toast.LENGTH_LONG;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
			}
		});

		final CheckBox cb = (CheckBox) findViewById(R.id.checkBox1);
		cb.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (cb.isChecked())
					text = " hi du ei";
				else text = "wrwerwer";
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.launch, menu);
		return true;
	}

}
