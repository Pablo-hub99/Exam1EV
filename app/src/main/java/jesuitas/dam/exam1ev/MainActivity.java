package jesuitas.dam.exam1ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void Mensaje(MenuItem item) {
        Intent intent = getIntent();
        String Correo =intent.getStringExtra("Correo");

    }

    public void añadir(MenuItem item) {
        TextView Nombre = findViewById(R.id.Nombre);
        TextView Telefono= findViewById(R.id.Telefono);
        TextView Correo= findViewById(R.id.Correo);

        Intent intent = new Intent(this,SegundaPantalla.class);
        intent.putExtra("Nombre",Nombre.getText().toString());
        intent.putExtra("Correo",Correo.getText().toString());
        intent.putExtra("Telefono",Telefono.getText().toString());
        startActivity(intent);

    }



    public void llamar(MenuItem item) {


    }
}