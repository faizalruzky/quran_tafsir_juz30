package com.faizalruzky.tafsir;

import com.faizalruzky.tafsir.R;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class About extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        showActionBar();
    }
           
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	mainMenu = menu;
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        menu.removeItem(R.id.action_about);
        return super.onCreateOptionsMenu(menu);
    }
    
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Take appropriate action for each action item click
		switch (item.getItemId()) {
		case R.id.action_help:
			showHelp();
			return true;
		case R.id.action_exit:
			exit();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
    
	@Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
    	if(event.getAction() == KeyEvent.ACTION_UP){
    	    switch(keyCode) {
    	    case KeyEvent.KEYCODE_MENU:
    	        mainMenu.performIdentifierAction(R.id.action_overflow, 0);
    	        return true;  
    	    }
    	}
    	return super.onKeyUp(keyCode, event);
    }
	
	/**
	 * Coding Here
	 */

	private Menu mainMenu;
	private void showActionBar(){
		android.app.ActionBar bar = getActionBar();
        bar.setTitle(R.string.action_about);
        bar.setDisplayHomeAsUpEnabled(true);
	}
	
	private void showHelp() {
		Intent i = new Intent(About.this, Help.class);
		startActivity(i);
	}
	
	private void exit(){
		 Intent startMain = new Intent(Intent.ACTION_MAIN); 
		 startMain.addCategory(Intent.CATEGORY_HOME); 
		 startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
		 startActivity(startMain); 
		 finish(); 
	}
    
}