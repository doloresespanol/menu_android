package pl.wojtek.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class ProgramistaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programista);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.programista: {
                Toast.makeText(this, "programista", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.informatyk:{
                Toast.makeText(this, "informatyk", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ProgramistaActivity.this,InformatykActivity.class);
                startActivity(intent);
                return true;
            }
            case R.id.elektronik:{
                Toast.makeText(this, "elektronik", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ProgramistaActivity.this,ElektronikActivity.class);
                startActivity(intent);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}