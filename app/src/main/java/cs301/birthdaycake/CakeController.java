package cs301.birthdaycake;

//this class will be controlling the operations on the cak and will determine what will appear in the cakeView

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView view){
        cakeView = view;
        cakeModel = cakeView.getCakeModel();
    }

    public void onClick(CakeView view){
        android.util.Log.d("CakeController", "been clicked");
    }

    public void onClick(View v) {
        Log.d("Blow Out", "button got clicked");
        cakeModel.candlesLit = false;
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Log.d("Has Candles", "onCheckedChanged");
        cakeModel.hasCandles = isChecked;
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Log.d("seekbar", " new numCandles");
        cakeModel.numCandles = progress;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
