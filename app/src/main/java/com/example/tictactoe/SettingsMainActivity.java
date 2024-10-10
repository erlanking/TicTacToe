package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsMainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    String krest, nol;
    TextView textView, humanPoints, pcPoints;
    int pointsOfPlayer1, pointsOfPlayer2;
    boolean isPlayer1Turn = true; // true - ходит игрок 1, false - игрок 2
    boolean gameEnded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_main);

        // Инициализация ваших компонентов
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
        humanPoints = findViewById(R.id.player1Points);
        pcPoints = findViewById(R.id.player2Points);

        krest = "X";
        nol = "O";
        textView.setText("");
    }

    public void onSettingClick(View view) {
        Intent intent = new Intent(SettingsMainActivity.this, MainActivity.class);
        startActivity(intent); // Запускаем главную активность
        finish(); // Закрываем текущую активность
    }

    public void resetScores(View view) {
        pointsOfPlayer1 = 0;
        pointsOfPlayer2 = 0;
        humanPoints.setText(String.valueOf(pointsOfPlayer1));
        pcPoints.setText(String.valueOf(pointsOfPlayer2));
    }

    public void clickRestart(View view) {
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

        isPlayer1Turn = true;
        gameEnded = false;
    }

    public void clcBtn(View view) {
        Button button = (Button) view;
        if (button.getText().equals("") && !gameEnded) {
            button.setText(isPlayer1Turn ? krest : nol);
            checkWinner();
            if (!gameEnded) {
                isPlayer1Turn = !isPlayer1Turn; // Смена хода
            }
        }
    }

    private void checkWinner() {
        String[][] board = {
                {button1.getText().toString(), button2.getText().toString(), button3.getText().toString()},
                {button4.getText().toString(), button5.getText().toString(), button6.getText().toString()},
                {button7.getText().toString(), button8.getText().toString(), button9.getText().toString()}
        };

        String currentPlayerSymbol = isPlayer1Turn ? krest : nol;

        if ((board[0][0].equals(currentPlayerSymbol) && board[0][1].equals(currentPlayerSymbol) && board[0][2].equals(currentPlayerSymbol)) ||
                (board[1][0].equals(currentPlayerSymbol) && board[1][1].equals(currentPlayerSymbol) && board[1][2].equals(currentPlayerSymbol)) ||
                (board[2][0].equals(currentPlayerSymbol) && board[2][1].equals(currentPlayerSymbol) && board[2][2].equals(currentPlayerSymbol)) ||
                (board[0][0].equals(currentPlayerSymbol) && board[1][0].equals(currentPlayerSymbol) && board[2][0].equals(currentPlayerSymbol)) ||
                (board[0][1].equals(currentPlayerSymbol) && board[1][1].equals(currentPlayerSymbol) && board[2][1].equals(currentPlayerSymbol)) ||
                (board[0][2].equals(currentPlayerSymbol) && board[1][2].equals(currentPlayerSymbol) && board[2][2].equals(currentPlayerSymbol)) ||
                (board[0][0].equals(currentPlayerSymbol) && board[1][1].equals(currentPlayerSymbol) && board[2][2].equals(currentPlayerSymbol)) ||
                (board[0][2].equals(currentPlayerSymbol) && board[1][1].equals(currentPlayerSymbol) && board[2][0].equals(currentPlayerSymbol))) {

            gameEnded = true;
            if (isPlayer1Turn) {
                pointsOfPlayer1++;
                humanPoints.setText(String.valueOf(pointsOfPlayer1));
                textView.setText(R.string.FirstWin);
            } else {
                pointsOfPlayer2++;
                pcPoints.setText(String.valueOf(pointsOfPlayer2));
                textView.setText(R.string.SecondWin);
            }
        } else if (button1.getText().length() > 0 && button2.getText().length() > 0 && button3.getText().length() > 0 &&
                button4.getText().length() > 0 && button5.getText().length() > 0 && button6.getText().length() > 0 &&
                button7.getText().length() > 0 && button8.getText().length() > 0 && button9.getText().length() > 0) {
            textView.setText(R.string.draw_message);
            gameEnded = true;
        }
    }
}
