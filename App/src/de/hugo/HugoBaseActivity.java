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
	
	protected boolean DEBUG_GENERAL = false;
	protected boolean DEBUG_LOGIN = true;

	// -------------------------------------------

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// DEBUG-Part
		this.checkGeneralDebug();
	}

	protected void checkGeneralDebug() {
		if (this.DEBUG_LOGIN == true) {
			this.DEBUG_GENERAL = true;
			return;
		}
	}
}
