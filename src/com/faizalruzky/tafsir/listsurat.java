package com.faizalruzky.tafsir;


import com.faizalruzky.tafsir.alfalaq;
import com.faizalruzky.tafsir.annas;
import com.faizalruzky.tafsir.listsurat;


import com.faizalruzky.tafsir.R;
import android.annotation.TargetApi;
import android.app.Activity;

import android.content.Intent;

import android.os.Build;
import android.os.Bundle;


import android.view.KeyEvent;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.widget.AdapterView.OnItemClickListener;


@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class listsurat  extends Activity{
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	mainMenu = menu;
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        showActionBar();
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
        bar.setTitle(R.string.app_name);
        bar.setDisplayHomeAsUpEnabled(true);
	}
	
	
	private void showAbout() {
		Intent i = new Intent(listsurat.this, About.class);
		startActivity(i);
	}
    
	private void showHelp() {
		Intent i = new Intent(listsurat.this, Help.class);
		startActivity(i);
	}
	private void exit(){
		 Intent startMain = new Intent(Intent.ACTION_MAIN); 
		 startMain.addCategory(Intent.CATEGORY_HOME); 
		 startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
		 startActivity(startMain); 
		 finish(); 
	}

	ListView list1;
	String[] menu = new String[] { "78. An-Naba' - 40 ayat ",
			"79.  An-Nazi'at - 46 ayat",
			"80.  'Abasa - 42 ayat",
			"81.  At-Takwir - 29 ayat",
			"82.  Al-Infitar - 19 ayat",
			"83.  Al-Mutaffifin - 36 ayat",
			"84.  Al-Insyiqaq - 25 ayat",
			"85.  Al-Buruj - 22 ayat",
			"86.  At-Tariq - 19 ayat",
			"87.  Al-A'la 19 ayat",
			"88.  Al-Gasyiyah - 26 ayat",
			"89.  Al-Fajr - 30 ayat",
			"90.  Al-Balad - 20 ayat",
			"91.  Asy-Syams - 15 ayat",
			"92.  Al-Lail - 21 ayat",
			"93.  Ad-Duha - 11 ayat",
			"94.  Asy-Syarh - 8 ayat",
			"95.  At-Tin - 8 ayat",
			"96.  Al-'Alaq - 19 ayat",
			"97.  Al-Qadr - 5 ayat",
			"98.  Al-Bayyinah - 8 ayat",
			"99.  Az-Zalzalah - 8 ayat",
			"100. Al-'Adiyat - 11 ayat",
			"101. Al-Qari'ah - 11 ayat",
			"102. At-Takasur - 8 ayat",
			"103. Al-'Asr - 3 ayat",
			"104. Al-Humazah - 9 ayat",
			"105. Al-Fil - 5 ayat",
			"106. Quraisy - 4 ayat",
			"107. Al-Ma'un - 7 ayat",
			"108. Al-Kautsar - 3 ayat",
			"109. Al-Kafirun - 6 ayat",
			"110. An-Nasr - 3 ayat",
			"111. Al-Lahab - 5 ayat",
			"112. Al-Ikhlas - 4 ayat",
			"113. Al-Falaq - 5 ayat",
			"114. An-Nas - 6 ayat"
			};
	// Create an ArrayAdapter, that will actually make the Strings above
	// appear in the ListView
	// Menset nilai array ke dalam list adapater sehingga data pada array
	// akan dimunculkan dalam list


	/**
	 * Called when the activity is first created. Method ini akan dipanggil pada
	 * saat aplikasi dijalankan
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listsurat);
        list1 = (ListView)findViewById(R.id.list);
        list1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu));
        list1.setOnItemClickListener(new OnItemClickListener(){
        	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3){
        		Intent i = null;
        		if (position == 0){
        			i = new Intent(listsurat.this, alfalaq.class);}
        		else if(position == 1){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 2){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 3){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 4){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 5){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 6){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 7){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 8){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 9){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 10){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 11){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 12){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 13){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 14){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 15){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 16){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 17){
        			i = new Intent(listsurat.this, annas.class);}
        		else if(position == 18){
        			i = new Intent(listsurat.this, alalaq.class);}
        		else if(position == 19){
        			i = new Intent(listsurat.this, alqadr.class);}
        		else if(position == 20){
        			i = new Intent(listsurat.this,albayyinah.class);}
        		else if(position == 21){
        			i = new Intent(listsurat.this, alzalzalah.class);}
        		else if(position == 22){
        			i = new Intent(listsurat.this, aladiyat.class);}
        		else if(position == 23){
        			i = new Intent(listsurat.this, alqariah.class);}
        		else if(position == 24){
        			i = new Intent(listsurat.this, attakatsur.class);}
        		else if(position == 25){
        			i = new Intent(listsurat.this, alashr.class);}
        		else if(position == 26){
        			i = new Intent(listsurat.this, alhumazah.class);}
        		else if(position == 27){
        			i = new Intent(listsurat.this, alfiil.class);}
        		else if(position == 28){
        			i = new Intent(listsurat.this, alquraisy.class);}
        		else if(position == 29){
        			i = new Intent(listsurat.this, almaun.class);}
        		else if(position == 30){
        			i = new Intent(listsurat.this, alkautsar.class);}
        		else if(position == 31){
        			i = new Intent(listsurat.this, alkafirun.class);}
        		else if(position == 32){
        			i = new Intent(listsurat.this, annasr.class);}
        		else if(position == 33){
        			i = new Intent(listsurat.this, allahab.class);}
        		else if(position == 34){
        			i = new Intent(listsurat.this, alikhlas.class);}
        		else if(position == 35){
        			i = new Intent(listsurat.this, alfalaq.class);}
        		else if(position == 36){
        			i = new Intent(listsurat.this, annas.class);}
        		
    			else{}
        	
        	startActivity(i);
        	}
        });}
	
	public void onBackPressed(){
		finish();
		System.exit(0);
		}
	
	
	}
	


