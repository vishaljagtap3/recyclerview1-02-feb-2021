package in.bitcode.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerCities;
    private ArrayList<String> mListCityNames;
    private AdapterCities mAdapterCities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        mRecyclerCities = findViewById(R.id.recyclerCities);
        {
            mListCityNames = new ArrayList<String>();
            mListCityNames.add("Pune");
            mListCityNames.add("Mumbai");
            mListCityNames.add("Delhi");
            mListCityNames.add("Chennai");
            mListCityNames.add("Pune");
            mListCityNames.add("Mumbai");
            mListCityNames.add("Delhi");
            mListCityNames.add("Chennai");
            mListCityNames.add("Pune");
            mListCityNames.add("Mumbai");
            mListCityNames.add("Delhi");
            mListCityNames.add("Chennai");
            mListCityNames.add("Pune");
            mListCityNames.add("Mumbai");
            mListCityNames.add("Delhi");
            mListCityNames.add("Chennai");
            mListCityNames.add("Pune");
            mListCityNames.add("Mumbai");
            mListCityNames.add("Delhi");
            mListCityNames.add("Chennai");
            mListCityNames.add("Pune");
            mListCityNames.add("Mumbai");
            mListCityNames.add("Delhi");
            mListCityNames.add("Chennai");
            mListCityNames.add("Pune");
            mListCityNames.add("Mumbai");
            mListCityNames.add("Delhi");
            mListCityNames.add("Chennai");
            mListCityNames.add("Pune");
            mListCityNames.add("Mumbai");
            mListCityNames.add("Delhi");
            mListCityNames.add("Chennai");
            mListCityNames.add("Pune");
            mListCityNames.add("Mumbai");
            mListCityNames.add("Delhi");
            mListCityNames.add("Chennai");
            mListCityNames.add("Pune");
            mListCityNames.add("Mumbai");
            mListCityNames.add("Delhi");
            mListCityNames.add("Chennai");
            mListCityNames.add("Pune");
            mListCityNames.add("Mumbai");
            mListCityNames.add("Delhi");
            mListCityNames.add("Chennai");
        }

        /*
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerCities.setLayoutManager(linearLayoutManager);
        */

        /*GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        mRecyclerCities.setLayoutManager(gridLayoutManager);*/

        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerCities.setLayoutManager(staggeredGridLayoutManager);


        mAdapterCities = new AdapterCities(mListCityNames);
        mRecyclerCities.setAdapter(mAdapterCities);



    }
}