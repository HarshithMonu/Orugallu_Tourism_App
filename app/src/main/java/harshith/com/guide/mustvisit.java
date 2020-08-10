package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mustvisit extends AppCompatActivity {

    String[] mobileArray = {"Ramappa Temple","Medaram Jatara","Bhadrakali Temple","1000 pillar temple","Warangal Fort","Laknavaram","Pakhal Wildlife Sanctuary","Eturnagaram Wildlife Sanctuary","Bogatha Waterfall","Bheemuni Paadam Waterfalls"};
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mustvisit);
        context = this;

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.must_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        startActivity(new Intent(context, ramappa.class));
                        break;
                    case 1:
                        startActivity(new Intent(context,samaka.class));
                        break;
                    case 2:
                        startActivity(new Intent(context,Main5Activity.class));
                        break;
                    case 3:
                        startActivity(new Intent(context,thusand.class));
                        break;
                    case 4:
                        startActivity(new Intent(context,warangafrt.class));
                        break;
                    case 5:
                        startActivity(new Intent(context,Laknavaram.class));
                        break;
                    case 6:
                        startActivity(new Intent(context,pakahws.class));
                        break;
                    case 7:
                        startActivity(new Intent(context,etungrmws.class));
                        break;
                    case 8:
                        startActivity(new Intent(context,Bgtha.class));
                        break;
                    case 9:
                        startActivity(new Intent(context,bheemuni.class));
                        break;

                }
            }
        });









    }
}
