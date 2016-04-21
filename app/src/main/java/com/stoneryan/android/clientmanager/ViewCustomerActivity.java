package com.stoneryan.android.clientmanager;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import layout.DisplayUsernameFragment;

public class ViewCustomerActivity extends AppCompatActivity implements DisplayUsernameFragment.OnFragmentInteractionListener   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_customer);

        setTitle("View Customer");

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new DisplayUsernameFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }

    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }

    public void ViewSessionsButton(View view) {
        Intent i = new Intent(ViewCustomerActivity.this, ViewSessionsActivity.class);
        startActivity(i);
    }

    public void AddSessionButton(View view) {
        Intent i = new Intent(ViewCustomerActivity.this, AddSessionActivity.class);
        startActivity(i);
    }

    public void EnterBillingInfoButton(View view) {
        Intent i = new Intent(ViewCustomerActivity.this, BillingInfoActivity.class);
        startActivity(i);
    }
}
