package forfun.good.a2018010802;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ArrayList<Map<String, Object>> mylist = new ArrayList();//改Object可以容納兩者
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listView);

        HashMap<String, Object> m1 = new HashMap<>();
        m1.put("city", "台北");
        m1.put("code", "02");
        m1.put("img", R.drawable.taipei);
        mylist.add(m1);
        HashMap<String, Object> m2 = new HashMap<>();
        m2.put("city", "台中");
        m2.put("code", "04");
        m2.put("img", R.drawable.taichung);
        mylist.add(m2);
        HashMap<String, Object> m3 = new HashMap<>();
        m3.put("city", "台南");
        m3.put("code", "05");
        m3.put("img", R.drawable.tainan);
        mylist.add(m3);
        HashMap<String, Object> m4 = new HashMap<>();
        m4.put("city", "高雄");
        m4.put("code", "07");
        m4.put("img", R.drawable.kao);
        mylist.add(m4);
        HashMap<String, Object> m5 = new HashMap<>();
        m5.put("city", "屏東");
        m5.put("code", "08");
        m5.put("img", R.drawable.pington);
        mylist.add(m5);

        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, mylist,
                R.layout.myui//可以放入自己的layout
                ,
                new String[]{"city", "code", "img"},//裡面的值
                new int[]{R.id.textView, R.id.textView2, R.id.imageView}//放自己的資料
        );
        lv.setAdapter(adapter);





    }
}

