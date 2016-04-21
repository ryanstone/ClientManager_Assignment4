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

public class ViewReceiptActivity extends AppCompatActivity implements DisplayUsernameFragment.OnFragmentInteractionListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_receipt);

        setTitle("View Receipt");

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

    public void EmailButton(View view) {
        // TODO: Implement email intent
        Toast.makeText(ViewReceiptActivity.this, R.string.session_purchased, Toast.LENGTH_LONG).show();
        Intent i = new Intent(ViewReceiptActivity.this, ViewSessionsActivity.class);
        startActivity(i);
    }

    public void PrintButton(View view) {
        // TODO: Implement print intent
        Toast.makeText(ViewReceiptActivity.this, R.string.session_purchased, Toast.LENGTH_LONG).show();
        Intent i = new Intent(ViewReceiptActivity.this, ViewSessionsActivity.class);
        startActivity(i);
    }
}
