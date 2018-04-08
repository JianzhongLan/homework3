package com.example.lanjianzhong.homework3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class SampleAdapterActivity extends AppCompatActivity {

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_adapter);
        intoListView();
    }
    //将数据加入ListView
    public void intoListView(){
        lv = (ListView) findViewById(R.id.listview);
        //定义一个动态数组
        ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();

        //在数组中存放数据

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("ItemImage", R.drawable.head1);//加入图片
        map.put("ItemName","兰建忠  ");
        map.put("ItemId", "15301121");
        listItem.add(map);

        HashMap<String, Object> map2 = new HashMap<String, Object>();
        map2.put("ItemImage", R.drawable.head2);//加入图片
        map2.put("ItemName","兰建忠2 ");
        map2.put("ItemId", "15301121");
        listItem.add(map2);

        HashMap<String, Object> map3 = new HashMap<String, Object>();
        map3.put("ItemImage", R.drawable.head3);//加入图片
        map3.put("ItemName","兰建忠3   ");
        map3.put("ItemId", "15301121");
        listItem.add(map3);


        SimpleAdapter mSimpleAdapter = new SimpleAdapter(this, listItem,//需要绑定的数据
                R.layout.list_item,//每一行的布局
                //动态数组中的数据源的键对应到定义布局的View中
                new String[]{"ItemImage", "ItemName", "ItemId"},
                new int[]{R.id.img_head, R.id.txt_name, R.id.txt_ID}
        );

        lv.setAdapter(mSimpleAdapter);//为ListView绑定适配器

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {//响应事件，响应用户点击listview中游记列表块

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Toast.makeText(SampleAdapterActivity.this, "你点击了第" + position + "行", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
