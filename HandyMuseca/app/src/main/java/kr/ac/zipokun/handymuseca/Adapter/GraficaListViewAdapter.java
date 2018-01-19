package kr.ac.zipokun.handymuseca.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import kr.ac.zipokun.handymuseca.Item.GraficaListItem;
import kr.ac.zipokun.handymuseca.R;

/**
 * Created by Owner on 2018-01-19.
 */

public class GraficaListViewAdapter extends BaseAdapter{
    private ArrayList<GraficaListItem> listViewItemList = new ArrayList<GraficaListItem>();

    public GraficaListViewAdapter(){

    }

    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_graficalist, parent, false);
        }

        ImageView iconGrafica = (ImageView) convertView.findViewById(R.id.graficaListImage);
        ImageView iconUpgrade = (ImageView) convertView.findViewById(R.id.graficaListUp);
        ImageView iconCv = (ImageView) convertView.findViewById(R.id.graficaListCv);
        TextView nameOfGrafica = (TextView) convertView.findViewById(R.id.graficaListNameText);

        GraficaListItem listViewItem = listViewItemList.get(position);

        iconGrafica.setImageDrawable(listViewItem.getIconGrafica());
        iconUpgrade.setImageDrawable(listViewItem.getIconUpgrade());
        iconCv.setImageDrawable(listViewItem.getIconCv());
        nameOfGrafica.setText(listViewItem.getNameOfGrafica());

        return convertView;
    }

    public void addItem(GraficaListItem itme){
        listViewItemList.add(itme);
    }
}
