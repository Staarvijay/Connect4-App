package com.example.connect4game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<totalRow> extends AppCompatActivity {
//    ImageView counter2 = (ImageView) findViewById(R.id.imageView2);
//    ImageView counter3 = (ImageView) findViewById(R.id.imageView3);
//    ImageView counter4 = (ImageView) findViewById(R.id.imageView4);
//    ImageView counter5 = (ImageView) findViewById(R.id.imageView5);
//    ImageView counter6 = (ImageView) findViewById(R.id.imageView6);
//    ImageView counter7 = (ImageView) findViewById(R.id.imageView7);
//    ImageView counter8 = (ImageView) findViewById(R.id.imageView8);
//    ImageView counter9 = (ImageView) findViewById(R.id.imageView9);
//    ImageView counter10 = (ImageView) findViewById(R.id.imageView10);
//    ImageView counter11 = (ImageView) findViewById(R.id.imageView11);
//    ImageView counter12 = (ImageView) findViewById(R.id.imageView12);
//    ImageView counter13 = (ImageView) findViewById(R.id.imageView13);
//    ImageView counter14 = (ImageView) findViewById(R.id.imageView14);
//    ImageView counter15 = (ImageView) findViewById(R.id.imageView15);
//    ImageView counter16 = (ImageView) findViewById(R.id.imageView16);
//    ImageView counter17 = (ImageView) findViewById(R.id.imageView17);
//    ImageView counter18 = (ImageView) findViewById(R.id.imageView18);
//    ImageView counter19 = (ImageView) findViewById(R.id.imageView19);
//    ImageView counter20 = (ImageView) findViewById(R.id.imageView20);
//    ImageView counter21 = (ImageView) findViewById(R.id.imageView21);
//    ImageView counter22 = (ImageView) findViewById(R.id.imageView22);
//    ImageView counter23 = (ImageView) findViewById(R.id.imageView23);
//    ImageView counter24 = (ImageView) findViewById(R.id.imageView24);
//    ImageView counter25 = (ImageView) findViewById(R.id.imageView25);
//    ImageView counter26 = (ImageView) findViewById(R.id.imageView26);
//    ImageView counter27 = (ImageView) findViewById(R.id.imageView27);
//    ImageView counter28 = (ImageView) findViewById(R.id.imageView28);
//    ImageView counter29 = (ImageView) findViewById(R.id.imageView29);
//    ImageView counter30 = (ImageView) findViewById(R.id.imageView30);
//    ImageView counter31 = (ImageView) findViewById(R.id.imageView31);
//    ImageView counter32 = (ImageView) findViewById(R.id.imageView32);
//    ImageView counter33 = (ImageView) findViewById(R.id.imageView33);
//    ImageView counter34 = (ImageView) findViewById(R.id.imageView34);
//    ImageView counter35 = (ImageView) findViewById(R.id.imageView35);
//    ImageView counter36 = (ImageView) findViewById(R.id.imageView36);
//    ImageView counter37 = (ImageView) findViewById(R.id.imageView37);
//    ImageView counter38 = (ImageView) findViewById(R.id.imageView38);
//    ImageView counter39 = (ImageView) findViewById(R.id.imageView39);
//    ImageView counter40 = (ImageView) findViewById(R.id.imageView40);
//    ImageView counter41 = (ImageView) findViewById(R.id.imageView41);
//    ImageView counter42 = (ImageView) findViewById(R.id.imageView42);
//    ImageView counter43 = (ImageView) findViewById(R.id.imageView43);
    int coinColor = 0; //0: yellow , 1: Red
    int instantImageViewNo = 0; //helps to check we are on which imageview so that we can easily undo it using that image view no.
    int undoCount = 0; //to remove bug while changing the color of coin when it is pressed more than once
    int connectNo = 1; //to count how many same colour coins are there in that row to show it is connected to 4 or not.

    public void dropIn1(View view){
        for (int i = 37; i >= 2; ) {
            int id = getResources().getIdentifier("imageView"+i, "id", getPackageName());
            ImageView counter = (ImageView) findViewById(id);
            if (counter.getDrawable() == null) {
                counter.setTranslationY(-1500);
                if(coinColor == 0) {
                    counter.setImageResource(R.drawable.yellow);
                    instantImageViewNo = i;
                    coinColor++;
                    undoCount = 0;
                }
                else{
                    counter.setImageResource(R.drawable.red);
                    instantImageViewNo = i;
                    coinColor--;
                    undoCount = 0;
                }
                counter.animate().translationYBy(1500).rotation(3600).setDuration(1000);
                break;
            }else{
                i -= 7;
                continue;
            }
        }
    }

    public void dropIn2(View view){
        for (int i = 38; i >= 3; ) {
            int id = getResources().getIdentifier("imageView"+i, "id", getPackageName());
            ImageView counter = (ImageView) findViewById(id);
            if (counter.getDrawable() == null) {
                counter.setTranslationY(-1500);
                if(coinColor == 0) {
                    counter.setImageResource(R.drawable.yellow);
                    instantImageViewNo = i;
                    coinColor++;
                    undoCount = 0;

                }
                else{
                    counter.setImageResource(R.drawable.red);
                    instantImageViewNo = i;
                    coinColor--;
                    undoCount = 0;

                }
                counter.animate().translationYBy(1500).rotation(3600).setDuration(1000);
                break;
            }else{
                i -= 7;
                continue;
            }
        }
    }
    public void dropIn3(View view){
        for (int i = 39; i >= 4; ) {
            int id = getResources().getIdentifier("imageView"+i, "id", getPackageName());
            ImageView counter = (ImageView) findViewById(id);
            if (counter.getDrawable() == null) {
                counter.setTranslationY(-1500);
                if(coinColor == 0) {
                    counter.setImageResource(R.drawable.yellow);
                    instantImageViewNo = i;
                    coinColor++;
                    undoCount = 0;
                }
                else{
                    counter.setImageResource(R.drawable.red);
                    instantImageViewNo = i;
                    coinColor--;
                    undoCount = 0;
                }
                counter.animate().translationYBy(1500).rotation(3600).setDuration(1000);
                break;
            }else{
                i -= 7;
                continue;
            }
        }
    }
    public void dropIn4(View view){
        for (int i = 40; i >= 5; ) {
            int id = getResources().getIdentifier("imageView"+i, "id", getPackageName());
            ImageView counter = (ImageView) findViewById(id);
            if (counter.getDrawable() == null) {
                counter.setTranslationY(-1500);
                if(coinColor == 0) {
                    counter.setImageResource(R.drawable.yellow);
                    instantImageViewNo = i;
                    coinColor++;
                    undoCount = 0;
                }
                else{
                    counter.setImageResource(R.drawable.red);
                    instantImageViewNo = i;
                    coinColor--;
                    undoCount = 0;
                }
                counter.animate().translationYBy(1500).rotation(3600).setDuration(1000);
                break;
            }else{
                i -= 7;
                continue;
            }
        }
    }
    public void dropIn5(View view){
        for (int i = 41; i >= 6; ) {
            int id = getResources().getIdentifier("imageView"+i, "id", getPackageName());
            ImageView counter = (ImageView) findViewById(id);
            if (counter.getDrawable() == null) {
                counter.setTranslationY(-1500);
                if(coinColor == 0) {
                    counter.setImageResource(R.drawable.yellow);
                    instantImageViewNo = i;
                    coinColor++;
                    undoCount = 0;
                }
                else{
                    counter.setImageResource(R.drawable.red);
                    instantImageViewNo = i;
                    coinColor--;
                    undoCount = 0;
                }
                counter.animate().translationYBy(1500).rotation(3600).setDuration(1000);
                break;
            }else{
                i -= 7;
                continue;
            }
        }
    }
    public void dropIn6(View view){
        for (int i = 42; i >= 7; ) {
            int id = getResources().getIdentifier("imageView"+i, "id", getPackageName());
            ImageView counter = (ImageView) findViewById(id);
            if (counter.getDrawable() == null) {
                counter.setTranslationY(-1500);
                if(coinColor == 0) {
                    counter.setImageResource(R.drawable.yellow);
                    instantImageViewNo = i;
                    coinColor++;
                    undoCount = 0;
                }
                else{
                    counter.setImageResource(R.drawable.red);
                    instantImageViewNo = i;
                    coinColor--;
                    undoCount = 0;
                }
                counter.animate().translationYBy(1500).rotation(3600).setDuration(1000);
                break;
            }else{
                i -= 7;
                continue;
            }
        }
    }
    public void dropIn7(View view){
        for (int i = 43; i >= 8; ) {
            int id = getResources().getIdentifier("imageView"+i, "id", getPackageName());
            ImageView counter = (ImageView) findViewById(id);
            if (counter.getDrawable() == null) {
                counter.setTranslationY(-1500);
                if(coinColor == 0) {
                    counter.setImageResource(R.drawable.yellow);
                    instantImageViewNo = i;
                    coinColor++;
                    undoCount = 0;
//                    Log.i("ID",Integer.toString(id));
                }
                else{
                    counter.setImageResource(R.drawable.red);
                    instantImageViewNo = i;
                    coinColor--;
                    undoCount = 0;
//                    Log.i("ID",Integer.toString(id));
                }
                counter.animate().translationYBy(1500).rotation(3600).setDuration(1000);
                break;
            }else{
                i -= 7;
                continue;
            }
        }
    }
    public void undo(View view){
        if(instantImageViewNo != 0){
            int id = getResources().getIdentifier("imageView" + instantImageViewNo, "id", getPackageName());
            ImageView counter = (ImageView) findViewById(id);
//            counter.animate().translationYBy(-1500).rotation(3600).setDuration(1000);
            counter.setImageDrawable(null);
            if(undoCount == 0){
                if (coinColor == 0) {
                    coinColor++;
                    undoCount = 1;
                } else {
                    coinColor--;
                    undoCount = 1;
                }
            }
        }
    }
    public void playAgain(View view){
        for(int i=2;i<=43;i++){
            int id = getResources().getIdentifier("imageView"+i, "id", getPackageName());
            ImageView counter = (ImageView) findViewById(id);
            if (counter.getDrawable() == null){
                continue;
            }
            else {

                counter.animate().translationYBy(-1500).rotation(3600).setDuration(1000);
                counter.setTranslationY(1500);
                counter.setImageDrawable(null);
            }
        }
        coinColor = 0;
        instantImageViewNo = 0;
        undoCount = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
