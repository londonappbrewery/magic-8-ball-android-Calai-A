package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askbutton;
        askbutton = (Button) findViewById(R.id.ask_button);


        final TextView answer_display = (TextView) findViewById(R.id.answer);

        final int [] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final int [] answerArray = {
                R.string.answer1,
                R.string.answer2,
                R.string.answer3,
                R.string.answer4
        };

        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("8ball", "O botão foi pressionado!");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(3);

                answer_display.setText(answerArray[number]);
            }


        });





    }
}
