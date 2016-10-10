package com.example.rizwansyed.stk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
       public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId())
        {
            case R.id.menu_about:
                Toast.makeText(this, "You Clicked About", 3000).show();
                return true;
            case R.id.menu_help:
                Toast.makeText(this, "You Clicked Help", 3000).show();
                return true;
            case R.id.menu_new:
                Toast.makeText(this, "You Clicked New", 3000).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}