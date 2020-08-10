package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class visitingbuttns extends AppCompatActivity {

    String[] mobileArray = {"Ramappa lake","Laknavaram Lake","Bogatha Waterfall","Pakala Cheruvu","Pakhal Wildlife Sanctuary","Eturnagaram wild life sanctuary","Bheemuni Paadam Waterfalls","Pandavula Guhalu","Warangal Fort","Warangal ASI Museum","Regional Science Center Warangal","Aggalaiah Gutta","Inuprathi Guttalu","Kush Mahal"};
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitingbuttns);

        context = this;

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.visit_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        startActivity(new Intent(context, ramapa_lake.class));
                        break;
                    case 1:
                        startActivity(new Intent(context,Laknavaram.class));
                        break;
                    case 2:
                        startActivity(new Intent(context,Bgtha.class));
                        break;
                    case 3:
                        startActivity(new Intent(context,pakah.class));
                        break;
                    case 4:
                        startActivity(new Intent(context,pakahws.class));
                        break;
                    case 5:
                        startActivity(new Intent(context,etungrmws.class));
                        break;
                    case 6:
                        startActivity(new Intent(context,bheemuni.class));
                        break;
                    case 7:
                        startActivity(new Intent(context,pandava.class));
                        break;
                    case 8:
                        startActivity(new Intent(context,warangafrt.class));
                        break;
                    case 9:
                        startActivity(new Intent(context,waranmuesem.class));
                        break;
                    case 10:
                        startActivity(new Intent(context,reginascience.class));
                        break;
                    case 11:
                        startActivity(new Intent(context,aggalaiahgutta.class));
                        break;
                    case 12:
                        startActivity(new Intent(context,inuparthi.class));
                        break;
                    case 13:
                        startActivity(new Intent(context,kushmaha.class));
                        break;

                }
            }
        });

    }
}
