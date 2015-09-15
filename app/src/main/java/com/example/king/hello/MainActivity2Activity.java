package com.example.king.hello;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity2Activity extends ActionBarActivity {
    //第一次创建该activity时运行该方法
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main_activity2);
        //用编程式开发ui界面
        LinearLayout linearLayout = new LinearLayout(this);
        //设置该activity显示改布局（双方）
        super.setContentView(linearLayout);//super and this
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        //创建一个textview
        final TextView textView = new TextView(this);
        //创建一个button
        final Button bu = new Button(this);
        //bu.setText(R.id.King);//报错
        bu.setText(R.string.king);
        //Android.View.ViewGroup.LayoutParams.
        bu.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT
        ,ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(textView);
        linearLayout.addView(bu);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("time:"+new java.util.Date().toLocaleString());
                //从上到下
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
