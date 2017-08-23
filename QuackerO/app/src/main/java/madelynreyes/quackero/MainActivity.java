package madelynreyes.quackero;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.media.MediaPlayer;
import android.view.View.OnClickListener;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer Brycesound = MediaPlayer.create(this,R.raw.zach);
        ImageButton Bryce = (ImageButton)this.findViewById(R.id.bryce);
        Bryce.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Brycesound.isPlaying()){
                    Brycesound.pause();

                }
                else{
                    Brycesound.start();
                }

            }
        });

        final MediaPlayer Connorsound = MediaPlayer.create(this,R.raw.connor);
        ImageButton Connor = (ImageButton)this.findViewById(R.id.connor);
        Connor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Connorsound.isPlaying()){
                    Connorsound.pause();

                }
                else{
                    Connorsound.start();
                }

            }
        });



        final MediaPlayer Nathansound = MediaPlayer.create(this,R.raw.nathan);
        ImageButton Nathan = (ImageButton)this.findViewById(R.id.nathan);
        Nathan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Nathansound.isPlaying()){
                    Nathansound.pause();

                }
                else{
                    Nathansound.start();
                }

            }
        });
        final MediaPlayer Zachsound = MediaPlayer.create(this,R.raw.zach);
        ImageButton Zach = (ImageButton)this.findViewById(R.id.zach);
        Zach.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Zachsound.isPlaying()){
                    Zachsound.pause();

                }
                else{
                    Zachsound.start();
                }

            }
        });

        final MediaPlayer Madelynsound = MediaPlayer.create(this,R.raw.madelyn);
        ImageButton Madelyn = (ImageButton)this.findViewById(R.id.madelyn);
        Madelyn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Madelynsound.isPlaying()){
                    Madelynsound.pause();

                }
                else{
                    Madelynsound.start();
                }

            }
        });

        final MediaPlayer Kimsound = MediaPlayer.create(this,R.raw.kim);
        ImageButton Kim = (ImageButton)this.findViewById(R.id.kim);
        Kim.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Kimsound.isPlaying()){
                    Kimsound.pause();

                }
                else{
                    Kimsound.start();
                }

            }
        });
        final MediaPlayer Susannasound = MediaPlayer.create(this,R.raw.susanna);
        ImageButton Susanna = (ImageButton)this.findViewById(R.id.susanna);
        Susanna.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Susannasound.isPlaying()){
                    Susannasound.pause();

                }
                else{
                    Susannasound.start();
                }

            }
        });

        final MediaPlayer Averysound = MediaPlayer.create(this,R.raw.avery);
        ImageButton Avery = (ImageButton)this.findViewById(R.id.avery);
        Avery.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Averysound.isPlaying()){
                    Averysound.pause();

                }
                else{
                    Averysound.start();
                }

            }
        });

        final MediaPlayer Aidansound = MediaPlayer.create(this,R.raw.aidan);
        ImageButton Aidan = (ImageButton)this.findViewById(R.id.aidan);
        Aidan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Aidansound.isPlaying()){
                   Aidansound.pause();

                }
                else{
                    Aidansound.start();
                }

            }
        });
        final MediaPlayer Brisound = MediaPlayer.create(this,R.raw.bri);
        ImageButton Bri = (ImageButton)this.findViewById(R.id.bri);
        Bri.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Brisound.isPlaying()){
                    Brisound.pause();

                }
                else{
                    Brisound.start();
                }

            }
        });
        final MediaPlayer Elizabethsound = MediaPlayer.create(this,R.raw.elizabeth);
        ImageButton Elizabeth = (ImageButton)this.findViewById(R.id.elizabeth);
        Elizabeth.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Elizabethsound.isPlaying()){
                    Elizabethsound.pause();

                }
                else{
                    Elizabethsound.start();
                }

            }
        });








    }

}
