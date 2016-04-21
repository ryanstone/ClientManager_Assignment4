package com.stoneryan.android.clientmanager;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import layout.DisplayUsernameFragment;

public class ViewSessionsActivity extends AppCompatActivity implements DisplayUsernameFragment.OnFragmentInteractionListener {

    ArrayList<String> SessionViewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_sessions);

        setTitle("View Sessions");

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new DisplayUsernameFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

        ListView SessionList = (ListView) findViewById(R.id.listViewSessions);

        SessionViewList = new ArrayList<String>();
        SessionViewList.add("01/23/2016");
        SessionViewList.add("01/24/2016");
        SessionViewList.add("01/25/2016");
        SessionViewList.add("01/26/2016");
        SessionViewList.add("01/27/2016");
        SessionViewList.add("01/28/2016");
        SessionViewList.add("01/29/2016");
        SessionViewList.add("01/30/2016");
        SessionViewList.add("01/31/2016");
        SessionViewList.add("02/01/2016");
        SessionViewList.add("02/02/2016");
        SessionViewList.add("02/03/2016");
        SessionViewList.add("02/04/2016");
        SessionViewList.add("02/05/2016");
        SessionViewList.add("02/06/2016");
        SessionViewList.add("02/07/2016");
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, SessionViewList);
        SessionList.setAdapter(arrayAdapter);

        SessionList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ViewSessionsActivity.this, SignActivity.class);
                startActivity(i);
            }
        });

    }

    public void onFragmentInteraction(Uri uri) {
        //you can leave it empty
    }

    public void BackButton(View view) {
        Intent i = new Intent(ViewSessionsActivity.this, ViewCustomerActivity.class);
        startActivity(i);
    }
}