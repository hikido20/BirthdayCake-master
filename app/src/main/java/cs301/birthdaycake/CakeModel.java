package cs301.birthdaycake;

public class CakeModel {
    public boolean litCandle;
    public int numOfCandles;
    public boolean frosting;
    public boolean candles;
    private CakeModel CakeModel;
    private String touchText;

    public CakeModel() {
        litCandle = true;
        numOfCandles = 2;
        frosting = true;
        candles = true;
        touchText = "t";
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

    public void setTouchText(String L){

        this.touchText = L;
    }

    public String getTouchText(){
        return touchText;    }
}

