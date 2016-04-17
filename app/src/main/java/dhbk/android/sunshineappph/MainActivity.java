package dhbk.android.sunshineappph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    public static final String LIFE_CYCLES = "Life cycles";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(R.id.container, new ForecastFragment()).commit();
        }
        Log.i(TAG, LIFE_CYCLES + " onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, LIFE_CYCLES + " onStart: ");
    }
}
