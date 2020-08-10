package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vshnavigrand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vshnavigrand);

        Button button1 = (Button) findViewById(R.id.vai);
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Hotel Vaishnavi Grand,+Warangal");

        final Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent);


            }
        });
        Button button2 = (Button) findViewById(R.id.spn);
        Uri gmmIntentUri2 = Uri.parse("google.navigation:q=Silver Spoon Restaurant,+Warangal");
        final Intent mapIntent2 = new Intent(Intent.ACTION_VIEW, gmmIntentUri2);
        mapIntent.setPackage("com.google.android.apps.maps");
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent2);


            }
        });
        Button button3 = (Button) findViewById(R.id.paa);
        Uri gmmIntentUri3 = Uri.parse("google.navigation:q=Palamuru Grill Restaurant,+Warangal");

        final Intent mapIntent3 = new Intent(Intent.ACTION_VIEW, gmmIntentUri3);
        mapIntent.setPackage("com.google.android.apps.maps");
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent3);


            }
        });
        Button button4 = (Button) findViewById(R.id.sidra);
        Uri gmmIntentUri4 = Uri.parse("google.navigation:q=Sidra Biryani House,+Warangal");

        final Intent mapIntent4 = new Intent(Intent.ACTION_VIEW, gmmIntentUri4);
        mapIntent.setPackage("com.google.android.apps.maps");
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent4);


            }
        });
        Button button5 = (Button) findViewById(R.id.manar);
        Uri gmmIntentUri5 = Uri.parse("google.navigation:q=MANAR KEBAB and GRILL,+Warangal");

        final Intent mapIntent5 = new Intent(Intent.ACTION_VIEW, gmmIntentUri5);
        mapIntent.setPackage("com.google.android.apps.maps");
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent5);


            }
        });
        Button button6 = (Button) findViewById(R.id.dine);
        Uri gmmIntentUri6 = Uri.parse("google.navigation:q=Dine9 Arabian Multicuisine Restaurant,+Warangal");

        final Intent mapIntent6 = new Intent(Intent.ACTION_VIEW, gmmIntentUri6);
        mapIntent.setPackage("com.google.android.apps.maps");
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent6);


            }
        });
        Button button7 = (Button) findViewById(R.id.kanishka);
        Uri gmmIntentUri7 = Uri.parse("google.navigation:q=Kanishka Dhaba,+Warangal");

        final Intent mapIntent7 = new Intent(Intent.ACTION_VIEW, gmmIntentUri7);
        mapIntent.setPackage("com.google.android.apps.maps");
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent7);


            }
        });
        Button button8 = (Button) findViewById(R.id.kadai);
        Uri gmmIntentUri8 = Uri.parse("google.navigation:q=KADAI MULTI CUISINE RESTAURANT,+Warangal");

        final Intent mapIntent8 = new Intent(Intent.ACTION_VIEW, gmmIntentUri8);
        mapIntent.setPackage("com.google.android.apps.maps");
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent8);


            }
        });
        Button button9 = (Button) findViewById(R.id.sri);
        Uri gmmIntentUri9 = Uri.parse("google.navigation:q=Sri Kalinga Restaurant,+Warangal");

        final Intent mapIntent9 = new Intent(Intent.ACTION_VIEW, gmmIntentUri9);
        mapIntent.setPackage("com.google.android.apps.maps");
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent9);


            }
        });
        Button button10 = (Button) findViewById(R.id.axmi);
        Uri gmmIntentUri10 = Uri.parse("google.navigation:q=Laxmi Lagoons Kitchen,+Warangal");

        final Intent mapIntent10 = new Intent(Intent.ACTION_VIEW, gmmIntentUri10);
        mapIntent.setPackage("com.google.android.apps.maps");
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent10);


            }
        });
        Button button11 = (Button) findViewById(R.id.sky);
        Uri gmmIntentUri11 = Uri.parse("google.navigation:q=Skyla Pure Veg Restaurant,+Warangal");

        final Intent mapIntent11 = new Intent(Intent.ACTION_VIEW, gmmIntentUri11);
        mapIntent.setPackage("com.google.android.apps.maps");
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent11);


            }
        });
        Button button12 = (Button) findViewById(R.id.dawat);
        Uri gmmIntentUri12 = Uri.parse("google.navigation:q=DAAWAT Multi Cuisine Family Restaurant,+Warangal");

        final Intent mapIntent12 = new Intent(Intent.ACTION_VIEW, gmmIntentUri12);
        mapIntent.setPackage("com.google.android.apps.maps");
        button12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent12);


            }
        });
        Button button13 = (Button) findViewById(R.id.kagrand);
        Uri gmmIntentUri13 = Uri.parse("google.navigation:q=Kakatiya Grand Hotel,+Warangal");

        final Intent mapIntent13 = new Intent(Intent.ACTION_VIEW, gmmIntentUri13);
        mapIntent.setPackage("com.google.android.apps.maps");
        button13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent13);


            }
        });
        Button button14 = (Button) findViewById(R.id.green);
        Uri gmmIntentUri14 = Uri.parse("google.navigation:q=GreenPark Biryani House,+Warangal");

        final Intent mapIntent14 = new Intent(Intent.ACTION_VIEW, gmmIntentUri14);
        mapIntent.setPackage("com.google.android.apps.maps");
        button14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent14);


            }
        });
        Button button15 = (Button) findViewById(R.id.jun);
        Uri gmmIntentUri15 = Uri.parse("google.navigation:q=Junoon Fine Dine Restaurant,+Warangal");

        final Intent mapIntent15 = new Intent(Intent.ACTION_VIEW, gmmIntentUri15);
        mapIntent.setPackage("com.google.android.apps.maps");
        button15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent15);


            }
        });

    }
}
