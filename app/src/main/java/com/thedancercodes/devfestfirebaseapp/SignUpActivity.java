package com.thedancercodes.devfestfirebaseapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by @thedancercodes on 15/11/2017.
 */

public class SignUpActivity extends AppCompatActivity {

    // TODO: Declare variables


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // TODO: Get Firebase auth instance

        // Add the toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // TODO: Inflate View elements in the SignUpActivity


        // TODO: Password Reset OnClick Listener


        // TODO: Sign In OnClick Listener


        // TODO: Sign Up OnClick Listener


    }

    @Override
    protected void onResume() {
        super.onResume();
//        mProgressBar.setVisibility(View.GONE);
    }
}
