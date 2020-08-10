package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class restarantsmap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restarantsmap);


        Button button90 = (Button) findViewById(R.id.subkzpres);
        Button button91 = (Button) findViewById(R.id.hnkres);
        Button button92 = (Button) findViewById(R.id.warres);


        final Intent intent90 = new Intent(this, vshnavigrand.class);
        button90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent90);

            }
        });
        final Intent intent91 = new Intent(this, hanamakonda.class);
        button91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent91);

            }
        });
        final Intent intent92 = new Intent(this, warangarestuarants.class);
        button92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent92);

            }
        });

    }
}
