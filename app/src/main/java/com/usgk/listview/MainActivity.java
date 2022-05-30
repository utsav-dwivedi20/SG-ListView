package com.usgk.listview;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        String[] names={"Saurabh Kumar","Gaurav Kumar","Android Development","Java","Kotlin","Html","Css","Python","C","C++","Flutter","MySql","C#","Linux","Php","Java Script","Node Js","BootStrap"};
        Integer[] images={R.drawable.saurabhistra,R.drawable.gauravinstra,R.drawable.android_icon,R.drawable.java_icon
        ,R.drawable.kotlin_icon,R.drawable.html_icon,R.drawable.css_icon,R.drawable.python_icon,R.drawable.c_icon,R.drawable.c_plus_plus_icon,R.drawable.flutter_icon,R.drawable.mysql_icon,R.drawable.csharp_iocn,R.drawable.linux_icon,R.drawable.php_icon,R.drawable.js_icon,R.drawable.node_js_icon,R.drawable.bootstrap_icon};
         


        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,names,images);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "You have click " +names[position], Toast.LENGTH_SHORT).show();


                if(position == 0){
                    Intent intent = new Intent(MainActivity.this,SaurabhActivity.class);
                    startActivity(intent);

                }
                else if (position == 1){
                    Intent intent = new Intent(MainActivity.this,GauravActivity.class);
                    startActivity(intent);
                }
                else if (position == 2){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                   intent.setData(Uri.parse("https://www.tutorialspoint.com/android/index.htm"));
                   startActivity(intent);
                }
                else if (position == 3){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.tutorialspoint.com/java/index.htm"));
                    startActivity(intent);
                }
                else if (position == 4){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.tutorialspoint.com/kotlin/index.htm"));
                    startActivity(intent);
                }
                else if (position == 5){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.tutorialspoint.com/html/index.htm"));
                    startActivity(intent);
                }
                else if (position == 6){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.tutorialspoint.com/css/index.htm"));
                    startActivity(intent);
                }
                else if (position == 7){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.tutorialspoint.com/python/index.htm"));
                    startActivity(intent);
                }
                else if (position == 8){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.tutorialspoint.com/cprogramming/index.htm"));
                    startActivity(intent);
                }
                else if (position == 9){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.tutorialspoint.com/cplusplus/index.htm"));
                    startActivity(intent);
                }
                else if (position == 10){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.tutorialspoint.com/flutter/index.htm"));
                    startActivity(intent);
                }
                else if (position == 11){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.tutorialspoint.com/mysql/index.htm"));
                    startActivity(intent);
                }
                else if (position == 12){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.tutorialspoint.com/csharp/index.htm"));
                    startActivity(intent);
                }
                else if (position == 13){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.javatpoint.com/linux-tutorial"));
                    startActivity(intent);
                }
                else if (position == 14){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.w3schools.com/php/"));
                    startActivity(intent);
                }
                else if (position == 15){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.tutorialspoint.com/javascript/index.htm"));
                    startActivity(intent);
                }
                else if (position == 16){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.tutorialspoint.com/nodejs/index.htm"));
                    startActivity(intent);
                }
                else if (position == 17){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.tutorialspoint.com/bootstrap/index.htm"));
                    startActivity(intent);
                }
            }
        });

    }
}