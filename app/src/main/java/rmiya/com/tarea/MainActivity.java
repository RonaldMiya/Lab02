package rmiya.com.tarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view) {
        //btn = (Button) findViewById(R.id.btnSave);

        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}
