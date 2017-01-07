package com.example.piyush.contact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Main3Activity extends AppCompatActivity {

    public static EditText nam,ph;
    public static RadioButton rb;
    public static String name1,pho1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button submit=(Button) findViewById(R.id.sub);
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                nam=(EditText)findViewById(R.id.name);
                ph=(EditText)findViewById(R.id.pho);
                rb=(RadioButton)findViewById(R.id.male);
                name1=nam.getText().toString();
                pho1=ph.getText().toString();
                String [] web1=new String[MainActivity.web.length+1];
                String [] ph1=new String[MainActivity.web.length+1];
                Integer [] imageId1=new Integer[MainActivity.web.length+1];
                String [] gen1=new String[MainActivity.web.length+1];
                int j=0,count=0;
                for(int i=0;i<MainActivity.web.length;i++){
                    if(MainActivity.web[i].compareToIgnoreCase(name1)>0 && count!=1) {
                        web1[i] = name1;
                        ph1[i] = pho1;
                        if (rb.isChecked()){
                            imageId1[i] = R.drawable.male;
                            gen1[i]="Male";
                        }
                        else {
                            imageId1[i] = R.drawable.female;
                            gen1[i]="Female";
                        }
                        count=1;
                        j++;
                    }
                    web1[j]=MainActivity.web[i];
                    ph1[j]=MainActivity.ph[i];
                    imageId1[j]=MainActivity.imageId[i];
                    gen1[j]=MainActivity.gen[i];
                    j++;

                }
                if(count==0){
                    web1[j]=name1;
                    ph1[j]=pho1;
                    if(rb.isChecked()) {
                        imageId1[j] = R.drawable.male;
                        gen1[j]="Male";
                    }
                    else {
                        imageId1[j] = R.drawable.female;
                        gen1[j]="Female";
                    }
                    count=1;
                }
                MainActivity.web=web1;
                MainActivity.ph=ph1;
                MainActivity.imageId=imageId1;
                MainActivity.gen=gen1;
                Intent intent = new Intent(Main3Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
