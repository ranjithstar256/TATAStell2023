package com.example.tatastell;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b,b2; //dec

    EditText ed;
    String s;
    TextView vm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button12); //ini
        b2=findViewById(R.id.button13); //ini
        ed=findViewById(R.id.editTextTextPersonName3);
        vm=findViewById(R.id.textView);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab = new
                        AlertDialog.Builder(MainActivity.this);
                ab.setTitle("Note!").setMessage("Please be active in Class")
                        .setPositiveButton("Ok",null)
                        .setNegativeButton("no",null)
                        .setNeutralButton("nothing",null)
                        .setIcon(R.drawable.cap).show();
            }
        });


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s= ed.getText().toString();
                Toast.makeText(MainActivity.this,
                        "TATA is best and "+s, Toast.LENGTH_SHORT).show();
               vm.setText(s);

                Intent b = new Intent(
                        MainActivity.this,
                        MainActivity3.class);
                b.putExtra("hhghcdfh",s);
                startActivity(b);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.abc,menu);
        return super.onCreateOptionsMenu(menu);
    }
}