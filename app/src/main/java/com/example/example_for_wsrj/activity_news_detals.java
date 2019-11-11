package com.example.example_for_wsrj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class activity_news_detals extends AppCompatActivity {
    private ArrayList<HashMap<String, Object>> myBooks;
    private ArrayList<HashMap<String, Object>> IndexmyBooks;
    private static final String BOOKKEY = "bookname";
    private static final String PRICEKEYLONG = "bookpricelong";
    private static final String IMGKEY = "bookimage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detals);
        ListView list = (ListView) findViewById(R.id.list);
        ImageView img = (ImageView) findViewById(R.id.img);

        Intent intent = getIntent();
        int key = (int)intent.getSerializableExtra("position");
        myBooks = (ArrayList<HashMap<String, Object>>)intent.getSerializableExtra("mybooks");
        IndexmyBooks = new ArrayList<HashMap<String,Object>>();
        IndexmyBooks.add(myBooks.get(key));

        if (myBooks != null){
            SimpleAdapter adapter = new SimpleAdapter(this,
                    IndexmyBooks,
                    R.layout.maket, new String[]{
                    BOOKKEY,         //верхний текст
                    PRICEKEYLONG,        //нижний теккт
                    IMGKEY,          //наша картинка
                    ""
            }, new int[]{
                    R.id.text1, //ссылка на объект отображающий текст
                    R.id.text2, //ссылка на объект отображающий текст
                    R.id.img,
                    R.id.letter}); //добавили ссылку в чем отображать картинки из list.xml

            list.setAdapter(adapter);
            list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.prof_activity:
                Intent proff_activity = new Intent(".profil_activity_wsrj");
                startActivity(proff_activity);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
