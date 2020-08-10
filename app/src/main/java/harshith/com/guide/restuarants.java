package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class restuarants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restuarants);

        Button button20 = (Button) findViewById(R.id.rest);
        Button button21 =  (Button) findViewById(R.id.bites);

        final Intent intent20 = new Intent(this, restarantsmap.class);
        button20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(intent20);

            }
        });
        final Intent intent21 = new Intent(this, quickbitesmap.class);
        button21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(intent21);

            }
        });


    }
}
