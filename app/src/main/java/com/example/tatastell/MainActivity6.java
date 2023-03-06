package com.example.tatastell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity6 extends AppCompatActivity {
    Animation animation;
    ImageView i;
    MediaPlayer mp;
    ImageView b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        i = findViewById(R.id.imageView);
        b=findViewById(R.id.button6);
        animation = AnimationUtils.loadAnimation(this, R.anim.asdf);
        mp = MediaPlayer.create(this, R.raw.abc);

    }

    public void shn(View view) {

        i.startAnimation(animation);



    /*    NotificationManager notificationManager = (NotificationManager) MainActivity6.this.getSystemService(Context.NOTIFICATION_SERVICE);

        int notificationId = 1;
        String channelId = "channel-01";
        String channelName = "Channel Name";
        int importance = NotificationManager.IMPORTANCE_HIGH;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel mChannel = new NotificationChannel(
                    channelId, channelName, importance);
            notificationManager.createNotificationChannel(mChannel);
        }

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity6.this, channelId)
                .setLargeIcon(BitmapFactory.decodeResource(MainActivity6.this.getResources(),android.R.drawable.btn_plus))
                .setSmallIcon(android.R.drawable.btn_plus).setContentTitle("You can also 'Learn Android'")
                .setStyle(new NotificationCompat.BigPictureStyle().bigPicture( BitmapFactory.decodeResource(MainActivity6.this.getResources(),R.drawable.cap)))
                .setContentText("Contact AndroidManifester today!!");

        Intent intent = new Intent(MainActivity6.this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity6.this, 0, intent, PendingIntent.FLAG_MUTABLE);
        mBuilder.setContentIntent(pendingIntent);

        notificationManager.notify(notificationId, mBuilder.build());*/
    }


    public void ply(View view) {

        if (mp.isPlaying()){
            mp.pause();
           // b.setText("resume");
     ///       b.setBackgroundResource(android.R.drawable.ic_media_play);
            b.setImageResource(android.R.drawable.ic_media_play);
        } else {
            mp.start();
           // b.setText("pause");
            b.setImageResource(android.R.drawable.ic_media_pause);
        }
    }

  /*  public void pau(View view) {
        if (mp.isPlaying()){
            b.setText("pause");
        } else {
            b.setText("resume");

        }


        mp.pause();
    }
*/
    public void st(View view) {
        mp.stop();
        mp = MediaPlayer.create(this, R.raw.abc);

    }
}