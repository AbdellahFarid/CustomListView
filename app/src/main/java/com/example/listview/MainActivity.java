package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Article> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(image_details, this));




    }

    private List<Article> getListData() {
        List<Article> list = new ArrayList<Article>();
        Article book = new Article("book", "Book", 20);
        Article phone = new Article("phone", "Phone", 1500);
        Article ticket = new Article("ticket", "Ticket", 150);
        list.add(book);
        list.add(phone);
        list.add(ticket);
        return list;
    }
}