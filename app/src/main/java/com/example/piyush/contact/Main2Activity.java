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
    public static TextView ph,gender;
    public static ImageView pic;
    public static String n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle ex=getIntent().getExtras();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = (TextView) findViewById(R.id.name1);
        ph = (TextView) findViewById(R.id.ph1);
        pic = (ImageView) findViewById(R.id.img1);
        gender=(TextView)findViewById(R.id.ge1);
        name.setText("Name : "+ex.getString("name"));
        ph.setText("Phone : "+ex.getString("ph"));
        gender.setText("Gender : "+ex.getString("gend"));
        pic.setImageResource(ex.getInt("name"));
        n=ex.getString("name");
        Button but=(Button) findViewById(R.id.del);
        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String [] web1=new String[MainActivity.web.length-1];
                String [] ph1=new String[MainActivity.web.length-1];
                String [] gen1=new String[MainActivity.web.length-1];
                Integer [] imageId1=new Integer[MainActivity.web.length-1];
                int j=0;
                for(int i=0;i<MainActivity.web.length;i++){
                    if(!(MainActivity.web[i].equals(n))){
                        web1[j]=MainActivity.web[i];
                        ph1[j]=MainActivity.ph[i];
                        imageId1[j]=MainActivity.imageId[i];
                        gen1[j]=MainActivity.gen[i];
                        j++;
                    }
                }
                MainActivity.web=web1;
                MainActivity.ph=ph1;
                MainActivity.imageId=imageId1;
                MainActivity.gen=gen1;
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                finish();



            }
        });
    }

}


