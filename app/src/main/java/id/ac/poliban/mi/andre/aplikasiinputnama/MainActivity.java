package id.ac.poliban.mi.andre.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama = findViewById(R.id.etNama);
        Button btSubmit = findViewById(R.id.btn);

        btSubmit.setOnClickListener(v -> {
            Toast.makeText(this, "Selamat Datang "
                    +etNama.getText().toString(), Toast.LENGTH_LONG).show();
        });
    }
}
