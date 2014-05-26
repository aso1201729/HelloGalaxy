package com.example.hellogalaxy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener{

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
	switch(v.getId()){ //どのボタンが押されたか判定
		case R.id.btnOK:
			EditText etv = (EditText)findViewById(R.id.edtFirst);
			String inputMsg = etv.getText().toString();
			EditText etv2 = (EditText)findViewById(R.id.edtFamily);
			String inputMsg2 = etv2.getText().toString();

			TextView tv = (TextView)findViewById(R.id.txvMsg);
			tv.setText( "あなたでしたか、" + inputMsg + " " + inputMsg2 + "さん。");
			Intent intent = new Intent(MainActivity.this, MsgActivity.class);
			startActivity(intent);}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn1 = (Button)findViewById(R.id.btnOK);
		btn1.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
