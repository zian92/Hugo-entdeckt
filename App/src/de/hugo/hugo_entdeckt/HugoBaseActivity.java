package de.hugo.hugo_entdeckt;

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

	protected boolean GENERAL_DEBUG = false;
	protected boolean DEBUG_LOGIN = true;

	// -------------------------------------------
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// DEBUG-Part
		
	}
}
