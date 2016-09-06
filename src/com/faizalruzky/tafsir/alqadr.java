package com.faizalruzky.tafsir;
import com.faizalruzky.tafsir.R;
import android.app.Activity;
import android.os.Bundle;


public class alqadr extends Activity {
	   /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alqadr);
        showActionBar();
    }
    private void showActionBar() {
		// TODO Auto-generated method stub
		android.app.ActionBar bar = getActionBar();
        bar.setTitle(R.string.surat_alqadr);
        bar.setDisplayHomeAsUpEnabled(true);
	}
}
