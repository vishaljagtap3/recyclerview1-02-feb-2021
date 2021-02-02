package in.bitcode.recyclerview1;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterCities extends RecyclerView.Adapter<AdapterCities.CityViewHolder> {

    private ArrayList<String> mListCityNames;


    public class CityViewHolder extends RecyclerView.ViewHolder {

        public TextView mTxtCityName;

        public CityViewHolder(@NonNull View itemView) {
            super(itemView);
            mTxtCityName = (TextView) itemView;
        }
    }


    public AdapterCities(ArrayList<String> listCityNames) {
        this.mListCityNames = listCityNames;
    }

    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Log.e("tag", "onCreateViewHolder");

        TextView txtCityName = new TextView(parent.getContext());
        txtCityName.setTextSize(40);
        txtCityName.setPadding(20, 10, 10, 10);

        Random random = new Random();
        txtCityName.setBackgroundColor(
                Color.rgb(Math.abs(random.nextInt())%256,
                        Math.abs(random.nextInt())%256,
                        Math.abs(random.nextInt())%256
                )
        );

        return new CityViewHolder(txtCityName);
    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {

        Log.e("tag", "onBindViewHolder " + position);

        holder.mTxtCityName.setText(mListCityNames.get(position));

        holder.mTxtCityName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Selected: " + mListCityNames.get(position) + " " + position, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mListCityNames.size();
    }
}











