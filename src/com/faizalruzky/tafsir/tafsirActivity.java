package com.faizalruzky.tafsir;

import com.faizalruzky.tafsir.tafsirActivity;
import com.faizalruzky.tafsir.About;
import com.faizalruzky.tafsir.Help;


import com.faizalruzky.tafsir.R;
import android.os.Build;
import android.os.Bundle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import android.widget.Button;



import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;


public class tafsirActivity extends Activity {
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	mainMenu = menu;
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
     
        return super.onCreateOptionsMenu(menu);
        
    }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_about:
			showAbout();
			return true;
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
        bar.setTitle(R.string.menu);
        bar.setDisplayHomeAsUpEnabled(true);
	}
	
	
	private void showAbout() {
		Intent i = new Intent(tafsirActivity.this, About.class);
		startActivity(i);
	}
    
	private void showHelp() {
		Intent i = new Intent(tafsirActivity.this, Help.class);
		startActivity(i);
	}
	private void exit(){
		 Intent startMain = new Intent(Intent.ACTION_MAIN); 
		 startMain.addCategory(Intent.CATEGORY_HOME); 
		 startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
		 startActivity(startMain); 
		 finish(); 
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		   showActionBar();
		 /**
         * Creating all buttons instances
         * */
        Button listsurat = (Button) findViewById(R.id.btnbacaayat);
        Button listtafsir = (Button) findViewById(R.id.btnbacatafsir);
     
        Button exit = (Button) findViewById(R.id.btnkeluar);
        
        
               
        /**
         * Handling all button click events
         * */
        
        // Listening to News Feed button click
            listsurat.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(),listsurat.class);
				startActivity(i);
	}
			
            });
            listtafsir.setOnClickListener(new View.OnClickListener() {
    			
    			public void onClick(View view) {
    				// Launching News Feed Screen
    				Intent i = new Intent(getApplicationContext(), pilihantafsir.class);
    				startActivity(i);
    	}
    			
                });
            
         
        
            exit.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
    				// Launching News Feed Screen
            		Intent exit = new Intent (Intent.ACTION_MAIN);
    				exit.addCategory(Intent.CATEGORY_HOME);
    				exit.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
    				startActivity(exit);
    				
            	}
            	});
           
        
            
	}
	

}