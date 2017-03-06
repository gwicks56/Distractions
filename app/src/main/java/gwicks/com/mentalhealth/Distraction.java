package gwicks.com.mentalhealth;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by gwicks on 5/03/2017.
 */

public class Distraction extends AppCompatActivity {

    private static final String TAG = "Distraction";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.distraction);

        Log.d(TAG, "onCreate: testing");




        Button button = (Button) findViewById(R.id.buttonCat);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.d(TAG, "onClick: Clicked ");
                Intent intent = new Intent(Intent.ACTION_SEARCH);
                intent.setPackage("com.google.android.youtube");
                intent.putExtra("query", "Cute Cat");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });



        Button button1 = (Button) findViewById(R.id.buttonDog);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.d(TAG, "onClick: Clicked ");
                Uri uriUrl = Uri.parse("http://imgur.com/search?q=cute+dog+");
                Intent lauchBrowswer = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(lauchBrowswer);
            }
        });

        Button button2 = (Button) findViewById(R.id.buttonMusic);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.d(TAG, "onClick: Clicked ");
                Intent intent = new Intent(Intent.ACTION_SEARCH);
                intent.setPackage("com.google.android.youtube");
                intent.putExtra("query", "The Beatles Music");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }



}
