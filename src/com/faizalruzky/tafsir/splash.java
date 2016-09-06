package com.faizalruzky.tafsir;

import com.faizalruzky.tafsir.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class splash extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		//this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		Thread timer = new Thread() {
			public void run() {
				try {
					//berapalama splashscreen akan ditampilkan dalam milisecond
					sleep(3000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				} finally {
					//activity yang akan dijalankan setelah splashscreen selesai
					Intent i = new Intent(splash.this,tafsirActivity.class);
					startActivity(i);
				    splash.this.finish();
				}
			}
		};
		timer.start();
	}
}
