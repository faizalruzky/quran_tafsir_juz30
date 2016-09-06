package com.faizalruzky.tafsir;

import com.faizalruzky.tafsir.pilihantafsir;
import com.faizalruzky.tafsir.R;
import com.faizalruzky.tafsir.list_tafsir_ibnkathir;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class pilihantafsir extends Activity {
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
        bar.setTitle(R.string.action_pilihan_tafsir);
        bar.setDisplayHomeAsUpEnabled(true);
	}
	
	
	private void showAbout() {
		Intent i = new Intent(pilihantafsir.this, About.class);
		startActivity(i);
	}
    
	private void showHelp() {
		Intent i = new Intent(pilihantafsir.this, Help.class);
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
	        setContentView(R.layout.pilihantafsir);
	        showActionBar();
	        showTafsirIbnKathir(); 
	        showTafsirIbnAbbas();
	        showTafsirJalalyn();
	    }
	  private void showTafsirJalalyn() {
		// TODO Auto-generated method stub
		  LinearLayout nextScreen = (LinearLayout )findViewById(R.id.Linear_MenuTafsirJalalyn);
			nextScreen.setOnClickListener(new View.OnClickListener() { 
	            public void onClick(View arg0) {
	            	Intent next = new Intent(pilihantafsir.this, list_tafsir_ibnkathir.class); 
	                startActivity(next);
	            }
	        });	
	}
	private void showTafsirIbnAbbas() {
		// TODO Auto-generated method stub
			LinearLayout nextScreen = (LinearLayout )findViewById(R.id.Linear_MenuTafsirIbnAbbas);
			nextScreen.setOnClickListener(new View.OnClickListener() { 
	            public void onClick(View arg0) {
	            	Intent next = new Intent(pilihantafsir.this, list_tafsir_ibnkathir.class); 
	                startActivity(next);
	            }
	        });
		
	}
	private void showTafsirIbnKathir(){
			LinearLayout nextScreen = (LinearLayout )findViewById(R.id.Linear_MenuTafsirIbnKathir);
			nextScreen.setOnClickListener(new View.OnClickListener() { 
	            public void onClick(View arg0) {
	            	Intent next = new Intent(pilihantafsir.this, list_tafsir_ibnkathir.class); 
	                startActivity(next);
	            }
	        });
			
		}
}
