package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17000719 on 24/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Colors> toDoList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Colors> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        toDoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI elements and bind them to their respective Java variable.
        TextView tvBlue = rowView.findViewById(R.id.textViewBlue);
        TextView tvOrange = rowView.findViewById(R.id.textViewOrange);
        TextView tvBrown = rowView.findViewById(R.id.textViewBrown);

        ImageView ivImpt = rowView.findViewById(R.id.imageViewImpt);

         //Obtain the property values from the Data Class object
         //and set them to the corresponding UI elements.
        Colors currentItem = toDoList.get(position);


        if (currentItem.isBlue()){
            ivImpt.setImageResource(R.drawable.blue_box);
        }  else if (currentItem.isOrange()) {
            ivImpt.setImageResource(R.drawable.orange_box);
        } else {
            ivImpt.setImageResource(R.drawable.brown_box);
        }

        // Return the View corresponding to the data at the specified position.
        return rowView;
    }
}
