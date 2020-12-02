package jesuitas.dam.exam1ev;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaPantalla extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
    }
    public void Name(EditText item) {
        Intent intent= getIntent();
        String Nombre = intent.getStringExtra("Nombre");
      }
      public void phone(EditText item){
        Intent intent = getIntent();
        String Telefono = intent.getStringExtra("Telefono");
      }
      public void Email(EditText item){
        Intent intent = getIntent();
        String Email = intent.getStringExtra("Correo");
      }
      public void Enviar(Button item){
        EditText Name = findViewById(R.id.Name);
        EditText phone = findViewById(R.id.phone);
        EditText Email = findViewById(R.id.Email);

          boolean vacio = getLocalClassName().isEmpty();
          if(vacio){
              Toast myToast = Toast.makeText(this,"Complete los datos", Toast.LENGTH_LONG);
              myToast.show();
          }
          else if (!vacio){
              AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(SegundaPantalla.this);
              myAlertBuilder.setMessage("¿Estas seguro?");
              Intent sendIntent = new Intent();


          }
      }
}
