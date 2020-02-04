package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeView cakeView;
    private CakeModel CakeModel;

    public CakeController(CakeView view){
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
}
