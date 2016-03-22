package com.example.pushpika.canvas_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.os.Bundle;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Question_view extends AppCompatActivity {

    LinearLayout compulsary_words_field,optional_words_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_view);

        compulsary_words_field = (LinearLayout) findViewById(R.id.compulsary_words);
        optional_words_field = (LinearLayout) findViewById(R.id.optional_words);

        // create the layout params that will be used to define how your
        // button will be displayed
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

        //Create four
        for(int j=0;j<=1;j++)
        {
            // Create LinearLayout
            LinearLayout ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.HORIZONTAL);

            // Create Button
            final Button btn = new Button(this);
            final Button btn2 = new Button(this);
            final Button btn3 = new Button(this);

            // Give button an ID
            btn.setId(j + 1);
            btn2.setId(j + 10);
            btn3.setId(j + 20);
            btn.setText("isPrime()");
            btn2.setText("Swap");
            btn3.setText("isNumber()");
            // set the layoutParams on the button
            btn.setLayoutParams(params);
            btn2.setLayoutParams(params);
            btn3.setLayoutParams(params);
            //Add button to LinearLayout
            ll.addView(btn);
            ll.addView(btn2);
            ll.addView(btn3);
            //Add button to LinearLayout defined in XML
            compulsary_words_field.addView(ll);
        }

        //Create four
        for(int j=0;j<=2;j++)
        {
            // Create LinearLayout
            LinearLayout ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.HORIZONTAL);

            // Create Button
            final Button btn = new Button(this);
            final Button btn2 = new Button(this);

            // Give button an ID
            btn.setId(j + 1);
            btn2.setId(j + 10);
            btn.setText("If");
            btn2.setText("Else");
            // set the layoutParams on the button
            btn.setLayoutParams(params);
            btn2.setLayoutParams(params);

            //Add button to LinearLayout
            ll.addView(btn);
            ll.addView(btn2);
            //Add button to LinearLayout defined in XML
            optional_words_field.addView(ll);
        }
    }
}