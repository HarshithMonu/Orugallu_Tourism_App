package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hotel extends AppCompatActivity {

    String[] mobileArray = {"Grand Gayatri"," Hotel Crystal","Hotel Ratna","City Grand ","Ashoka Hotel","Hotel Shreya","Shreshta Inn","Radhika Residency","Satya Lodge ","Mitra Residency"," Hotel Suprabha","Haritha Kakatiya","Hotel Landmark","Raghavendra Residency"};
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        context = this;

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.hotel_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        startActivity(new Intent(context, grandgayatri.class));
                        break;
                    case 1:
                        startActivity(new Intent(context,crysta.class));
                        break;
                    case 2:
                        startActivity(new Intent(context,ratna.class));
                        break;
                    case 3:
                        startActivity(new Intent(context,citygrand.class));
                        break;
                    case 4:
                        startActivity(new Intent(context,ashka.class));
                        break;
                    case 5:
                        startActivity(new Intent(context,shreya.class));
                        break;
                    case 6:
                        startActivity(new Intent(context,shreshta.class));
                        break;
                    case 7:
                        startActivity(new Intent(context,radhika.class));
                        break;
                    case 8:
                        startActivity(new Intent(context,satya.class));
                        break;
                    case 9:
                        startActivity(new Intent(context,mitra.class));
                        break;
                    case 10:
                        startActivity(new Intent(context,supprabha.class));
                        break;
                    case 11:
                        startActivity(new Intent(context,harithakakatiya.class));
                        break;
                    case 12:
                        startActivity(new Intent(context,mark.class));
                        break;
                    case 13:
                        startActivity(new Intent(context,ragahvendra.class));
                        break;


                }
            }
        });



    }
}
