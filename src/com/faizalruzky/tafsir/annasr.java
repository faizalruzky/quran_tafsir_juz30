package com.faizalruzky.tafsir;
import com.faizalruzky.tafsir.R;
import android.app.Activity;
import android.os.Bundle;


public class annasr extends Activity {
	   /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.annasr);
        showActionBar();
    }
    private void showActionBar() {
		// TODO Auto-generated method stub
		android.app.ActionBar bar = getActionBar();
        bar.setTitle(R.string.surat_annasr);
        bar.setDisplayHomeAsUpEnabled(true);
	}
}
