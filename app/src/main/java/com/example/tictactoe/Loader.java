package com.example.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

public class Loader extends AsyncTask<Void, Void, Void> {

    Context c;
    public Loader(Context c){
        this.c = c;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Intent i = new Intent(c, MainActivity.class);
        c.startActivity(i);
    }
}
