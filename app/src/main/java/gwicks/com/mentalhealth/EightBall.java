package gwicks.com.mentalhealth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by gwicks on 4/03/2017.
 */

public class EightBall extends AppCompatActivity {


    private static final String TAG = "EightBallextends";

    ImageButton eightBall;

    String string1 = "Just go with it but remove yourself from the delusion. Make up a story and call it fiction because that’s all these hallucinations are";
    String string2 = "Listen to music or imagine your favorite songs in your head. Remember your auditory cortex is more active so you can probably hear your favorite band on demand.\n";
    String string3 = "Watch TV but be careful what show you pick. Foreign language may make you more paranoid as well as science fiction or horror so pick your favorite comedy and laugh your worries away.\n";
    String string4 = "Take a walk in nature but avoid too crowded places like malls or airports where you think people may see or talk about you. Remember that most people are usually obsessed with their own day to day lives and don’t know what you know, think, or do.\n";
    String string5 = "Try meditation over medication. Let the thoughts just come to your mind but move through your mind and eventually leave focusing on breathing and just being in the moment not the past or future.\n";
    String string6 = "Take a chill pill whether it’s Xanax, Ativan, Valium, or Klonopin. Benzodiazepines can not only calm you down but lessen the underlying hallucinations that lead to delusions.\n";
    String string7 = "Smoke a cigarette or e-cigarette. I find it gets rid of closed eye visuals and calms my anxiety. 90% of schizophrenics self medicate with tobacco.\n";
    String string8 = "Avoid weed. Marijuana can make even the sanest people more paranoid than usual. It can also trigger auditory hallucinations and something you want to avoid if that bothers you.\n";
    String string9 = "Click on the Distract Me button in this app.\n";
    String string10 = "Read a book. The internet can be full of trolls which you may want to avoid on news stories and social media but books are your friend and also educate you.\n";
    String string11 = "Start a conversation with someone, anyone, that doesn’t focus on you. Even if you’re not immediately interested ask questions about their life to forget about your own.\n";
    String string12 = "Exercise. Medication can cause weight gain leading to diabetes, obesity, high blood sugar, and depression. Regular exercise even just walking combats all of that plus gives you more energy.\n";
    String string13 = "If you’re feeling pain try to locate the internal source that becomes external whether it’s a knife or broken bone and try to fight it by moving positions or imagining the source being disabled by mind or body. Just don’t fight anyone in real life. \n";
    String string14 = "Focus on what you’re paranoid about and reason why it isn’t true. For example, if you think everyone knows your passwords check your bank accounts regularly to confirm no one is stealing your money.\n";
    String string15 = "Take screenshots of your text on your computer if it keeps changing on you after proofreading or handwrite notes to yourself which can’t be altered without your notification.\n";
    String string16 = "Pet an animal. They usually calm you down and are considered emotional support animals. They don’t judge and usually don’t talk back to you. Touch can be incredibly healing.\n";
    String string17 = "Do those urgent household chores you’ve been avoiding. Cleaning your house makes your environment physically, emotionally, and mentally better. Remember your environment is something you can control.\n";
    String string18 = "Make sure you bathe and wash your clothes. Remember that they can hospitalize you for 72 hours for being gravely disabled not just if you’re a danger to yourself or others. If you smell nicer, people will be nicer to you including doctors and nurses.\n";
    String string19 = "Do a hobby or play an instrument. It helps to hyperfocus on an engaging activity even when you’re not diagnosed ADHD. \n";
    String string20 = "Tell somebody. It’s the ultimate excuse. I can’t go out because I’m feeling too paranoid.\n";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eight_ball);

        Toast.makeText(getApplicationContext(), "Click on the Magic Eight Ball", Toast.LENGTH_LONG).show();


        //int i1 = r.nextInt(max - min + 1) + min;

        eightBall =(ImageButton)findViewById(R.id.eightBall);
        eightBall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random r = new Random();
                int i1 = r.nextInt(19);

                String stringRandom = "";

                switch (i1){

                    case 0:
                        Toast.makeText(getApplicationContext(), string1, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string1, Toast.LENGTH_LONG).show();

                        break;

                    case 1:
                        Toast.makeText(getApplicationContext(), string2, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string2, Toast.LENGTH_LONG).show();

                        break;

                    case 2:
                        Toast.makeText(getApplicationContext(), string3, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string3, Toast.LENGTH_LONG).show();

                        break;

                    case 3:
                        Toast.makeText(getApplicationContext(), string4, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string4, Toast.LENGTH_LONG).show();

                        break;

                    case 4:
                        Toast.makeText(getApplicationContext(), string5, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string5, Toast.LENGTH_LONG).show();

                        break;

                    case 5:
                        Toast.makeText(getApplicationContext(), string6, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string6, Toast.LENGTH_LONG).show();

                        break;

                    case 6:
                        Toast.makeText(getApplicationContext(), string7, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string7, Toast.LENGTH_LONG).show();

                        break;

                    case 7:
                        Toast.makeText(getApplicationContext(), string8, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string8, Toast.LENGTH_LONG).show();

                        break;

                    case 8:
                        Toast.makeText(getApplicationContext(), string9, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string9, Toast.LENGTH_LONG).show();

                        break;

                    case 9:
                        Toast.makeText(getApplicationContext(), string10, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string10, Toast.LENGTH_LONG).show();

                        break;

                    case 10:
                        Toast.makeText(getApplicationContext(), string11, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string11, Toast.LENGTH_LONG).show();

                        break;

                    case 11:
                        Toast.makeText(getApplicationContext(), string12, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string12, Toast.LENGTH_LONG).show();

                        break;

                    case 12:
                        Toast.makeText(getApplicationContext(), string13, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string13, Toast.LENGTH_LONG).show();

                        break;

                    case 13:
                        Toast.makeText(getApplicationContext(), string14, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string14, Toast.LENGTH_LONG).show();

                        break;

                    case 14:
                        Toast.makeText(getApplicationContext(), string15, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string15, Toast.LENGTH_LONG).show();

                        break;

                    case 15:
                        Toast.makeText(getApplicationContext(), string16, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string16, Toast.LENGTH_LONG).show();

                        break;

                    case 16:
                        Toast.makeText(getApplicationContext(), string17, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string17, Toast.LENGTH_LONG).show();

                        break;

                    case 17:
                        Toast.makeText(getApplicationContext(), string18, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string18, Toast.LENGTH_LONG).show();

                        break;

                    case 18:
                        Toast.makeText(getApplicationContext(), string19, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string19, Toast.LENGTH_LONG).show();

                        break;

                    case 19:
                        Toast.makeText(getApplicationContext(), string20, Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), string20, Toast.LENGTH_LONG).show();

                        break;




                }





            }


        });

    }
}
