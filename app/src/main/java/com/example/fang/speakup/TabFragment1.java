package com.example.fang.speakup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fang.speakup.R;

import java.util.ArrayList;
import java.util.List;

public class TabFragment1 extends Fragment {
    Integer[] imagenames = {
            R.drawable.list1,
            R.drawable.list2,
            R.drawable.list3,
            R.drawable.list4,
            R.drawable.list5,
            R.drawable.list6};

    ListView lv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_fragment_1, container, false);
        lv = (ListView) v.findViewById(R.id.listview_inspire);

//        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Inspirational, android.R.layout.simple_list_item_1);
//        lv.setAdapter(adapter);

        List<RowItem> rowItems = new ArrayList<RowItem>();
        for (int i = 0; i < imagenames.length; i++) {
            RowItem item = new RowItem(imagenames[i]);
            rowItems.add(item);
        }

        ListView listView = (ListView) v.findViewById(R.id.listview_inspire);
        final InspireAdapter iadapter = new InspireAdapter(getActivity(),
                R.layout.inspire_adapter, rowItems);
        listView.setAdapter(iadapter);
        return v;
    }


}