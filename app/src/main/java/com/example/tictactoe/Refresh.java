package com.example.tictactoe;

import android.os.AsyncTask;
import android.widget.Button;

public class Refresh extends AsyncTask<Void, Void, Void> {

    static Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    static {
        b1 = MainActivity.b1;
        b2 = MainActivity.b2;
        b3 = MainActivity.b3;
        b4 = MainActivity.b4;
        b5 = MainActivity.b5;
        b6 = MainActivity.b6;
        b7 = MainActivity.b7;
        b8 = MainActivity.b8;
        b9 = MainActivity.b9;

//        builder = new AlertDialog.Builder();
    }
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
//        b1.setText("");     b1.setClickable(true);
//        b2.setText("");     b2.setClickable(true);
//        b3.setText("");     b3.setClickable(true);
//        b4.setText("");     b4.setClickable(true);
//        b5.setText("");     b5.setClickable(true);
//        b6.setText("");     b6.setClickable(true);
//        b7.setText("");     b7.setClickable(true);
//        b8.setText("");     b8.setClickable(true);
//        b9.setText("");     b9.setClickable(true);

        MainActivity.reset.callOnClick();
        MainActivity.reset.setText("Reset");
        MainActivity.reset.setClickable(true);
    }
}
