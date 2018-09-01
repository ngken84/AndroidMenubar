package com.example.ngken.menubarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuMain1:
                Toast.makeText(getApplicationContext(), "Option1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuMain2:
                Toast.makeText(getApplicationContext(), "Option2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuMain3:
                Toast.makeText(getApplicationContext(), "Option3", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
