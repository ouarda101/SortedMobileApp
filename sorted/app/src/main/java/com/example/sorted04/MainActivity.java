package com.example.sorted04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title ;
    Button button1;
    Animation layoutanimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //initialisation
        title =(TextView) findViewById(R.id.sorted);
        button1 =(Button) findViewById(R.id.start);

   // layout color animation
        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
        // layout  animation
              layoutanimation = AnimationUtils.loadAnimation(this,R.anim.fromtopbutton1);
              title.startAnimation(layoutanimation);
              button1.startAnimation(layoutanimation);
        //opening the new activity
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating an inctence of the class "intent"
                Intent i = new Intent(getApplicationContext(),com.example.sorted04.Dashboard.class);
                startActivity(i);

            }
        });
    }
}
