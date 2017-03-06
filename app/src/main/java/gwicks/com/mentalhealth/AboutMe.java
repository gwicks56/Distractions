package gwicks.com.mentalhealth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by gwicks on 4/03/2017.
 */

public class AboutMe extends AppCompatActivity {


    private static final String TAG = "AboutMe";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me);

        Log.d(TAG, "onCreate: testing");


    }



}
