package de.hugo;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * 
 * @author Jonas Stadler
 * 
 */

public class HugoBaseActivity extends Activity {

	// -------------------------------------------
	// DEBUGEINSTELLUNGEN
	// -------------------------------------------

	protected String DEBUG_TAG = "HUGO";

	// protected boolean DEBUG_GENERAL = false;
	protected boolean DEBUG_LOGIN = true;
	protected boolean DEBUG_AUTOLOGIN = true;
	protected boolean DEBUG_VIDEO = true;

	// -------------------------------------------
	// EINSTELLUNGEN
	// -------------------------------------------

	protected static final int SPLASH_DURATION = 4 * 1000; // seconds

	// -------------------------------------------
	// Spacer & Variables
	// -------------------------------------------
	protected final String FILEPATH_HAPPYMONKEY = "fonts/HappyMonkey-Regular.ttf";
	protected final String NEWLINE_TEXTVIEW = "\n";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	/**
	 * Checkt ob ein debugwert true ist.
	 * 
	 * @return false, wenn kein debugwert true gesetzt ist.
	 */
	protected boolean checkGeneralDebug() {
		if (this.DEBUG_LOGIN) return true;
		if (this.DEBUG_VIDEO) return true;
		// falls kein wert true ist.
		return false;
	}

	/**
	 * Setzt die Schriftart des angegebenen Textfeldes zu <code>Happy Monkey</code>
	 * 
	 * @param androidID
	 *            R.android.<code>id</code> des elementes, welches die schreiftart bekommen soll.
	 */
	protected void setTextViewFontHappyMonkey(int androidID) {
		Typeface tf = Typeface.createFromAsset(getAssets(), this.FILEPATH_HAPPYMONKEY);
		TextView tv = (TextView) findViewById(androidID);
		tv.setTypeface(tf);
	}

	/**
	 * Setzt die Schriftart des angegebenen Buttons zu <code>Happy Monkey</code>
	 * 
	 * @param androidID
	 *            R.android.<code>id</code> des elementes, welches die schreiftart bekommen soll.
	 */
	protected void setButtonFontHappyMonkey(int androidID) {
		Typeface tf = Typeface.createFromAsset(getAssets(), this.FILEPATH_HAPPYMONKEY);
		Button button = (Button) findViewById(androidID);
		button.setTypeface(tf);
	}

	/**
	 * Setzt die Schriftart des angegebenen Editfeldes zu <code>Happy Monkey</code>
	 * 
	 * @param androidID
	 *            R.android.<code>id</code> des elementes, welches die schreiftart bekommen soll.
	 */
	protected void setEditTextFontHappyMonkey(int androidID) {
		Typeface tf = Typeface.createFromAsset(getAssets(), this.FILEPATH_HAPPYMONKEY);
		EditText et = (EditText) findViewById(androidID);
		et.setTypeface(tf);
	}
}
