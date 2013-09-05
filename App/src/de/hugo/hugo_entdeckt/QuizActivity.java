package de.hugo.hugo_entdeckt;

import de.hugo.HugoBaseActivity;
import android.os.Bundle;
import android.util.Log;

public class QuizActivity extends HugoBaseActivity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_quiz);
		Log.i(this.DEBUG_TAG, "HomeScreen started");
	}
}
