package com.example.tatastell;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitExpl extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_expl);
        tv = findViewById(R.id.textView6);
    }

    public void getdat(View view) {
        Call<List<ObjDataClas>> call = RetrofitClentClas.getInstance().getMyApi().getHeroes();

        call.enqueue(new Callback<List<ObjDataClas>>() {
            @Override
            public void onResponse(Call<List<ObjDataClas>> call, Response<List<ObjDataClas>> response) {
                List<ObjDataClas> heroList = response.body();

                // Log.i(TAG, "onResponse: "+response.body().toString());

                //Creating an String array for the ListView
                String[] heroes = new String[heroList.size()];
                StringBuffer b = new StringBuffer();

                //looping through all the heroes and inserting the names inside the string array
                for (int i = 0; i < heroList.size(); i++) {
                b.append(heroList.get(i).getName()+"\n");
                  }
                tv.setText(b.toString());

                //displaying the string array into listview
                //listView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, heroes));
            }

            @Override
            public void onFailure(Call<List<ObjDataClas>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
