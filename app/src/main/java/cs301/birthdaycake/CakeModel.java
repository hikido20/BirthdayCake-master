package cs301.birthdaycake;

import android.graphics.RectF;

public class CakeModel {
    public boolean litCandle;
    public int numOfCandles;
    public boolean frosting;
    public boolean candles;
    private CakeModel CakeModel;
    private float xBalloon;
    private float yBalloon;
    private android.graphics.RectF rect;

    public CakeModel() {
        litCandle = true;
        numOfCandles = 2;
        frosting = true;
        candles = true;
        xBalloon = 0;
        yBalloon = 0;
        rect = new android.graphics.RectF(0,0,0,0);
    }
    //get method

    public boolean gelitCandle() {
        return litCandle;
    }

    public int getnumOfCandles() {
        return numOfCandles;
    }

    public boolean getFrosting() {
        return frosting;
    }

    public boolean getCandles() {
        return candles;
    }

    public float getxBalloon() { return xBalloon; }

    public  float getyBalloon() { return yBalloon; }

    public void setxBalloon(float x) { this.xBalloon = x; }

    public void setyBalloon(float y) { this.yBalloon = y; }

    public void setRect(float x, float y) {
        this.rect = new android.graphics.RectF(x - 50, y + 75, x + 50, y - 75);
    }

    public RectF getRect() {
        return rect;
    }
}
