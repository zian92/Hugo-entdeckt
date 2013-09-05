package de.hugo.hugo_entdeckt;

import de.hugo.HugoBaseActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class HomeScreenActivity extends HugoBaseActivity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_homescreen);
		Log.i(this.DEBUG_TAG, "HomeScreen started");

		// schreiftart
		this.setTextViewFontHappyMonkey(R.id.infobox);

		// news etc
		this.changeInfoBoxText();

		// Gridview
		GridView gridview = (GridView) findViewById(R.id.gridview);
		gridview.setAdapter(new ImageAdapter(this));

		gridview.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
				Toast.makeText(HomeScreenActivity.this, "" + position, Toast.LENGTH_SHORT).show();

				Intent intent = null;
				switch (position) {
					case 0:
						intent = new Intent(HomeScreenActivity.this, LoginActivity.class);
						HomeScreenActivity.this.startActivity(intent);
						break;
					case 1:
						intent = new Intent(HomeScreenActivity.this, QuizActivity.class);
						HomeScreenActivity.this.startActivity(intent);
						break;
					default:
						// Toast.makeText(HomeScreenActivity.this, "Sorry, irgendetwas l‰uft hier falsch.", Toast.LENGTH_SHORT);
						break;
				}
			}
		});

	}

	private void changeInfoBoxText() {
		TextView InfoB = (TextView) findViewById(R.id.infobox);
		InfoB.setText("05.09.13: " + this.NEWLINE_TEXTVIEW + "Hier werden in Zukunft news erscheinen!" + this.NEWLINE_TEXTVIEW + this.NEWLINE_TEXTVIEW + "06.09.13: " + this.NEWLINE_TEXTVIEW + "Man weiﬂ nie, was noch kommen wird.");
	}
}
