package gwicks.com.mentalhealth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by gwicks on 5/03/2017.
 */

public class Resources extends AppCompatActivity {

    private static final String TAG = "Resources";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resources);

        Log.d(TAG, "onCreate: testing");


    }
}
