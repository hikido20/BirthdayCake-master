package cs301.birthdaycake;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {

    private CakeView cakeView;
    private CakeModel CakeModel;

    public CakeController(CakeView view) {
        cakeView = view;
        CakeModel = cakeView.getCakeModel();
    }

    public void onClick(View CakeView){
        Log.d("button2", "Blowout 2");
        Log.d("button1", "Goodbye");
        CakeModel.litCandle = false;
        cakeView.invalidate();

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        CakeModel.candles = isChecked;
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        CakeModel.numOfCandles = progress;
        cakeView.invalidate();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        // do nothing on the event was a "down" touch
        if (event.getAction() != MotionEvent.ACTION_DOWN) return false;

        // get the x and y coordinates for the event
        float x = event.getX();
        float y = event.getY();

        // create the paint and use the given coordinates
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        android.graphics.RectF rectF = new android.graphics.RectF(x - 10, y + 15, x + 10, y - 15);

        cakeView.setRect(rectF);
        cakeView.setBalloon(paint);
        // for a "repaint" so that that the new token shows up
        cakeView.invalidate();

        // return true because we've handled the event
        return true;
    }
}
