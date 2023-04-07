package com.erickwgc.spacegame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Explosion {
    Bitmap explosion[] = new Bitmap[17];
    int explosionFrame;
    int eX, eY;

    public Explosion(Context context, int eX, int eY) {
        explosion[0] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex0);
        explosion[1] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex1);
        explosion[2] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex2);
        explosion[3] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex3);
        explosion[4] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex4);
        explosion[5] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex5);
        explosion[6] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex6);
        explosion[7] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex7);
        explosion[8] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex8);
        explosion[9] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex9);
        explosion[10] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex10);
        explosion[11] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex11);
        explosion[12] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex12);
        explosion[13] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex13);
        explosion[14] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex14);
        explosion[15] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex15);
        explosion[16] = BitmapFactory.decodeResource(context.getResources(),R.drawable.ex16);
        explosionFrame = 0;
        this.eX = eX;
        this.eY = eY;
    }
    public Bitmap getExplosion(int explosionFrame){
        return explosion[explosionFrame];
    }
}
