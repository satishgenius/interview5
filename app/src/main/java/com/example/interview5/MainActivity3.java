package com.example.interview5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText a;
    EditText b;
    Button but1;
    Button but;
    CheckBox check;
    MediaPlayer g;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
         a = findViewById(R.id.editTextTextPersonName);
         b = findViewById(R.id.editTextTextPersonName2);
         but = findViewById(R.id.button3);
           but1= findViewById(R.id.button4);
         check = findViewById(R.id.checkBox);
         g = MediaPlayer.create(MainActivity3.this,R.raw.abz);
         but .setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (check.isChecked()) {
                     AlertDialog.Builder n= new AlertDialog.Builder(MainActivity3.this);
                     n.setTitle("ready");
                     n.setNegativeButton("no",null);
                     n.setPositiveButton("yes", new DialogInterface.OnClickListener() {

                         @Override
                         public void onClick(DialogInterface dialog, int which) {
                             Intent y = new Intent(MainActivity3.this,MainActivity4.class);
                             startActivity(y);
                             g.start();
                         }
                     });
                     n.setNeutralButton("cancel",null);
                     n.show();
                 }else {
                     Toast.makeText(MainActivity3.this, "u r not eigiable", Toast.LENGTH_SHORT).show();
                 }
             }
         });

    }
}