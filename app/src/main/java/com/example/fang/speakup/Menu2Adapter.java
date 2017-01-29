package com.example.fang.speakup;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by yuen on 28.01.17.
 */

public class Menu2Adapter extends ArrayAdapter<RowItem> {

    Context context;

    public Menu2Adapter(Context context, int resourceId, //resourceId=your layout
                        List<RowItem> items) {
        super(context, resourceId, items);
        this.context = context;
    }

    /*private view holder class*/
    private class ViewHolder {
        ImageView imageView;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        RowItem rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.menu2, null);
            holder = new ViewHolder();
            holder.imageView = (ImageView) convertView.findViewById(R.id.menu2Images);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.imageView.setImageResource(rowItem.getImageId());

        return convertView;
    }
}