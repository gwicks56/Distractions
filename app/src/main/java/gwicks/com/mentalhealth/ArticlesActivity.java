package gwicks.com.mentalhealth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by gwicks on 4/03/2017.
 */

public class ArticlesActivity extends AppCompatActivity {


    private static final String TAG = "ArticlesActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.articles);

        Log.d(TAG, "onCreate: testing");




        Button button = (Button) findViewById(R.id.crazyCloset);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.d(TAG, "onClick: Clicked ");
                Intent intent = new Intent(ArticlesActivity.this, CrazyCloset.class);
                startActivity(intent);
            }
        });


        Button button2 = (Button) findViewById(R.id.socialSecurity);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.d(TAG, "onClick: Clicked ");
                Intent intent = new Intent(ArticlesActivity.this, SocialSecurity.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.notSoBad);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.d(TAG, "onClick: Clicked ");
                Intent intent = new Intent(ArticlesActivity.this, NotSoBad.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.medical);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.d(TAG, "onClick: Clicked ");
                Intent intent = new Intent(ArticlesActivity.this, Medical.class);
                startActivity(intent);
            }
        });


















    }




}
