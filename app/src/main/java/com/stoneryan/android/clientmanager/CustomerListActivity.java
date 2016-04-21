package com.stoneryan.android.clientmanager;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import layout.DisplayUsernameFragment;

public class CustomerListActivity extends AppCompatActivity implements DisplayUsernameFragment.OnFragmentInteractionListener  {

    ArrayList<String> customerNameList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);

        setTitle("Customer List");

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new DisplayUsernameFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

        ListView CustomerList = (ListView)findViewById(R.id.listViewCustomers);

        customerNameList = new ArrayList<String>();
        customerNameList.add("Ryan");
        customerNameList.add("Joe");
        customerNameList.add("Adrian");
        customerNameList.add("Foo");
        customerNameList.add("Bar");
        customerNameList.add("Test");
        customerNameList.add("Ryan");
        customerNameList.add("Fun");
        customerNameList.add("Fun");
        customerNameList.add("Fun");
        customerNameList.add("Fun");
        customerNameList.add("Fun");
        customerNameList.add("Fun");
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, customerNameList);
        CustomerList.setAdapter(arrayAdapter);

        CustomerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(CustomerListActivity.this, ViewCustomerActivity.class);
                startActivity(i);
            }
        });
    }

    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }
}
