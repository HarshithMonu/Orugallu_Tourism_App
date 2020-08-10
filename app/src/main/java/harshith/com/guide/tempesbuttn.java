package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class tempesbuttn extends AppCompatActivity {

    String[] mobileArray = {"Ramappa Temple","Medaram Jatara","Bhadrakali Temple","1000 pillar temple","Inavollu Mallanna Temple","Padmakshi Temple","Govinda Rajula Gutta","Rayaparthy Shiva Temple","Sri Siddeshwara Temple","Swayambhu temple","Ganapeshwaralayam ( Kota Gullu )","Sri Hemachala Laxmi Narsimha Swamy Devalayam","Sai baba Temple","Mettugutta Ramalingeshware temple","Kotilingala Temple","Swetharkamoola Ganapathi Temple","ISKCON Temple","Dhattatreya Swamy Temple","Sri Someshwara Lakshmi Narashimha Swamy Temple","Hari Hara Kshethram Ayyappa Swamy Temple","Narasimha Swamy Temple"};
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempesbuttn);
        context = this;

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.tempes_list);
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
                        startActivity(new Intent(context,inavutemp.class));
                        break;
                    case 5:
                        startActivity(new Intent(context,padmaksgutta.class));
                        break;
                    case 6:
                        startActivity(new Intent(context,gvindagut.class));
                        break;
                    case 7:
                        startActivity(new Intent(context,rayaparthy.class));
                        break;
                    case 8:
                        startActivity(new Intent(context,sideshwara.class));
                        break;
                    case 9:
                        startActivity(new Intent(context,swaymbu.class));
                        break;
                    case 10:
                        startActivity(new Intent(context,kataghapur.class));
                        break;
                    case 11:
                        startActivity(new Intent(context,hemachatemp.class));
                        break;
                    case 12:
                        startActivity(new Intent(context,saibabatemple.class));
                        break;
                    case 13:
                        startActivity(new Intent(context,metutatempe.class));
                        break;
                    case 14:
                        startActivity(new Intent(context,kotitemple.class));
                        break;
                    case 15:
                        startActivity(new Intent(context,swethaganapathi.class));
                        break;
                    case 16:
                        startActivity(new Intent(context,iskn.class));
                        break;
                    case 17:
                        startActivity(new Intent(context,dathatreya.class));
                        break;
                    case 18:
                        startActivity(new Intent(context,smeshwara.class));
                        break;
                    case 19:
                        startActivity(new Intent(context,harihara.class));
                        break;
                    case 20:
                        startActivity(new Intent(context,narasimha.class));
                        break;


                }
            }
        });









    }
}
