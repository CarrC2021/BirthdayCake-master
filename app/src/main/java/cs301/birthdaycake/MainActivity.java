package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cakeView = findViewById(R.id.cakeview);
        CakeController controller = new CakeController(cakeView);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(controller);

        CompoundButton compound = findViewById(R.id.switch2);
        compound.setOnCheckedChangeListener(controller);

        SeekBar bar = findViewById(R.id.seekBar);
        bar.setOnSeekBarChangeListener(controller);
    }

    public void goodbye(View button) {
        Log.i("button", "Goobye");
    }


}
