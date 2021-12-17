package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String letter = "X";
    static Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    static Button reset;
    Button b_undo;
//    Task t1, t2, t3, t4, t5, t6, t7, t8, t9;
    static int clicked;
    TextView tv;
    Button button_undo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        Intent i = getIntent();
        getSupportActionBar().hide();

        reset = findViewById(R.id.reset);
        reset.setOnClickListener(v -> {
            b1.setText("");     b1.setClickable(true);
            b2.setText("");     b2.setClickable(true);
            b3.setText("");     b3.setClickable(true);
            b4.setText("");     b4.setClickable(true);
            b5.setText("");     b5.setClickable(true);
            b6.setText("");     b6.setClickable(true);
            b7.setText("");     b7.setClickable(true);
            b8.setText("");     b8.setClickable(true);
            b9.setText("");     b9.setClickable(true);
            clicked = 0;
            button_undo = null;

//            t1 = new Task(this);
//            t2 = new Task(this);
//            t3 = new Task(this);
//            t4 = new Task(this);
//            t5 = new Task(this);
//            t6 = new Task(this);
//            t7 = new Task(this);
//            t8 = new Task(this);
//            t9 = new Task(this);

            color_change(Task.bu1, "#D26AC5C5");
            color_change(Task.bu2, "#D26AC5C5");
            color_change(Task.bu3, "#D26AC5C5");
        });


        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b_undo = findViewById(R.id.b_undo);
        tv = findViewById(R.id.tv);

//        t1 = new Task(this);
//        t2 = new Task(this);
//        t3 = new Task(this);
//        t4 = new Task(this);
//        t5 = new Task(this);
//        t6 = new Task(this);
//        t7 = new Task(this);
//        t8 = new Task(this);
//        t9 = new Task(this);

        clicked = 0;

//        b1.setOnClickListener(view -> { b1.setText(letter);     letter = (letter=="X")?"O":"X";     b1.setClickable(false);});
//        b2.setOnClickListener(view -> { b2.setText(letter);     letter = (letter=="X")?"O":"X";     b2.setClickable(false);});
//        b3.setOnClickListener(view -> { b3.setText(letter);     letter = (letter=="X")?"O":"X";     b3.setClickable(false);});
//        b4.setOnClickListener(view -> { b4.setText(letter);     letter = (letter=="X")?"O":"X";     b4.setClickable(false);});
//        b5.setOnClickListener(view -> { b5.setText(letter);     letter = (letter=="X")?"O":"X";     b5.setClickable(false);});
//        b6.setOnClickListener(view -> { b6.setText(letter);     letter = (letter=="X")?"O":"X";     b6.setClickable(false);});
//        b7.setOnClickListener(view -> { b7.setText(letter);     letter = (letter=="X")?"O":"X";     b7.setClickable(false);});
//        b8.setOnClickListener(view -> { b8.setText(letter);     letter = (letter=="X")?"O":"X";     b8.setClickable(false);});
//        b9.setOnClickListener(view -> { b9.setText(letter);     letter = (letter=="X")?"O":"X";     b9.setClickable(false);});

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b_undo.setOnClickListener(this);

        b_undo.setOnClickListener(view -> {
            if(button_undo == null) {
                Toast.makeText(this, "No moves to undo", Toast.LENGTH_SHORT).show();
                return;
            }
            button_undo.setText("");
            button_undo.setClickable(true);
            button_undo = null;
            letter = (letter=="X")?"O":"X";
            tv.setText("Player  " + letter + "'s  turn");
        });
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.b1: b1.setText(letter);     letter = (letter=="X")?"O":"X";     b1.setClickable(false);
                new Task(MainActivity.this).execute(1);    clicked++;  break;
            case R.id.b2: b2.setText(letter);     letter = (letter=="X")?"O":"X";     b2.setClickable(false);
                new Task(MainActivity.this).execute(2);    clicked++;  break;
            case R.id.b3: b3.setText(letter);     letter = (letter=="X")?"O":"X";     b3.setClickable(false);
                new Task(MainActivity.this).execute(3);    clicked++;  break;
            case R.id.b4: b4.setText(letter);     letter = (letter=="X")?"O":"X";     b4.setClickable(false);
                new Task(MainActivity.this).execute(4);    clicked++;  break;
            case R.id.b5: b5.setText(letter);     letter = (letter=="X")?"O":"X";     b5.setClickable(false);
                new Task(MainActivity.this).execute(5);    clicked++;  break;
            case R.id.b6: b6.setText(letter);     letter = (letter=="X")?"O":"X";     b6.setClickable(false);
                new Task(MainActivity.this).execute(6);    clicked++;  break;
            case R.id.b7: b7.setText(letter);     letter = (letter=="X")?"O":"X";     b7.setClickable(false);
                new Task(MainActivity.this).execute(7);    clicked++;  break;
            case R.id.b8: b8.setText(letter);     letter = (letter=="X")?"O":"X";     b8.setClickable(false);
                new Task(MainActivity.this).execute(8);    clicked++;  break;
            case R.id.b9: b9.setText(letter);     letter = (letter=="X")?"O":"X";     b9.setClickable(false);
                new Task(MainActivity.this).execute(9);    clicked++;  break;

        }
        tv.setText("Player  " + letter + "'s  turn");
        button_undo = findViewById(v.getId());
    }

    protected static void color_change(int i, String color) {
        switch(i){
            case 1: b1.setBackgroundColor(Color.parseColor(color)); return;
            case 2: b2.setBackgroundColor(Color.parseColor(color)); return;
            case 3: b3.setBackgroundColor(Color.parseColor(color)); return;
            case 4: b4.setBackgroundColor(Color.parseColor(color)); return;
            case 5: b5.setBackgroundColor(Color.parseColor(color)); return;
            case 6: b6.setBackgroundColor(Color.parseColor(color)); return;
            case 7: b7.setBackgroundColor(Color.parseColor(color)); return;
            case 8: b8.setBackgroundColor(Color.parseColor(color)); return;
            case 9: b9.setBackgroundColor(Color.parseColor(color)); return;

        }
    }
}