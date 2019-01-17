package com.example.android.booklistingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the search button
        Button searchButton = (Button) findViewById(R.id.search_button);
        // Set a click listener on that View
        searchButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search button is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, ListActivity.class);
                TextView authorView = (TextView) findViewById(R.id.type_field_author);
                String text = authorView.getText().toString();
                searchIntent.putExtra("author", text);
                startActivity(searchIntent);
                TextView titleView = (TextView) findViewById(R.id.type_field_title);
                String titleText = titleView.getText().toString();
                searchIntent.putExtra("title", titleText);
                startActivity(searchIntent);

            }
        });

    }
}
