package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hanamakonda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanamakonda);

        Button button1 = (Button) findViewById(R.id.bmr);
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Bommarillu Restaurant ,+Warangal");

        final Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent);


            }
        });
        Button button2 = (Button) findViewById(R.id.kaka);
        Uri gmmIntentUri2 = Uri.parse("google.navigation:q=Haritha Kakatiya Hotel,+Warangal");
        final Intent mapIntent2 = new Intent(Intent.ACTION_VIEW, gmmIntentUri2);
        mapIntent.setPackage("com.google.android.apps.maps");
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent2);


            }
        });
        Button button3 = (Button) findViewById(R.id.and);
        Uri gmmIntentUri3 = Uri.parse("google.navigation:q=Landmark Hotel,+Warangal");

        final Intent mapIntent3 = new Intent(Intent.ACTION_VIEW, gmmIntentUri3);
        mapIntent.setPackage("com.google.android.apps.maps");
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent3);


            }
        });
        Button button4 = (Button) findViewById(R.id.supra);
        Uri gmmIntentUri4 = Uri.parse("google.navigation:q=Suprabha Hotel,+Warangal");

        final Intent mapIntent4 = new Intent(Intent.ACTION_VIEW, gmmIntentUri4);
        mapIntent.setPackage("com.google.android.apps.maps");
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent4);


            }
        });
        Button button5 = (Button) findViewById(R.id.pap);
        Uri gmmIntentUri5 = Uri.parse("google.navigation:q=Paprikas Restaurant,+Warangal");

        final Intent mapIntent5 = new Intent(Intent.ACTION_VIEW, gmmIntentUri5);
        mapIntent.setPackage("com.google.android.apps.maps");
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent5);


            }
        });
        Button button6 = (Button) findViewById(R.id.papbu);
        Uri gmmIntentUri6 = Uri.parse("google.navigation:q=Papadams Blue Warangal,+Warangal");

        final Intent mapIntent6 = new Intent(Intent.ACTION_VIEW, gmmIntentUri6);
        mapIntent.setPackage("com.google.android.apps.maps");
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent6);


            }
        });
        Button button7 = (Button) findViewById(R.id.hsupra);
        Uri gmmIntentUri7 = Uri.parse("google.navigation:q=Hotel Suprabhat,Karimnagar Road,Vidya Nagar,+Warangal");

        final Intent mapIntent7 = new Intent(Intent.ACTION_VIEW, gmmIntentUri7);
        mapIntent.setPackage("com.google.android.apps.maps");
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent7);


            }
        });
        Button button8 = (Button) findViewById(R.id.hash);
        Uri gmmIntentUri8 = Uri.parse("google.navigation:q=Hotel Ashoka,+Warangal");

        final Intent mapIntent8 = new Intent(Intent.ACTION_VIEW, gmmIntentUri8);
        mapIntent.setPackage("com.google.android.apps.maps");
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent8);


            }
        });
        Button button9 = (Button) findViewById(R.id.geetha);
        Uri gmmIntentUri9 = Uri.parse("google.navigation:q=Sri Geetha Bhavan A/C Udipi Vegetarian Restaurant,+Warangal");

        final Intent mapIntent9 = new Intent(Intent.ACTION_VIEW, gmmIntentUri9);
        mapIntent.setPackage("com.google.android.apps.maps");
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent9);


            }
        });
        Button button10 = (Button) findViewById(R.id.hshreya);
        Uri gmmIntentUri10 = Uri.parse("google.navigation:q=Hotel Shreya ,+Warangal");

        final Intent mapIntent10 = new Intent(Intent.ACTION_VIEW, gmmIntentUri10);
        mapIntent.setPackage("com.google.android.apps.maps");
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent10);


            }
        });
        Button button11 = (Button) findViewById(R.id.pat);
        Uri gmmIntentUri11 = Uri.parse("google.navigation:q=Potatoes,+Warangal");

        final Intent mapIntent11 = new Intent(Intent.ACTION_VIEW, gmmIntentUri11);
        mapIntent.setPackage("com.google.android.apps.maps");
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent11);


            }
        });
    }
}
