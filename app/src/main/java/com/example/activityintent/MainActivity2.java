package com.example.activityintent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity2 {
    public static final String EXTRA_REPLY = "com.example.activityintent.extra.reply";
    EditText mReply;
    TextView tv;


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Intent intent = getIntent();
//        String msg = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//        tv = findViewById(R.id.txtMsg);
//        tv.setText(msg);
//        mReply = findViewById(R.id.etSecond);
//    }
//
//    private void setContentView(int activity_main) {
//    }
//
//    public void returnReply(View view) {
//        Intent replyIntent = new Intent();
//        replyIntent.putExtra(EXTRA_REPLY, mReply.getText().toString());
//        setResult(RESULT_OK, replyIntent);
//        finish();
    }

