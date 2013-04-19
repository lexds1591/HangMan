package com.example.hangman;




import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
    	setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    	// delete bar title
    	requestWindowFeature(Window.FEATURE_NO_TITLE);
    	         
    	 //delete bar task
    	 getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);       

        new Handler().postDelayed(new Runnable(){
            public void run() {
            	Intent intent = new Intent(MainActivity.this, MainOptions.class);
            	startActivity(intent);
            	MainActivity.this.finish();
            }
        }, 3000);
    }
	 public boolean onKeyDown(int keyCode, KeyEvent event) {
	    	
	      if (keyCode == KeyEvent.KEYCODE_BACK) {
	    	  System.exit(0);
	      }
	      return super.onKeyDown(keyCode, event);
	 }
    
}
