package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    //private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = (Button) findViewById(R.id.button);
        Button button1 = (Button) findViewById(R.id.btn2);
        Button button2 = (Button) findViewById(R.id.Temples);
        Button button30 = (Button) findViewById(R.id.park);
        Button button40 = (Button) findViewById(R.id.packages);
        Button button41 = (Button) findViewById(R.id.hotel);
        Button button50 = (Button) findViewById(R.id.mustvistp);

        final Intent intent = new Intent(this, visitingbuttns.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent);

            }
        });
        final Intent intent2 = new Intent(this, restuarants.class);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent2);

            }
        });
        final Intent intent3 = new Intent(this, tempesbuttn.class);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent3);

            }
        });
        final Intent intent4 = new Intent(this, parksbuttn.class);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent4);

            }
        });
        final Intent intent5 = new Intent(this, turism.class);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent5);

            }
        });

        final Intent intent6 = new Intent(this, Hotel.class);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent6);

            }
        });
        final Intent intent7 = new Intent(this, mustvisit.class);
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent7);

            }
        });
    }
}


