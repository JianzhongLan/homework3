package com.example.lanjianzhong.homework3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lanjianzhong.homework3.R;
import com.example.lanjianzhong.homework3.model.User;

import java.util.ArrayList;

/**
 * Created by lanjianzhong on 2018/4/5.
 */

public class UserAdapter extends ArrayAdapter{
    private int resoureId;
    private ArrayList<User> objects;
    private Context context;


    public UserAdapter(Context context, int resourceId, ArrayList<User> objects) {
        super(context, resourceId, objects);
        // TODO Auto-generated constructor stub
        this.objects=objects;
        this.context=context;

    }

    private static class ViewHolder
    {
        ImageView imageView;
        TextView name;
        TextView id;


    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return objects.size();
    }

    @Override
    public User getItem(int position) {
        // TODO Auto-generated method stub
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder viewHolder = null;
        if(convertView==null)
        {
            viewHolder=new ViewHolder();
            LayoutInflater mInflater=LayoutInflater.from(context);
            convertView = mInflater.inflate(R.layout.list_item, null);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.img_head);
            viewHolder.name = (TextView) convertView.findViewById(R.id.txt_name);
            viewHolder.id = (TextView) convertView.findViewById(R.id.txt_ID);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        User user = objects.get(position);
        if(null!=user)
        {
            viewHolder.imageView.setBackgroundResource(user.getPicture());
            viewHolder.name.setText(user.getmName());
            viewHolder.id.setText(user.getmId());
        }

        return convertView;
    }
}
