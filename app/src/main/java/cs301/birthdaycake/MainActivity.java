package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView CakeView = findViewById(R.id.cakeview);
        CakeController controller = new CakeController(CakeView);
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(controller);
        CompoundButton comp = findViewById(R.id.switch3);
        comp.setOnCheckedChangeListener(controller);
        SeekBar seek = findViewById(R.id.seekBar);
        seek.setOnSeekBarChangeListener(controller);
    }

    public void Goodbye(View button) {
       Log.i("button","Goodbye");
    }
    public void blowOut(View button) {
        Log.i("button","Blow Out");
    }
}
