package jmjp.appmaker.samplesongreading;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=(Button)findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayFile(v);
            }
        });

    }

    public void PlayFile(View v)
    {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/samplesongreading.appspot.com/o/Elumbuven%20-%20Giftson%20Durai%20%20Official%20Music%20Video%20(Tamil%20christian%20song%202018).mp3?alt=media&token=8c7035f6-32d9-4f1f-b0c9-f674adbef5bf");
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });
            mediaPlayer.prepareAsync();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
