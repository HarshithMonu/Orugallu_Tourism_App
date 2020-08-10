package harshith.com.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class parksbuttn extends AppCompatActivity {

    String[] mobileArray = {"Kakatiya Musical Garden","Ekashila Lake and Children Garden","GWMC Public Garden","Waddepally Tank Bund","Bhadrakali Bund","Vana Vigyan Kendra Mini Zoo","Amaravati Colony Park","Wow Warangal","Children's Park"};
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parksbuttn);
        context = this;

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.parks_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                  switch (position)
                  {
                      case 0:
                          startActivity(new Intent(context, kakatiyamgard.class));
                          break;
                      case 1:
                          startActivity(new Intent(context,ekashigraden.class));
                          break;
                      case 2:
                          startActivity(new Intent(context,pubicgarden.class));
                          break;
                      case 3:
                          startActivity(new Intent(context,wadepbund.class));
                          break;
                      case 4:
                          startActivity(new Intent(context,bhadrakibund.class));
                          break;
                      case 5:
                          startActivity(new Intent(context,vanavignan.class));
                          break;
                      case 6:
                          startActivity(new Intent(context,amarawathi.class));
                          break;
                      case 7:
                          startActivity(new Intent(context,wowwarangal.class));
                          break;
                      case 8:
                          startActivity(new Intent(context,chidparks.class));
                          break;



                  }
            }
        });
    }
}
