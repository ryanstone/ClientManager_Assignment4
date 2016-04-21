package com.stoneryan.android.clientmanager;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import layout.DisplayUsernameFragment;

public class SignActivity extends AppCompatActivity implements DisplayUsernameFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        setTitle("Sign when session complete");

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new DisplayUsernameFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

    }

    public void onFragmentInteraction(Uri uri) {
        //you can leave it empty
    }

    public void BackButton(View view) {
        Intent i = new Intent(SignActivity.this, ViewSessionsActivity.class);
        startActivity(i);
    }

    public void SaveButton(View view) {
        // TODO: Save completed session to database
        Toast.makeText(SignActivity.this, R.string.session_completed, Toast.LENGTH_LONG).show();
        Intent i = new Intent(SignActivity.this, ViewSessionsActivity.class);
        startActivity(i);
    }
}