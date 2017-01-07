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




    public static String[] web ={"Arya Stark","Barry Allen", "Caitlin Snow","Daenerys Targaryen","Felicity Smoak", "Harvey Specter", "Iris West","Jesse Pinkman","Light Yagami","Mike Ross" ,"Nick Fury","Rachel Green","Sherlock Holmes","Tyrion Lannister","Walter White"};
    public static String[] ph ={"1111111111", "2222222222", "333333333", "4444444444", "5555555555", "6666666666", "7777777777","8888888888","9999999999","9876542310","8765432109","7654321098","6543210987","5432109876","4321098765"};
    public static Integer[] imageId ={R.drawable.female,R.drawable.male,R.drawable.female,R.drawable.female,R.drawable.female,R.drawable.male,R.drawable.female,R.drawable.male,R.drawable.male,R.drawable.male,R.drawable.male,R.drawable.female,R.drawable.male,R.drawable.male,R.drawable.male};
    public static String[] gen ={"Female", "Male", "Female", "Female", "Female", "Male", "Female","Male","Male","Male","Male","Female","Male","Male","Male"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        CustomList adapter = new CustomList(MainActivity.this, web, imageId);
        ListView list = (ListView) findViewById(R.id.lv);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",web[position]);
                intent.putExtra("ph",ph[position]);
                intent.putExtra("pic",imageId[position]);
                intent.putExtra("gend",gen[position]);
                startActivity(intent);
                finish();
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
        CustomList adapter = new CustomList(MainActivity.this, web, imageId);
        ListView list = (ListView) findViewById(R.id.lv);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",web[position]);
                intent.putExtra("ph",ph[position]);
                intent.putExtra("pic",imageId[position]);
                intent.putExtra("gend",gen[position]);
                startActivity(intent);
                finish();
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
