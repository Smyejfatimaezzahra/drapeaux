package Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.myapplication.R;

import java.util.List;

import beans.Drapeau;

public class DrapeauAdapter extends BaseAdapter {
    private List<Drapeau> drapeaus;
    private LayoutInflater inflater;

    public DrapeauAdapter(Activity activity,List<Drapeau>drapeaus){
        this.drapeaus=drapeaus;
        inflater=(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return drapeaus.size();
    }

    @Override
    public Object getItem(int i) {
        return drapeaus.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i+1;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
       if(convertView==null)   convertView = inflater.inflate(R.layout.drapeau_item, null);

        TextView idf = convertView.findViewById(R.id.idd);
        TextView pays = convertView.findViewById(R.id.pays);
        TextView capitale = convertView.findViewById(R.id.capitale);
        ImageView photo = convertView.findViewById(R.id.image);
        idf.setText(drapeaus.get(i).getId()+"");
        pays.setText(drapeaus.get(i).getPays());
        capitale.setText(drapeaus.get(i).getCapitale()+"");
        photo.setImageResource(drapeaus.get(i).getImage());

       return convertView;
    }
}
