package gwicks.com.mentalhealth;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    GPSTracker gps;
    double latitude;
    double longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getActionBar().setTitle("Hello world App");

        Log.d(TAG, "onCreate: in on create");

        gps = new GPSTracker(this);
        latitude = gps.getLatitude();
        longitude = gps.getLongitude();

        //Toast.makeText(this, "WE HAVE GOT YOUR LOCATION: LATITUDE = " + latitude + "LONGITUDE = " + longitude, Toast.LENGTH_LONG).show();


        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Log.d(TAG, "onClick: Clicked ");

                Intent intent = new Intent(MainActivity.this, Distraction.class);
                startActivity(intent);



//                Intent intent = new Intent(Intent.ACTION_SEARCH);
//                intent.setPackage("com.google.android.youtube");
//                intent.putExtra("query", "Cute Cat");
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(intent);
            }
        });

        final Button resources = (Button) findViewById(R.id.resources);
        resources.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked 2");
                // Perform action on click

                Intent intent = new Intent(MainActivity.this, Resources.class);
                startActivity(intent);
            }
        });

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked 2");
                // Perform action on click

                Intent intent = new Intent(MainActivity.this, ArticlesActivity.class);
                startActivity(intent);
            }
        });





//        final Button button3 = (Button) findViewById(R.id.button3);
//        button3.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Log.d(TAG, "onClick: Clicked 3 - this should be Mapping!");
//                // Perform action on click
//
//                Intent myIntent = new Intent(MainActivity.this, MapsActivity.class);
//                myIntent.putExtra("key", value); //Optional parameters
//                MainActivity.this.startActivity(myIntent);
//            }
//        });


        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked 3 - this should be Mapping!");
                // Perform action on click

                Uri gmmIntentUri = Uri.parse("geo:0,0?q=psychiatrists");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });





        final Button button4 = (Button) findViewById(R.id.jobLinks);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked 4");

                Intent intent = new Intent(MainActivity.this, JobLinks.class);
                startActivity(intent);
                // Perform action on click
            }
        });

        final Button reminders = (Button) findViewById(R.id.reminders);
        reminders.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked 4");

                Uri calendarUri = CalendarContract.CONTENT_URI
                        .buildUpon()
                        .appendPath("time")
                        .build();
                startActivity(new Intent(Intent.ACTION_VIEW, calendarUri));


                // Perform action on click
            }
        });

        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked 5");
                // Perform action on click

                Intent intent = new Intent(MainActivity.this, EightBall.class);
                startActivity(intent);
            }
        });

        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked 6 ");

                //startActivity(new Intent(this, AboutMe.class));
                // Perform action on click

                Intent myIntent = new Intent(MainActivity.this, AboutMe.class);
               // myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);



            }
        });



    }
}
