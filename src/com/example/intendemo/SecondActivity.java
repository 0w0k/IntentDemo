package com.example.intendemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.second);
		super.onCreate(savedInstanceState);
		tv = (TextView) findViewById(R.id.textView1);
		String st = (String) getIntent().getExtras().get("STR");
		tv.setText(st);
	}


}
