package com.example.fang.speakup;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class Tab2bFragmentActFragment extends Fragment {
    Integer[] menuimages = {
            R.drawable.dive,
            R.drawable.practise,
            R.drawable.more};

    ListView lv;

    public Tab2bFragmentActFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab2b_fragment, container, false);
        lv = (ListView) v.findViewById(R.id.listview_menu2);
        List<RowItem> rowItems = new ArrayList<RowItem>();
        for (int i = 0; i < menuimages.length; i++) {
            RowItem item = new RowItem(menuimages[i]);
            rowItems.add(item);
        }

        ListView listView = (ListView) v.findViewById(R.id.listview_menu2);
        final Menu2Adapter iadapter = new Menu2Adapter(getActivity(),
                R.layout.menu2, rowItems);
        listView.setAdapter(iadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Context context = getActivity();
                RowItem cur_item = iadapter.getItem(position);

                //serializable is in many cases too slow, should change to use parceable (see http://stackoverflow.com/questions/2139134/how-to-send-an-object-from-one-android-activity-to-another-using-intents)
                if(position==1)
                {
                    Intent detailintent = new Intent(context, Exercise1Activity.class);//.putExtra(Intent.EXTRA_TEXT, cur_item);
                    startActivity(detailintent);
                }
                else
                {
                    Intent detailintent = new Intent(context, DiveInAct.class);
//                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9NhkrlcBdjw&rel=0")));
                    startActivity(detailintent);
                }
            }
        });

        return v;

    }
}
