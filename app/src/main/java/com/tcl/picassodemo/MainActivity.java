package com.tcl.picassodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private ListView imageList = null;
    private ImageAdapter imageAdapter = null;

    public static String[] urlList = {
            "http://i.imgur.com/rFLNqWI.jpg",
            "http://i.imgur.com/C9pBVt7.jpg",
            "http://i.imgur.com/rT5vXE1.jpg",
            "http://i.imgur.com/aIy5R2k.jpg",
            "http://i.imgur.com/MoJs9pT.jpg",
            "http://i.imgur.com/S963yEM.jpg",
            "http://i.imgur.com/rLR2cyc.jpg",
            "http://i.imgur.com/SEPdUIx.jpg",
            "http://i.imgur.com/aC9OjaM.jpg",
            "http://i.imgur.com/76Jfv9b.jpg",
            "http://i.imgur.com/fUX7EIB.jpg",
            "http://i.imgur.com/syELajx.jpg",
            "http://i.imgur.com/COzBnru.jpg",
            "http://i.imgur.com/Z3QjilA.jpg",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageList = findViewById(R.id.imagelist);
        imageAdapter = new ImageAdapter(this, getImageInfosList());
        imageList.setAdapter(imageAdapter);
    }

    private List<ImageInfos> getImageInfosList() {
        TLog.i(TAG,"getImageInfosList()");
        List<ImageInfos> infosList = new ArrayList<ImageInfos>();
        for (String url : urlList) {
            ImageInfos imageInfos = new ImageInfos.Builder(url)
                    .setTitle(getResources().getString(R.string.image_title))
                    .setAuthor(getResources().getString(R.string.image_author))
                    .build();
            infosList.add(imageInfos);
        }
        return infosList;
    }
}
