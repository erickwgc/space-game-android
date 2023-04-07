package com.erickwgc.spacegame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Shot {
    Bitmap shot;
    Context context;
    int shx,shy;
    boolean isEnemy;
    public Shot(Context context, int shx, int shy,boolean isEnemy) {
        this.context = context;
        this.shx = shx;
        this.shy = shy;
        this.isEnemy = isEnemy;
        if (isEnemy){
            shot = BitmapFactory.decodeResource(context.getResources(),R.drawable.shot_enemy);
        }else {
            shot = BitmapFactory.decodeResource(context.getResources(),R.drawable.shot);
        }

    }
    public Bitmap getShot(){
        return shot;
    }
}
