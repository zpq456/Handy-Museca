package kr.ac.zipokun.handymuseca;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import kr.ac.zipokun.handymuseca.Adapter.GraficaListViewAdapter;
import kr.ac.zipokun.handymuseca.Item.GraficaListItem;


/**
 * A simple {@link Fragment} subclass.
 */
public class GraficaFragment extends Fragment
    implements MainActivity.onKeyBackPressedListener{
    private static GraficaFragment uniqueInstance;
    private MainActivity main;

    private ListView listView;
    private GraficaListViewAdapter adapter;

    GraficaFragment() {}

    public static synchronized GraficaFragment getInstance() {
        if(uniqueInstance == null){uniqueInstance = new GraficaFragment();}
        return uniqueInstance;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main = ((MainActivity) getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_grafica, container, false);

        adapter = new GraficaListViewAdapter();
        listView = (ListView)v.findViewById(R.id.graficaCustomListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                GraficaListItem item = (GraficaListItem) parent.getItemAtPosition(position);
                Toast.makeText(v.getContext(),item.getNameOfGrafica(),Toast.LENGTH_LONG).show();
            }
        });

        GraficaListItem item = new GraficaListItem();
        item.setIconGrafica(ContextCompat.getDrawable(v.getContext(),R.mipmap.ic_launcher));
        item.setIconUpgrade(ContextCompat.getDrawable(v.getContext(),R.mipmap.ic_launcher));
        item.setIconCv(ContextCompat.getDrawable(v.getContext(),R.mipmap.ic_launcher));
        item.setNameOfGrafica("그라피카 이름 이름 이름");
        adapter.addItem(item);
        adapter.addItem(item);
        adapter.addItem(item);
        adapter.addItem(item);
        adapter.addItem(item);
        adapter.addItem(item);
        adapter.addItem(item);

        return v;
    }

    //백키 관련 코드
    @Override
    public void onBack() {//프래그먼트의 백키
        MainActivity activity = (MainActivity) getActivity();
        activity.setOnKeyBackPressedListener(null);
        activity.changeFragment("mainFragment");
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        ((MainActivity) context).setOnKeyBackPressedListener(this);
    }

}
