package com.dna.stickchase.stickchase;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Alex on 4/5/2016.
 */
public class GamePanel extends SurfaceView implements SurfaceHolder.Callback {
    public GamePanel(Context context)
    {
        super(context);

        //add callback to surfaceholder to get events
        getHolder().addCallback(this);
    }
    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height){}

    @Override
    public void surfaceDestroyed(SurfaceHolder holder){}

    @Override
    public void surfaceCreated(SurfaceHolder holder){

    }
    @Override public boolean onTouchEvent(MotionEvent event)
    {
        return super.onTouchEvent(event);
    }
    public void update()
    {
        
    }
}