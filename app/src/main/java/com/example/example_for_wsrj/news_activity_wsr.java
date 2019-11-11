package com.example.example_for_wsrj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class news_activity_wsr extends AppCompatActivity {


    public ArrayList<HashMap<String, Object>> myBooks;  //наш массив объектов, без него никак
    private static final String BOOKKEY = "bookname";    // Заголовок
    private static final String PRICEKEY = "bookprice";  // укороченный текст статьия
    private static final String PRICEKEYLONG = "bookpricelong";  // полный текст статьи
    private static final String IMGKEY = "bookimage";  //Наша будущая картинка
    String textlong;
    String text,title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_wsr);

        ListView listView = (ListView)findViewById(R.id.list);  //определяем наш ListView в main.xml
        myBooks = new ArrayList<HashMap<String,Object>>();      //создаем массив списков
        HashMap<String, Object> hm;

//-------Добовляем массив 1---------------------------------------------------------------------------

        //берем текст из values/string
        title = getString(R.string.title_text_1);
        textlong = getString(R.string.text_1);

        //проверяем длинну текста
        if (textlong.length() > 150)
        {
            text = textlong.substring(0,150);
        }else
        {
            text = textlong;
        }

        ///С помощью ключевого HashMap добавляем название (то что большими буквами), и описание (маленькими)
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, title);
        hm.put(PRICEKEY, text);
        hm.put(IMGKEY, R.drawable.one); //тут мы её добавляем для отображения
        hm.put(PRICEKEYLONG,textlong);
        myBooks.add(hm);

//-------Добовляем массив 2---------------------------------------------------------------------------
        //берем текст из values/string
        title = getString(R.string.title_text_2);
        textlong = getString(R.string.text_2);

        //проверяем длинну текста
        if (textlong.length() > 150)
        {
            text = textlong.substring(0,150);
        }else
        {
            text = textlong;
        }

        ///С помощью ключевого HashMap добавляем название (то что большими буквами), и описание (маленькими)
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, title);
        hm.put(PRICEKEY, text);
        hm.put(IMGKEY, R.drawable.two); //тут мы её добавляем для отображения
        hm.put(PRICEKEYLONG,textlong);
        myBooks.add(hm);

//-------Добовляем массив 3---------------------------------------------------------------------------
        //берем текст из values/string
        title = getString(R.string.title_text_3);
        textlong = getString(R.string.text_3);

        //проверяем длинну текста
        if (textlong.length() > 150)
        {
            text = textlong.substring(0,150);
        }else
        {
            text = textlong;
        }

        ///С помощью ключевого HashMap добавляем название (то что большими буквами), и описание (маленькими)
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, title);
        hm.put(PRICEKEY, text);
        hm.put(IMGKEY, R.drawable.tree); //тут мы её добавляем для отображения
        hm.put(PRICEKEYLONG,textlong);
        myBooks.add(hm);

//-------Добовляем массив 4---------------------------------------------------------------------------
        //берем текст из values/string
        title = getString(R.string.title_text_4);
        textlong = getString(R.string.text_4);

        //проверяем длинну текста
        if (textlong.length() > 150)
        {
            text = textlong.substring(0,150);
        }else
        {
            text = textlong;
        }

        ///С помощью ключевого HashMap добавляем название (то что большими буквами), и описание (маленькими)
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, title);
        hm.put(PRICEKEY, text);
        hm.put(IMGKEY, R.drawable.four); //тут мы её добавляем для отображения
        hm.put(PRICEKEYLONG,textlong);
        myBooks.add(hm);

//-------Добовляем массив 5---------------------------------------------------------------------------
        //берем текст из values/string
        title = getString(R.string.title_text_5);
        textlong = getString(R.string.text_5);

        //проверяем длинну текста
        if (textlong.length() > 150)
        {
            text = textlong.substring(0,150);
        }else
        {
            text = textlong;
        }

        ///С помощью ключевого HashMap добавляем название (то что большими буквами), и описание (маленькими)
        hm = new HashMap<String, Object>();
        hm.put(BOOKKEY, title);
        hm.put(PRICEKEY, text);
        hm.put(IMGKEY, R.drawable.five); //тут мы её добавляем для отображения
        hm.put(PRICEKEYLONG,textlong);
        myBooks.add(hm);


//---------------------------------------------------------------------------------------
        SimpleAdapter adapter = new SimpleAdapter(this,
                myBooks,
                R.layout.maket, new String[]{
                BOOKKEY,         //верхний текст
                PRICEKEY,        //нижний теккт
                IMGKEY          //наша картинка
        }, new int[]{
                R.id.text1, //ссылка на объект отображающий текст
                R.id.text2, //ссылка на объект отображающий текст
                R.id.img}); //добавили ссылку в чем отображать картинки из list.xml

        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            public void onItemClick(AdapterView<?> parent, View view,
                                                                    int position, long id) {
                                                Intent intent = new Intent(getBaseContext(),activity_news_detals.class);
                                                intent.putExtra("position",position);
                                                intent.putExtra("mybooks",myBooks);
                                                startActivity(intent);
                                            }

                                        }
        );



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
