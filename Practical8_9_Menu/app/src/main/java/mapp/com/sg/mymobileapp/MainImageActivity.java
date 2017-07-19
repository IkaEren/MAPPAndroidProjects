package mapp.com.sg.mymobileapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainImageActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_image);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.about:
                // Do Something
                Toast.makeText(getApplicationContext(),"About...",
                        Toast.LENGTH_SHORT).show();

                // Add the following code
                AlertDialog alertDialog = new AlertDialog.Builder(MainImageActivity.this).create();
                alertDialog.setTitle("About");
                alertDialog.setMessage("My Personal Photo Album.");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
                // End of adding code

                return true;


            case R.id.help:
                // Do Something
                Toast.makeText(getApplicationContext(),"Help...",
                        Toast.LENGTH_SHORT).show();

                return true;
            case R.id.chkupd:
                // Do Something
                Toast.makeText(getApplicationContext(),"Check for Update...",
                        Toast.LENGTH_SHORT).show();

                return true;

            case R.id.pref:
                // Do Something
                startActivity(new Intent(this, Prefs.class));
                return true;
        }
        return false;

    }


    @Override
    public void onClick (View view) {
        switch (view.getId()){
            case R.id.photoalbum:
                Intent i = new Intent(this, PhotoAlbum.class);
                startActivity(i);
                break;
        }

    }
}
