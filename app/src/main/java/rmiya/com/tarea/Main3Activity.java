package rmiya.com.tarea;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toolbar;

import java.lang.reflect.Array;

public class Main3Activity extends AppCompatActivity {

    Spinner sp_correo, sp_day, sp_hour, hora_inter, sp_day1, sp_hour1;
    ArrayAdapter<String> aaCorreo, aadia, aahora, aaInter, aaClear;

    String [] opc_correo = new String[]{"ronald.miya@tecsup.edu.pe", "mario.bros@tecsup.edu.pe"};
    String [] opc_dia = new String[]{"Fri,Feb 10 2018", "Fri,Feb 11 2018", "Fri,Feb 12 2018"};
    String [] opc_hora = new String[]{"4:30 PM", "5:00 PM", "5:30 PM"};
    String [] opc_inter = new String[]{"Pacific Standart Time", "Ecuador - Meridiano"};
    String [] opc_Clear = new String[0];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Spiner

        sp_correo = (Spinner) findViewById(R.id.sp_correo);
        sp_day = (Spinner) findViewById(R.id.sp_day);
        sp_day1 = (Spinner) findViewById(R.id.sp_day1);
        sp_hour = (Spinner) findViewById(R.id.sp_hour);
        sp_hour1 = (Spinner) findViewById(R.id.sp_hour1);
        hora_inter = (Spinner) findViewById(R.id.hora_inter_sp);


        /*
        sp_correo.setOnItemClickListener((AdapterView.OnItemClickListener) this);
        sp_day.setOnItemClickListener((AdapterView.OnItemClickListener) this);
        sp_hour.setOnItemClickListener((AdapterView.OnItemClickListener) this);
        hora_inter.setOnItemClickListener((AdapterView.OnItemClickListener) this);
        */
        aaCorreo = new ArrayAdapter<String>(this, R.layout.spinner_item_correo, opc_correo);
        aadia = new ArrayAdapter<String>(this, R.layout.spinner_item_correo, opc_dia);
        aahora = new ArrayAdapter<String>(this, R.layout.spinner_item_correo, opc_hora);
        aaInter = new ArrayAdapter<String>(this, R.layout.spinner_item_correo, opc_inter);
        aaClear = new ArrayAdapter<String>(this, R.layout.spinner_item_correo, opc_Clear);

        sp_correo.setAdapter(aaCorreo);
        sp_day.setAdapter(aadia);
        sp_day1.setAdapter(aadia);
        sp_hour.setAdapter(aahora);
        sp_hour1.setAdapter(aahora);
        hora_inter.setAdapter(aaInter);

    }

    public void showToolbar(String title, boolean upButton) {
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
/*
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (parent.getId()) {
            case R.id.sp_correo:
                int seleccion = sp_correo.getSelectedItemPosition();
                if (seleccion == 3)
                    sp_correo.setAdapter(aaCorreo);
                else
                    sp_correo.setAdapter(aaClear) ;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
*/}
