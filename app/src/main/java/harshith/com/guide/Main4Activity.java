package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button button33 = (Button) findViewById(R.id.bdt);
        Button button34 = (Button) findViewById(R.id.rmp);
        Button button35 = (Button) findViewById(R.id.smk);
        Button button36 = (Button) findViewById(R.id.tp);
        Button button37 = (Button) findViewById(R.id.pmt);
        Button button38 = (Button) findViewById(R.id.sbtt);

        final Intent intent4 = new Intent(this, Main5Activity.class);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent4);
            }
        });

        final Intent intent5 = new Intent(this, ramappa.class);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent5);
            }
        });

        final Intent intent6 = new Intent(this, samaka.class);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent6);
            }
        });

        final Intent intent7 = new Intent(this, thusand.class);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent7);
            }
        });

        final Intent intent8 = new Intent(this, padmaskhitemp.class);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent8);
            }
        });

        final Intent intent9 = new Intent(this, saibabatemple.class);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent9);
            }
        });



    }
}

