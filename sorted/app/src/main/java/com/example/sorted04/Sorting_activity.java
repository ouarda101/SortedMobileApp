package com.example.sorted04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Arrays;

public class Sorting_activity extends AppCompatActivity  implements StepsFragment.OnFragmentInteractionListener,TriFragment.TriFragmentListner{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting_activity);

        TriFragment tri = new TriFragment();

        FragmentManager manager=getSupportFragmentManager();
         manager.beginTransaction()
                 .replace(R.id.triLayout,tri ,tri.getTag())
                  .commit();

        StepsFragment steps= new StepsFragment();
        manager.beginTransaction()
                .replace(R.id.stepsLayout,steps ,steps.getTag())
                .commit();

        CodeFragment code = new CodeFragment();

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.stepsLayout,
                    new StepsFragment()).commit();
        }
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_theory:
                            selectedFragment = new TheoryFragment();
                            break;
                        case R.id.nav_steps:
                            selectedFragment = new StepsFragment();
                            break;
                        case R.id.nav_code:
                            selectedFragment = new CodeFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.stepsLayout,
                            selectedFragment).commit();

                    return true;
                }
            };


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onInputsent(String input) {
        StepsFragment s =new StepsFragment();
        s.setTextView(input);
        closeKeyboard(); //  closing the keyboard when button sort pressed
    }

    // method for closing the keyboard
    private void closeKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }}


}