package com.example.fang.speakup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TabFragment2b extends Fragment {
    Integer[] menuimages = {
            R.drawable.movement,
            R.drawable.mind,
            R.drawable.message};

    ListView lv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_fragment_2, container, false);
        lv = (ListView) v.findViewById(R.id.listview_menu);
        List<RowItem> rowItems = new ArrayList<RowItem>();
        for (int i = 0; i < menuimages.length; i++) {
            RowItem item = new RowItem(menuimages[i]);
            rowItems.add(item);
        }

        ListView listView = (ListView) v.findViewById(R.id.listview_menu);
        final Menu2Adapter iadapter = new Menu2Adapter(getActivity(),
                R.layout.menu2, rowItems);
        listView.setAdapter(iadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Context context = getActivity();
                RowItem cur_item = iadapter.getItem(position);

                //serializable is in many cases too slow, should change to use parceable (see http://stackoverflow.com/questions/2139134/how-to-send-an-object-from-one-android-activity-to-another-using-intents)
                Intent detailintent = new Intent(context, Exercise1Activity.class);//.putExtra(Intent.EXTRA_TEXT, cur_item);
                startActivity(detailintent);
            }
        });

        return v;

    }
}