package com.example.sorted04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


    Button selectionS = findViewById(R.id.selection);
      selectionS.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //creating an inctence of the class "intent"
            Intent i1 = new Intent(Dashboard.this, Sorting_activity.class);
            i1.putExtra("sort","selection");
            startActivity(i1);
        }
    });

        Button insertionS = findViewById(R.id.insertion);
        insertionS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating an inctence of the class "intent"
                Intent i1 = new Intent(Dashboard.this, Sorting_activity.class);
                i1.putExtra("sort","insertion");
                startActivity(i1);
            }
        });

        Button mergeS = findViewById(R.id.merge);
        mergeS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating an inctence of the class "intent"
                Intent i1 = new Intent(Dashboard.this, Sorting_activity.class);
                i1.putExtra("sort","merge");
                startActivity(i1);
            }
        });

        Button quickS = findViewById(R.id.quick);
        quickS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating an inctence of the class "intent"
                Intent i1 = new Intent(Dashboard.this, Sorting_activity.class);
                i1.putExtra("sort","quick");
                startActivity(i1);
            }
        });

        Button bubbleS = findViewById(R.id.bubble);
        bubbleS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating an inctence of the class "intent"
                Intent i1 = new Intent(Dashboard.this, Sorting_activity.class);
                i1.putExtra("sort","bubble");
                startActivity(i1);
            }
        });













    }

}