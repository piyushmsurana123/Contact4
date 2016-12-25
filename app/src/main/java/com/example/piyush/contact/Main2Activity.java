package com.example.piyush.contact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public static TextView name;
    public static TextView ph;
    public static ImageView pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = (TextView) findViewById(R.id.name1);
        ph = (TextView) findViewById(R.id.ph1);
        pic = (ImageView) findViewById(R.id.img1);
        Button but=(Button) findViewById(R.id.del);
        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String n=name.getText().toString();
                int pos;
                for(int i=0;i<MainActivity.web.length;i++){
                    if(MainActivity.web[i]=="Andrew"){
                        for (; i < MainActivity.web.length-1; ++i) {
                            MainActivity.web[i] = MainActivity.web[i + 1];
                            MainActivity.ph[i] = MainActivity.ph[i + 1];
                            MainActivity.imageId[i] = MainActivity.imageId[i + 1];
                        }
                        MainActivity.web[i] ="";
                        MainActivity.ph[i] = "";
                        MainActivity.imageId[i] = 0;
                        break;
                    }
                }
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);


                    }
        });
    }

    }


