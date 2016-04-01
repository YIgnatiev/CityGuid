package info.androidhive.slidingmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoryActivity extends Activity {

    ListView listView;
    Intent intent;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        listView = (ListView) findViewById(R.id.listView);
        intent = getIntent();
        position = intent.getIntExtra("id_category", -1);
        switch (position){
            case 0:
                final String[] catnames = new String[] {
                        "Рыжик", "Барсик", "Мурзик", "Мурка", "Васька",
                        "Томасина", "Кристина", "Пушок", "Дымка", "Кузя",
                        "Китти", "Масяня", "Симба"
                };
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,	android.R.layout.simple_list_item_1, catnames);

                listView.setAdapter(adapter);
                break;
        }


    }
}
