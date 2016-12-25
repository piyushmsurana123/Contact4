package com.example.piyush.contact;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.*;


import static com.example.piyush.contact.R.layout.activity_main;


public class MainActivity extends AppCompatActivity {




    public static String[] web ={"Andrew", "Blenda", "Charlie", "Daniel", "Ekta", "Raju", "Zarine"};
    public static String[] ph ={"1111111111", "2222222222", "333333333", "4444444444", "5555555555", "6666666666", "7777777777"};
    public static Integer[] imageId ={R.drawable.male,R.drawable.female,R.drawable.male,R.drawable.male,R.drawable.female,R.drawable.male,R.drawable.female};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
       /* int count=1;
        for(int i=0;name[i]!="";i++)
        {
            count++;
        }
        String[] web=new String[count];
        String[] ph=new String[count];
        Integer[] imageId=new Integer[count];
        for(int i=0;i<count-1;i++)
        {
            web[i]=name[i];
            ph[i]=pho[i];
            imageId[i]=iId[i];
        }*/
        CustomList adapter = new CustomList(MainActivity.this, web, imageId);
        ListView list = (ListView) findViewById(R.id.lv);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                //The next three lines cause the app to crash
                //Main2Activity.name.setText(web[position]);
                //Main2Activity.ph.setText(ph[position]);
                //Main2Activity.pic.setImageResource(imageId[position]);
                startActivity(intent);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(myIntent);
            }
        });
    }
    public void onStart(){
        super.onStart();
       /* int count=1;
        for(int i=0;name[i]!="";i++)
        {
            count++;
        }
        String[] web=new String[count];
        String[] ph=new String[count];
        Integer[] imageId=new Integer[count];
        for(int i=0;i<count-1;i++)
        {
            web[i]=name[i];
            ph[i]=pho[i];
            imageId[i]=iId[i];
        }*/
        CustomList adapter = new CustomList(MainActivity.this, web, imageId);
        ListView list = (ListView) findViewById(R.id.lv);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                //The next three lines cause the app to crash
                //Main2Activity.name.setText(web[position]);
                //Main2Activity.ph.setText(ph[position]);
                //Main2Activity.pic.setImageResource(imageId[position]);
                startActivity(intent);
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
