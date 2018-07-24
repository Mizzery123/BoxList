package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<Colors> alColorList;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewColor);

        alColorList = new ArrayList<>();

        Colors item1 = new Colors(true,false,false);
        Colors item2 = new Colors(false,true,false);
        Colors item3 = new Colors(false,false,true);

        alColorList.add(item1);
        alColorList.add(item2);
        alColorList.add(item3);

        caToDo = new CustomAdapter(this, R.layout.color_item, alColorList);

        lvToDo.setAdapter(caToDo);
    }
}
