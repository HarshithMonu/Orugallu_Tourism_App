package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chidparks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chidparks);

        Button button = (Button) findViewById(R.id.ba);

        Uri gmmIntentUri = Uri.parse("google.navigation:q=children's park,Balasamudram,+Warangal");

        final Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent);


            }
        });
        Button button1 = (Button) findViewById(R.id.vikas);

        Uri gmmIntentUri1 = Uri.parse("google.navigation:q=Children Park,Vikas Nagar rd,+Warangal");

        final Intent mapIntent1 = new Intent(Intent.ACTION_VIEW, gmmIntentUri1);
        mapIntent.setPackage("com.google.android.apps.maps");
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent1);


            }
        });

    }
}
