package com.example.tictactoe;

import android.app.AlertDialog;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.graphics.Color;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Task extends AsyncTask<Integer, Void, Void> {

    static Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
//    static AlertDialog.Builder builder;
    Context context;
    Boolean win = false;
    static int bu1, bu2, bu3;
    static int winning_int;

    public Task(Context context){
        this.context = context;
    }

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
    protected Void doInBackground(Integer... integers) {
        if(MainActivity.clicked > 4){
            switch(integers[0]){
                case 1:
                    if((b1.getText().toString()=="X" && b2.getText().toString()=="X" && b3.getText().toString()=="X") || (b1.getText().toString()=="O" && b2.getText().toString()=="O" && b3.getText().toString()=="O")){
                        win = true;     bu1 = 1;    bu2 = 2;    bu3 = 3;
                        winning_int = (b1.getText().toString()=="X")?1:0;
                    } else if((b1.getText().toString()=="X" && b4.getText().toString()=="X" && b7.getText().toString()=="X") || (b1.getText().toString()=="O" && b4.getText().toString()=="O" && b7.getText().toString()=="O")){
                        win = true;     bu1 = 1;    bu2 = 4;    bu3 = 7;
                        winning_int = (b1.getText().toString()=="X")?1:0;
                    } else if((b1.getText().toString()=="X" && b5.getText().toString()=="X" && b9.getText().toString()=="X") || (b1.getText().toString()=="O" && b5.getText().toString()=="O" && b9.getText().toString()=="O")){
                        win = true;     bu1 = 1;    bu2 = 5;    bu3 = 9;
                        winning_int = (b1.getText().toString()=="X")?1:0;
                    }break;

                case 2:
                    if((b1.getText().toString()=="X" && b2.getText().toString()=="X" && b3.getText().toString()=="X") || (b1.getText().toString()=="O" && b2.getText().toString()=="O" && b3.getText().toString()=="O")){
                        win = true;     bu1 = 1;    bu2 = 2;    bu3 = 3;
                        winning_int = (b1.getText().toString()=="X")?1:0;
                    } else if((b8.getText().toString()=="X" && b5.getText().toString()=="X" && b2.getText().toString()=="X") || (b8.getText().toString()=="O" && b5.getText().toString()=="O" && b2.getText().toString()=="O")){
                        win = true;     bu1 = 5;    bu2 = 2;    bu3 = 8;
                        winning_int = (b2.getText().toString()=="X")?1:0;
                    }break;

                case 3:
                    if((b1.getText().toString()=="X" && b2.getText().toString()=="X" && b3.getText().toString()=="X") || (b1.getText().toString()=="O" && b2.getText().toString()=="O" && b3.getText().toString()=="O")){
                        win = true;     bu1 = 1;    bu2 = 2;    bu3 = 3;
                        winning_int = (b1.getText().toString()=="X")?1:0;
                    } else if((b9.getText().toString()=="X" && b6.getText().toString()=="X" && b3.getText().toString()=="X") || (b9.getText().toString()=="O" && b6.getText().toString()=="O" && b3.getText().toString()=="O")){
                        win = true;     bu1 = 9;    bu2 = 6;    bu3 = 3;
                        winning_int = (b9.getText().toString()=="X")?1:0;
                    } else if((b3.getText().toString()=="X" && b5.getText().toString()=="X" && b7.getText().toString()=="X") || (b3.getText().toString()=="O" && b5.getText().toString()=="O" && b7.getText().toString()=="O")){
                        win = true;     bu1 = 7;    bu2 = 5;    bu3 = 3;
                        winning_int = (b5.getText().toString()=="X")?1:0;
                    }break;

                case 4:
                    if((b4.getText().toString()=="X" && b5.getText().toString()=="X" && b6.getText().toString()=="X") || (b4.getText().toString()=="O" && b5.getText().toString()=="O" && b6.getText().toString()=="O")){
                        win = true;     bu1 = 4;    bu2 = 5;    bu3 = 6;
                        winning_int = (b4.getText().toString()=="X")?1:0;
                    } else if((b1.getText().toString()=="X" && b4.getText().toString()=="X" && b7.getText().toString()=="X") || (b1.getText().toString()=="O" && b4.getText().toString()=="O" && b7.getText().toString()=="O")){
                        win = true;     bu1 = 1;    bu2 = 4;    bu3 = 7;
                        winning_int = (b1.getText().toString()=="X")?1:0;
                    }break;

                case 6:
                    if((b4.getText().toString()=="X" && b5.getText().toString()=="X" && b6.getText().toString()=="X") || (b4.getText().toString()=="O" && b5.getText().toString()=="O" && b6.getText().toString()=="O")){
                        win = true;     bu1 = 6;    bu2 = 5;    bu3 = 4;
                        winning_int = (b4.getText().toString()=="X")?1:0;
                    } else if((b3.getText().toString()=="X" && b6.getText().toString()=="X" && b9.getText().toString()=="X") || (b3.getText().toString()=="O" && b6.getText().toString()=="O" && b9.getText().toString()=="O")){
                        win = true;     bu1 = 9;    bu2 = 6;    bu3 = 3;
                        winning_int = (b3.getText().toString()=="X")?1:0;
                    }break;

                case 5:
                    if((b4.getText().toString()=="X" && b5.getText().toString()=="X" && b6.getText().toString()=="X") || (b6.getText().toString()=="O" && b4.getText().toString()=="O" && b5.getText().toString()=="O")){
                        win = true;     bu1 = 6;    bu2 = 5;    bu3 = 4;
                        winning_int = (b4.getText().toString()=="X")?1:0;
                    } else if((b2.getText().toString()=="X" && b5.getText().toString()=="X" && b8.getText().toString()=="X") || (b2.getText().toString()=="O" && b5.getText().toString()=="O" && b8.getText().toString()=="O")){
                        win = true;     bu1 = 8;    bu2 = 5;    bu3 = 2;
                        winning_int = (b2.getText().toString()=="X")?1:0;
                    }break;

                case 7:
                    if((b7.getText().toString()=="X" && b8.getText().toString()=="X" && b9.getText().toString()=="X") || (b7.getText().toString()=="O" && b8.getText().toString()=="O" && b9.getText().toString()=="O")){
                        win = true;     bu1 = 9;    bu2 = 8;    bu3 = 7;
                        winning_int = (b7.getText().toString()=="X")?1:0;
                    } else if((b1.getText().toString()=="X" && b4.getText().toString()=="X" && b7.getText().toString()=="X") || (b1.getText().toString()=="O" && b4.getText().toString()=="O" && b7.getText().toString()=="O")){
                        win = true;     bu1 = 7;    bu2 = 4;    bu3 = 1;
                        winning_int = (b1.getText().toString()=="X")?1:0;
                    } else if((b7.getText().toString()=="X" && b5.getText().toString()=="X" && b3.getText().toString()=="X") || (b7.getText().toString()=="O" && b5.getText().toString()=="O" && b3.getText().toString()=="O")){
                        win = true;     bu1 = 7;    bu2 = 5;    bu3 = 3;
                        winning_int = (b3.getText().toString()=="X")?1:0;
                    }break;

                case 8:
                    if((b8.getText().toString()=="X" && b2.getText().toString()=="X" && b5.getText().toString()=="X") || (b8.getText().toString()=="O" && b2.getText().toString()=="O" && b5.getText().toString()=="O")){
                        win = true;     bu1 = 5;    bu2 = 2;    bu3 = 8;
                        winning_int = (b8.getText().toString()=="X")?1:0;
                    } else if((b7.getText().toString()=="X" && b8.getText().toString()=="X" && b9.getText().toString()=="X") || (b9.getText().toString()=="O" && b8.getText().toString()=="O" && b7.getText().toString()=="O")){
                        win = true;     bu1 = 9;    bu2 = 8;    bu3 = 7;
                        winning_int = (b8.getText().toString()=="X")?1:0;
                    }break;

                case 9:
                    if((b7.getText().toString()=="X" && b8.getText().toString()=="X" && b9.getText().toString()=="X") || (b7.getText().toString()=="O" && b8.getText().toString()=="O" && b9.getText().toString()=="O")){
                        win = true;     bu1 = 9;    bu2 = 8;    bu3 = 7;
                        winning_int = (b9.getText().toString()=="X")?1:0;
                    } else if((b9.getText().toString()=="X" && b6.getText().toString()=="X" && b3.getText().toString()=="X") || (b9.getText().toString()=="O" && b6.getText().toString()=="O" && b3.getText().toString()=="O")){
                        win = true;     bu1 = 9;    bu2 = 6;    bu3 = 3;
                        winning_int = (b9.getText().toString()=="X")?1:0;
                    } else if((b1.getText().toString()=="X" && b5.getText().toString()=="X" && b9.getText().toString()=="X") || (b1.getText().toString()=="O" && b5.getText().toString()=="O" && b9.getText().toString()=="O")){
                        win = true;     bu1 = 1;    bu2 = 5;    bu3 = 9;
                        winning_int = (b1.getText().toString()=="X")?1:0;
                    }break;
            }
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        if(win){
            switch(winning_int) {
                case 0: Toast.makeText(context, "Player O Won", Toast.LENGTH_SHORT).show(); break;
                case 1: Toast.makeText(context, "Player X Won", Toast.LENGTH_SHORT).show(); break;
            }

            b1.setClickable(false);
            b2.setClickable(false);
            b3.setClickable(false);
            b4.setClickable(false);
            b5.setClickable(false);
            b6.setClickable(false);
            b7.setClickable(false);
            b8.setClickable(false);
            b9.setClickable(false);

            MainActivity.color_change(bu1, "#AC2E41");
            MainActivity.color_change(bu2, "#AC2E41");
            MainActivity.color_change(bu3, "#AC2E41");

            MainActivity.reset.setClickable(false);
            MainActivity.reset.setText("Refreshing...");
//            Toast.makeText(context, "Refreshing in 10 seconds", Toast.LENGTH_SHORT).show();
            Refresh r = new Refresh();
            r.execute();
        }
    }



}
