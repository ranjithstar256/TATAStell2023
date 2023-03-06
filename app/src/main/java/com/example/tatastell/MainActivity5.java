package com.example.tatastell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        e=findViewById(R.id.editTextTextPersonName2);
        ActivityCompat.requestPermissions(MainActivity5.this,
                new String[]{Manifest.permission.SEND_SMS},
                1);
    }

    public void xyz(View view) {
       /* SmsManager sm = SmsManager.getDefault();
        sm.sendTextMessage(e.getText().toString(),null,"hi",
                null,null);
        Toast.makeText(this, ""+e.getText().toString(),
                Toast.LENGTH_SHORT).show();*/



        Intent email = new Intent(Intent.ACTION_SEND);


        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"mailid@gmail.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, "mailsub");
        email.putExtra(Intent.EXTRA_TEXT, "mailmsg");

        //need this to prompts email client only
        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email, "Choose an Email client :"));

    }
}