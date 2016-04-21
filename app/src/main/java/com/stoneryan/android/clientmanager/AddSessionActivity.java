package com.stoneryan.android.clientmanager;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import layout.DisplayUsernameFragment;

public class AddSessionActivity extends AppCompatActivity implements DisplayUsernameFragment.OnFragmentInteractionListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_session);

        setTitle("Add Session");

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new DisplayUsernameFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void CancelButton(View view) {
        Intent i = new Intent(AddSessionActivity.this, ViewCustomerActivity.class);
        startActivity(i);
    }

    public void PurchaseButton(View view) {
        // TODO: Send data with intent
        Intent i = new Intent(AddSessionActivity.this, ViewReceiptActivity.class);
        startActivity(i);
    }
}