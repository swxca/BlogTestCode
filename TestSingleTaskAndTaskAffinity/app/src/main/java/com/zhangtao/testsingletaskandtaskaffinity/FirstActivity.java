package com.zhangtao.testsingletaskandtaskaffinity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    public void startB(View view){
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
