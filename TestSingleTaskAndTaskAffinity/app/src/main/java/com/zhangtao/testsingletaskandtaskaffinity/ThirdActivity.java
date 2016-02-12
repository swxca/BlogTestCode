package com.zhangtao.testsingletaskandtaskaffinity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by zhangtao on 16/2/12.
 */
public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }

    public void startA(View view){
        Intent intent=new Intent(this,FirstActivity.class);
        startActivity(intent);
    }
}
