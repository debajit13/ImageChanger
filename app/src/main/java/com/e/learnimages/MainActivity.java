package com.e.learnimages;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

   public void switchCat(View view){

       Log.i("Button", "clicked!");

       ImageView image = (ImageView) findViewById(R.id.catimageview);
       image.setImageResource(R.drawable.cattt);
       image.setImageResource(R.drawable.catu);
       image.setImageResource(R.drawable.catblack);
       image.setImageResource(R.drawable.cate);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
