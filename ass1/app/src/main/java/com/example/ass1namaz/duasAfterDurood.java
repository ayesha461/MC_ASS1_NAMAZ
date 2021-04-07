package com.example.ass1namaz;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.SeekBar;

public class duasAfterDurood extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    SeekBar seekBar;
    Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duas_after_durood);
        mediaPlayer=MediaPlayer.create(this,R.raw.duasafterdurood);
        seekBar=findViewById(R.id.seekbar);
        seekBar.setMax(mediaPlayer.getDuration());
        //set seekbar by user
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //we have 2 event
                //1 a change wih play
                //2 change from user
                if(fromUser){
                    mediaPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void play(View view) {mediaPlayer.start();
    updateSeekbar updateSeekbar=new updateSeekbar();
    handler.post(updateSeekbar);
    }

    public void pause(View view) {mediaPlayer.pause();
    }
    protected void onPause()
    {
        super.onPause();
        mediaPlayer.release();
    }
    public class updateSeekbar implements Runnable{

        @Override
        public void run() {
            seekBar.setProgress(mediaPlayer.getCurrentPosition());
            handler.postDelayed(this,100);
        }
    }
}