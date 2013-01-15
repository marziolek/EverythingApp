package com.example.everything;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		final Button button1 = (Button) findViewById(R.id.button1);
	    button1.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click
	        	Intent intent = new Intent(MainActivity.this, PhotoActivity.class);
	            startActivity(intent);
	        }
	    });
	    
	    final Button button2 = (Button) findViewById(R.id.button2);
	    button2.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click
	        	//Intent intent = new Intent(MainActivity.this, FragmentsActivity.class);
	            //startActivity(intent);
	        }
	    });
	    
	    	    
	    final Button button4 = (Button) findViewById(R.id.button4);
	    button4.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click
	        	Intent intent = new Intent(MainActivity.this, FragmentsActivity.class);
	            startActivity(intent);
	        }
	    });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	        case R.id.info:
	            info();
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	public void info() {
		Context context = getApplicationContext();
		CharSequence text = "To jest aplikacja Marcina Zió³ek \u00A9 2012";
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
		
	}
	
	}


