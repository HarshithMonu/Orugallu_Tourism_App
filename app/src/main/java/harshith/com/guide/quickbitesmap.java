package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quickbitesmap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quickbitesmap);

        Button button1 = (Button) findViewById(R.id.kfc);
        Uri gmmIntentUri = Uri.parse("google.navigation:q=KFC,+Warangal");

        final Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent);


            }
        });
        Button button2 = (Button) findViewById(R.id.dmn);
        Uri gmmIntentUri2 = Uri.parse("google.navigation:q=Domino's Pizza,+Warangal");
        final Intent mapIntent2 = new Intent(Intent.ACTION_VIEW, gmmIntentUri2);
        mapIntent.setPackage("com.google.android.apps.maps");
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent2);


            }
        });
        Button button3 = (Button) findViewById(R.id.br);
        Uri gmmIntentUri3 = Uri.parse("google.navigation:q=Baskin Robbins,+Warangal");

        final Intent mapIntent3 = new Intent(Intent.ACTION_VIEW, gmmIntentUri3);
        mapIntent.setPackage("com.google.android.apps.maps");
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent3);


            }
        });
        Button button4 = (Button) findViewById(R.id.cs);
        Uri gmmIntentUri4 = Uri.parse("google.navigation:q=Cream Stone,+Warangal");

        final Intent mapIntent4 = new Intent(Intent.ACTION_VIEW, gmmIntentUri4);
        mapIntent.setPackage("com.google.android.apps.maps");
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent4);


            }
        });
        Button button5 = (Button) findViewById(R.id.dm);
        Uri gmmIntentUri5 = Uri.parse("google.navigation:q=Drunken Monkey,+Warangal");

        final Intent mapIntent5 = new Intent(Intent.ACTION_VIEW, gmmIntentUri5);
        mapIntent.setPackage("com.google.android.apps.maps");
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent5);


            }
        });
        Button button6 = (Button) findViewById(R.id.rice);
        Uri gmmIntentUri6 = Uri.parse("google.navigation:q=Roll Over,+Warangal");

        final Intent mapIntent6 = new Intent(Intent.ACTION_VIEW, gmmIntentUri6);
        mapIntent.setPackage("com.google.android.apps.maps");
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent6);


            }
        });
        Button button7 = (Button) findViewById(R.id.tsf);
        Uri gmmIntentUri7 = Uri.parse("google.navigation:q=Thick Shake Factory,+Warangal");

        final Intent mapIntent7 = new Intent(Intent.ACTION_VIEW, gmmIntentUri7);
        mapIntent.setPackage("com.google.android.apps.maps");
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent7);


            }
        });
        Button button8 = (Button) findViewById(R.id.shp);
        Uri gmmIntentUri8 = Uri.parse("google.navigation:q=LASSI SHOP,+Warangal");

        final Intent mapIntent8 = new Intent(Intent.ACTION_VIEW, gmmIntentUri8);
        mapIntent.setPackage("com.google.android.apps.maps");
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent8);


            }
        });
        Button button9 = (Button) findViewById(R.id.cff);
        Uri gmmIntentUri9 = Uri.parse("google.navigation:q=The Coffee Lounge,+Warangal");

        final Intent mapIntent9 = new Intent(Intent.ACTION_VIEW, gmmIntentUri9);
        mapIntent.setPackage("com.google.android.apps.maps");
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent9);


            }
        });
        Button button10 = (Button) findViewById(R.id.cupper);
        Uri gmmIntentUri10 = Uri.parse("google.navigation:q=Le Cupper's Coffee Shop,+Warangal");

        final Intent mapIntent10 = new Intent(Intent.ACTION_VIEW, gmmIntentUri10);
        mapIntent.setPackage("com.google.android.apps.maps");
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent10);


            }
        });
        Button button11 = (Button) findViewById(R.id.mnkey);
        Uri gmmIntentUri11 = Uri.parse("google.navigation:q=Little Monkey Cafe,+Warangal");

        final Intent mapIntent11 = new Intent(Intent.ACTION_VIEW, gmmIntentUri11);
        mapIntent.setPackage("com.google.android.apps.maps");
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent11);


            }
        });
        Button button12 = (Button) findViewById(R.id.ravi);
        Uri gmmIntentUri12 = Uri.parse("google.navigation:q=Ravishing The Milkshake Bar,+Warangal");

        final Intent mapIntent12 = new Intent(Intent.ACTION_VIEW, gmmIntentUri12);
        mapIntent.setPackage("com.google.android.apps.maps");
        button12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent12);


            }
        });
        Button button13 = (Button) findViewById(R.id.mb);
        Uri gmmIntentUri13 = Uri.parse("google.navigation:q=MilkShake Buffin,+Warangal");

        final Intent mapIntent13 = new Intent(Intent.ACTION_VIEW, gmmIntentUri13);
        mapIntent.setPackage("com.google.android.apps.maps");
        button13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent13);


            }
        });
        Button button14 = (Button) findViewById(R.id.cya);
        Uri gmmIntentUri14 = Uri.parse("google.navigation:q=CYA - Crave Your Appetite,+Warangal");

        final Intent mapIntent14 = new Intent(Intent.ACTION_VIEW, gmmIntentUri14);
        mapIntent.setPackage("com.google.android.apps.maps");
        button14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent14);


            }
        });
        Button button15 = (Button) findViewById(R.id.bff);
        Uri gmmIntentUri15 = Uri.parse("google.navigation:q=Barista Fast food and Juice center,+Warangal");

        final Intent mapIntent15 = new Intent(Intent.ACTION_VIEW, gmmIntentUri15);
        mapIntent.setPackage("com.google.android.apps.maps");
        button15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent15);


            }
        });
        Button button16 = (Button) findViewById(R.id.hbird);
        Uri gmmIntentUri16 = Uri.parse("google.navigation:q=Hungry Birds,+Warangal");

        final Intent mapIntent16 = new Intent(Intent.ACTION_VIEW, gmmIntentUri16);
        mapIntent.setPackage("com.google.android.apps.maps");
        button16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent16);


            }
        });
        Button button17 = (Button) findViewById(R.id.eam);
        Uri gmmIntentUri17 = Uri.parse("google.navigation:q=Eat & Meet,+Warangal");

        final Intent mapIntent17 = new Intent(Intent.ACTION_VIEW, gmmIntentUri17);
        mapIntent.setPackage("com.google.android.apps.maps");
        button17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent17);


            }
        });
        Button button18 = (Button) findViewById(R.id.states);
        Uri gmmIntentUri18 = Uri.parse("google.navigation:q=2 States,+Warangal");

        final Intent mapIntent18 = new Intent(Intent.ACTION_VIEW, gmmIntentUri18);
        mapIntent.setPackage("com.google.android.apps.maps");
        button18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent18);


            }
        });
        Button button19 = (Button) findViewById(R.id.sms);
        Uri gmmIntentUri19 = Uri.parse("google.navigation:q=Shakes'M'Stones,+Warangal");

        final Intent mapIntent19 = new Intent(Intent.ACTION_VIEW, gmmIntentUri19);
        mapIntent.setPackage("com.google.android.apps.maps");
        button19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent19);


            }
        });
        Button button20 = (Button) findViewById(R.id.im);
        Uri gmmIntentUri20 = Uri.parse("google.navigation:q=Ice Magic,+Warangal");

        final Intent mapIntent20 = new Intent(Intent.ACTION_VIEW, gmmIntentUri20);
        mapIntent.setPackage("com.google.android.apps.maps");
        button20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent20);


            }
        });
        Button button21 = (Button) findViewById(R.id.cc);
        Uri gmmIntentUri21 = Uri.parse("google.navigation:q=Chaat Chatore,+Warangal");

        final Intent mapIntent21 = new Intent(Intent.ACTION_VIEW, gmmIntentUri21);
        mapIntent.setPackage("com.google.android.apps.maps");
        button21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent21);


            }
        });
        Button button22 = (Button) findViewById(R.id.dh);
        Uri gmmIntentUri22 = Uri.parse("google.navigation:q=De Hideout,+Warangal");

        final Intent mapIntent22 = new Intent(Intent.ACTION_VIEW, gmmIntentUri22);
        mapIntent.setPackage("com.google.android.apps.maps");
        button22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent22);


            }
        });
        Button button23 = (Button) findViewById(R.id.pf);
        Uri gmmIntentUri23 = Uri.parse("google.navigation:q=Party Fowl,+Warangal");

        final Intent mapIntent23 = new Intent(Intent.ACTION_VIEW, gmmIntentUri23);
        mapIntent.setPackage("com.google.android.apps.maps");
        button23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent23);


            }
        });
        Button button24 = (Button) findViewById(R.id.bs);
        Uri gmmIntentUri24 = Uri.parse("google.navigation:q=Bottle and Straw,+Warangal");

        final Intent mapIntent24 = new Intent(Intent.ACTION_VIEW, gmmIntentUri24);
        mapIntent.setPackage("com.google.android.apps.maps");
        button24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent24);


            }
        });
        Button button25 = (Button) findViewById(R.id.km);
        Uri gmmIntentUri25 = Uri.parse("google.navigation:q=Kaaram Kunda,+Warangal");

        final Intent mapIntent25 = new Intent(Intent.ACTION_VIEW, gmmIntentUri25);
        mapIntent.setPackage("com.google.android.apps.maps");
        button25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent25);


            }
        });
        Button button26 = (Button) findViewById(R.id.mc);
        Uri gmmIntentUri26 = Uri.parse("google.navigation:q=Mama Chicken,+Warangal");

        final Intent mapIntent26 = new Intent(Intent.ACTION_VIEW, gmmIntentUri26);
        mapIntent.setPackage("com.google.android.apps.maps");
        button26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent26);


            }
        });
    }
}
