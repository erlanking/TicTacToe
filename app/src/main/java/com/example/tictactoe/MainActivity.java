package com.example.tictactoe;
import android.content.Intent;
import android.graphics.Color;
import android.media.audiofx.Equalizer;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    String krest, nol;
    TextView textView, humanPoints, pcPointc;
    int pointsOfHuman, pointsOfPc;
    boolean gameEnded = false;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });




        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textView = findViewById(R.id.textView);

        humanPoints = findViewById(R.id.humanPoints);
        pcPointc = findViewById(R.id.pcPoints);

        krest = "X";
        nol = "0";
        textView.setText("");
    }
    public void resetScores(View view) {
        // Сброс очков
        pointsOfHuman = 0;
        pointsOfPc = 0;
        humanPoints.setText(String.valueOf(pointsOfHuman));
        pcPointc.setText(String.valueOf(pointsOfPc));
    }
    public void clickRestart(View view) {
        // Очистка всех кнопок
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        textView.setText("");

        button1.setBackgroundColor(button1.getContext().getResources().getColor(R.color.purple));
        button2.setBackgroundColor(button2.getContext().getResources().getColor(R.color.purple));
        button3.setBackgroundColor(button3.getContext().getResources().getColor(R.color.purple));
        button4.setBackgroundColor(button4.getContext().getResources().getColor(R.color.purple));
        button5.setBackgroundColor(button5.getContext().getResources().getColor(R.color.purple));
        button6.setBackgroundColor(button6.getContext().getResources().getColor(R.color.purple));
        button7.setBackgroundColor(button7.getContext().getResources().getColor(R.color.purple));
        button8.setBackgroundColor(button8.getContext().getResources().getColor(R.color.purple));
        button9.setBackgroundColor(button9.getContext().getResources().getColor(R.color.purple));
    }


    public void clcBtn1(View view){
        if (button1.getText()==""  && textView.getText()==""){
            button1.setText(krest);
            isPlayerWinner();
            if (textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn2(View view){
        if (button2.getText()=="" && textView.getText()==""){
            button2.setText(krest);
            isPlayerWinner();
            if (textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn3(View view){
        if (button3.getText()=="" && textView.getText()==""){
            button3.setText(krest);
            isPlayerWinner();
            if (textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn4(View view){
        if (button4.getText()=="" && textView.getText()==""){
            button4.setText(krest);
            isPlayerWinner();
            if (textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn5(View view){
        if (button5.getText()=="" && textView.getText()==""){
            button5.setText(krest);
            isPlayerWinner();
            if (textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn6(View view){
        if (button6.getText()=="" && textView.getText()==""){

            button6.setText(krest);
            isPlayerWinner();
            if (textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn7(View view){
        if (button7.getText()=="" && textView.getText()==""){
            button7.setText(krest);
            isPlayerWinner();
            if (textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn8(View view){
        if (button8.getText()=="" && textView.getText()==""){
            button8.setText(krest);
            isPlayerWinner();
            if (textView.getText()=="") {
                hodPC();
            }
        }
    }
    public void clcBtn9(View view){
        if (button9.getText()==""&& textView.getText()==""){
            button9.setText(krest);
            isPlayerWinner();
            if (textView.getText()=="") {
                hodPC();
            }
        }

    }
    public void isPlayerWinner() {
        if (button1.getText().equals(krest) && button2.getText().equals(krest) && button3.getText().equals(krest)) {
            button1.setBackgroundColor(Color.GREEN);
            button2.setBackgroundColor(Color.GREEN);
            button3.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(String.valueOf(pointsOfHuman));
        } else if (button4.getText().equals(krest) && button5.getText().equals(krest) && button6.getText().equals(krest)) {
            button4.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(String.valueOf(pointsOfHuman));
        } else if (button7.getText().equals(krest) && button8.getText().equals(krest) && button9.getText().equals(krest)) {
            button7.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(String.valueOf(pointsOfHuman));
        } else if (button1.getText().equals(krest) && button5.getText().equals(krest) && button9.getText().equals(krest)) {
            button1.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(String.valueOf(pointsOfHuman));
        } else if (button7.getText().equals(krest) && button5.getText().equals(krest) && button3.getText().equals(krest)) {
            button7.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button3.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(String.valueOf(pointsOfHuman));
        } else if (button1.getText().equals(krest) && button4.getText().equals(krest) && button7.getText().equals(krest)) {
            button1.setBackgroundColor(Color.GREEN);
            button4.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(String.valueOf(pointsOfHuman));
        } else if (button2.getText().equals(krest) && button5.getText().equals(krest) && button8.getText().equals(krest)) {
            button2.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(String.valueOf(pointsOfHuman));
        } else if (button3.getText().equals(krest) && button6.getText().equals(krest) && button9.getText().equals(krest)) {
            button3.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanPoints.setText(String.valueOf(pointsOfHuman));
        } else if (button1.getText() !="" && button2.getText() !="" && button3.getText() !="" &&
                button4.getText() !="" && button5.getText() !="" && button6.getText() !="" &&
                button7.getText() !="" && button8.getText() !="" && button9.getText() !="") {
            textView.setText(R.string.draw_message);}
    }

    public void isPСWinner() {
        if (gameEnded) return;
        if (button1.getText().equals(nol) && button2.getText().equals(nol) && button3.getText().equals(nol)) {
            button1.setBackgroundColor(Color.GREEN);
            button2.setBackgroundColor(Color.GREEN);
            button3.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPc++;
            pcPointc.setText(String.valueOf(pointsOfPc));
            gameEnded = true;
        }else
        if (button4.getText().equals(nol) && button5.getText().equals(nol) && button6.getText().equals(nol)) {
            button4.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPc++;
            pcPointc.setText(String.valueOf(pointsOfPc));
            gameEnded = true;
        }else
        if (button7.getText().equals(nol) && button8.getText().equals(nol) && button9.getText().equals(nol)) {
            button7.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPc++;
            pcPointc.setText(String.valueOf(pointsOfPc));
            gameEnded = true;
        }else

        if (button1.getText().equals(nol) && button5.getText().equals(nol) && button9.getText().equals(nol)) {
            button1.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPc++;
            pcPointc.setText(String.valueOf(pointsOfPc));
            gameEnded = true;
        }else
        if (button7.getText().equals(nol) && button5.getText().equals(nol) && button3.getText().equals(nol)) {
            button7.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button3.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPc++;
            pcPointc.setText(String.valueOf(pointsOfPc));
            gameEnded = true;
        }else

        if (button1.getText().equals(nol) && button4.getText().equals(nol) && button7.getText().equals(nol)) {
            button1.setBackgroundColor(Color.GREEN);
            button4.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPc++;
            pcPointc.setText(String.valueOf(pointsOfPc));
            gameEnded = true;
        }else
        if (button2.getText().equals(nol) && button5.getText().equals(nol) && button8.getText().equals(nol)) {
            button2.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPc++;
            pcPointc.setText(String.valueOf(pointsOfPc));
            gameEnded = true;
        }else
        if (button3.getText().equals(nol) && button6.getText().equals(nol) && button9.getText().equals(nol)) {
            button3.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText(R.string.pc_winner_message);
            pointsOfPc++;
            pcPointc.setText(String.valueOf(pointsOfPc));
            gameEnded = true;
        }
    }
    public void onSettingClick(View view){
         startActivity(new Intent(MainActivity.this, SettingsMainActivity.class));
         finish();
    }




    private void hodPC(){
        Random random = new Random();
        int buttonPcClick = 1 +  random.nextInt(9);
        Log.i("hodPC","buttonPcClick-"+ buttonPcClick);
        switch (buttonPcClick){
            case (1): if (button1.getText()==""){
                button1.setText(nol);
            }else{hodPC();}
                break;
            case (2): if (button2.getText()==""){
                button2.setText(nol);
            }else{hodPC();}
                break;
            case (3): if (button3.getText()==""){
                button3.setText(nol);
            }else{hodPC();}
                break;
            case (4): if (button4.getText()==""){
                button4.setText(nol);
            }else{hodPC();}
                break;
            case (5): if (button5.getText()==""){
                button5.setText(nol);
            }else{hodPC();}
                break;
            case (6): if (button6.getText()==""){
                button6.setText(nol);
            }else{hodPC();}
                break;
            case (7): if (button7.getText()==""){
                button7.setText(nol);
            }else{hodPC();}
                break;
            case (8): if (button8.getText()==""){
                button8.setText(nol);
            }else{hodPC();}
                break;
            case (9): if (button9.getText()==""){
                button9.setText(nol);
            }else{hodPC();}
                break;
        }

        isPСWinner();




    }
}