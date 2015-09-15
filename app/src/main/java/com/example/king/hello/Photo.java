package com.example.king.hello;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class Photo extends ActionBarActivity {
    //定义一个访问图片的数组
    int[] images = new int[]{
            R.drawable.che,
            R.drawable.dao,
            R.drawable.nv
    };
    int currentImg = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        //获取布局容器
        LinearLayout layout = (LinearLayout)findViewById(R.id.root);
        //创建ImageView组件
        final ImageView image = new ImageView(this);
        //添加ImageView
        layout.addView(image);
        //初始化显示第一张图片
        image.setImageResource(images[0]);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentImg<3){
                    image.setImageResource(images[++currentImg]);

                    return;
                }
                currentImg=0;
                image.setImageResource(images[currentImg]);
                //抛出异常会用前面的
                //图片的特殊
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_photo, menu);
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
