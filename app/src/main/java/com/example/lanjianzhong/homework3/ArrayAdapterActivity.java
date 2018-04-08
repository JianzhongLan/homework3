package com.example.lanjianzhong.homework3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.lanjianzhong.homework3.adapter.UserAdapter;
import com.example.lanjianzhong.homework3.model.User;

import java.util.ArrayList;

public class ArrayAdapterActivity extends AppCompatActivity {

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter);
        intoListView();
    }
    public void intoListView(){

        lv = (ListView) findViewById(R.id.listview);

        ArrayList<User> list= new ArrayList<User>();
        User u = new User(R.drawable.head1,"兰建忠","15301121");
        list.add(u);
        User u2 = new User(R.drawable.head2,"兰建忠2","15301121");
        list.add(u2);
        User u3 = new User(R.drawable.head3,"兰建忠3","15301121");
        list.add(u3);

        UserAdapter adapter = new UserAdapter(ArrayAdapterActivity.this,0,list);
        lv.setAdapter(adapter);

    }
}
