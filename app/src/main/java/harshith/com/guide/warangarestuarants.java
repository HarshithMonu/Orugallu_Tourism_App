package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class warangarestuarants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warangarestuarants);

        Button button1 = (Button) findViewById(R.id.citygrand);
        Uri gmmIntentUri = Uri.parse("google.navigation:q=City Grand ,+Warangal");

        final Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent);


            }
        });
        Button button2 = (Button) findViewById(R.id.amgh);
        Uri gmmIntentUri2 = Uri.parse("google.navigation:q=Amogh Restaurant,+Warangal");

        final Intent mapIntent2 = new Intent(Intent.ACTION_VIEW, gmmIntentUri2);
        mapIntent.setPackage("com.google.android.apps.maps");
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent2);


            }
        });
        Button button3 = (Button) findViewById(R.id.bay);
        Uri gmmIntentUri3 = Uri.parse("google.navigation:q=Bayleaf multi-cuisine restaurant Falls,+Warangal");

        final Intent mapIntent3 = new Intent(Intent.ACTION_VIEW, gmmIntentUri3);
        mapIntent.setPackage("com.google.android.apps.maps");
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent3);


            }
        });
        Button button4 = (Button) findViewById(R.id.sasya);
        Uri gmmIntentUri4 = Uri.parse("google.navigation:q=Sri Sasya Restaurant,+Warangal");

        final Intent mapIntent4 = new Intent(Intent.ACTION_VIEW, gmmIntentUri4);
        mapIntent.setPackage("com.google.android.apps.maps");
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent4);


            }
        });
        Button button5 = (Button) findViewById(R.id.hratna);
        Uri gmmIntentUri5 = Uri.parse("google.navigation:q=Hotel Ratna,+Warangal");

        final Intent mapIntent5 = new Intent(Intent.ACTION_VIEW, gmmIntentUri5);
        mapIntent.setPackage("com.google.android.apps.maps");
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent5);


            }
        });
        Button button6 = (Button) findViewById(R.id.kur);
        Uri gmmIntentUri6 = Uri.parse("google.navigation:q=Khursheed,+Warangal");

        final Intent mapIntent6 = new Intent(Intent.ACTION_VIEW, gmmIntentUri6);
        mapIntent.setPackage("com.google.android.apps.maps");
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent6);


            }
        });
        Button button7 = (Button) findViewById(R.id.urban);
        Uri gmmIntentUri7 = Uri.parse("google.navigation:q=Urban Spice,+Warangal");

        final Intent mapIntent7 = new Intent(Intent.ACTION_VIEW, gmmIntentUri7);
        mapIntent.setPackage("com.google.android.apps.maps");
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent7);


            }
        });
        Button button8 = (Button) findViewById(R.id.mahabaw);
        Uri gmmIntentUri8 = Uri.parse("google.navigation:q=Maharaja Bawarchi Biryani Hotel,+Warangal");

        final Intent mapIntent8 = new Intent(Intent.ACTION_VIEW, gmmIntentUri8);
        mapIntent.setPackage("com.google.android.apps.maps");
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent8);


            }
        });




    }
}
