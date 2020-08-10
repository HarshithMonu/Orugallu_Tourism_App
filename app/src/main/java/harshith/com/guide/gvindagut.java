package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gvindagut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gvindagut);

        Button button1 = (Button) findViewById(R.id.gvinda);

        Uri gmmIntentUri = Uri.parse("google.navigation:q=Govinda Rajula Gutta,+Warangal");

        final Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent);


            }
        });

    }
}
