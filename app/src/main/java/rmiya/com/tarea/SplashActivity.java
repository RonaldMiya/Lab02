package rmiya.com.tarea;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        String fuente1 = "font/BerkshireSwash.ttf";
        Typeface berk = Typeface.createFromAsset(getAssets(), fuente1);

        TextView text1 = findViewById(R.id.name_apli);
        text1.setTypeface(berk);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(SplashActivity.this, Main2Activity.class));
                finish();
            }
        }, 5000);

    }

}
