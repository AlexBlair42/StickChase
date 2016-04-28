package com.dna.stickchase.stickchase;


import android.graphics.Bitmap;
import android.graphics.Canvas;


public class Player extends GameObject {
    private Bitmap spritesheet;
    private int score;
    private double dya;
    private boolean up;
    private boolean playing;
    private Animation animation = new Animation();
    private long startTime;


    public Player(Bitmap res, int w, int h, int numFrames)
    {
        x = 200;
        y = GamePanel.HEIGHT-600;
        dy = 0;
        score = 0;
        height = h;
        width = w;


        Bitmap[] image = new Bitmap[numFrames];
        spritesheet = res;

        for (int i = 0; i < image.length; i++)
        {
            image[i]=Bitmap.createBitmap(spritesheet, i*width, 0, width, height);
        }

        animation.setFrames(image);
        animation.setDelay(60);
        startTime = System.nanoTime();

    }
    public void setUp(boolean b){up = b;}

    public void update()
    {

        long elapsed = (System.nanoTime()- startTime)/1000000;
        if(elapsed>100)
        {
                score++;
                startTime = System.nanoTime();
        }
        animation.update();

        if(up){
            dy += (int)(dya-=300);
        }

       if(dy>20)dy=25;
        if(dy<-20)dy = -25;


            y += dy;
            dy = 0;
            dy += 20;



       /* if(y <= GamePanel.HEIGHT-600) {
            y+=dy;
            dy+=20;
            dy++;


        }



     /*  if(dy)
        {
            y=dy;
            dy=0;
        }
*/


    }
    public void draw(Canvas canvas)
    {
        canvas.drawBitmap(animation.getImage(),x,y,null);
    }
    public int getScore(){return score;}
    public boolean getPlaying(){return playing;}
    public void setPlaying(boolean b){playing = b;}
    public void resetDYA(){dya = 0;}
    public void resetScore(){score = 0;}



}
