package de.hugo;

import android.app.Activity;
import android.os.Bundle;

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
	protected boolean DEBUG_AUTOLOGIN = false;
	protected boolean DEBUG_VIDEO = true;

	// -------------------------------------------
	// EINSTELLUNGEN
	// -------------------------------------------

	protected static final int SPLASH_DURATION = 4 * 1000; // seconds

	// -------------------------------------------
	// Spacer & Variables
	// -------------------------------------------

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
}
