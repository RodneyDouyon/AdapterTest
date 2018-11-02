package com.codepath.rodney.adaptertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Construct the data source
        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        //Create the adapter to convert the array to views
        UsersAdapter adapter = new UsersAdapter(this,arrayOfUsers);
        //Add Item to the adapter
        User newUser = new User("Rodney ", "Cayes");
        adapter.add(newUser);
        User newUser2 = new User("Catherine ","Camp-Perrin");
        adapter.add(newUser2);



        //Attach the adapter to the listview
        ListView listView = (ListView) findViewById(R.id.lvItems);
        listView.setAdapter(adapter);
    }
}
