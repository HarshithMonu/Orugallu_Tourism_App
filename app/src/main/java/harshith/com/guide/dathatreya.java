package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dathatreya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dathatreya);

        Button button = (Button) findViewById(R.id.data);
        Uri gmnIntentUri = Uri.parse("geo:17.978659,79.596978?q=Dhattatreya Swamy temple");

        final Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmnIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                startActivity(mapIntent);


            }
        });

    }
}
