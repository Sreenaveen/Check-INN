package com.example.inn_check;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity2 extends Activity {

	ImageView s;
	Button bs;
	
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		s=(ImageView) findViewById(R.id.imageView1);
		bs=(Button) findViewById(R.id.p1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity2, menu);
		return true;
	}
	public void change(View v)
	{
		s.setImageResource(R.drawable.kk);
	}

}
