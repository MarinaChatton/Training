package com.chatton.marina.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PalindromeActivity extends AppCompatActivity {
    PalindromeManager palindromeManager = new PalindromeManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        final EditText wordToTestField = (EditText) findViewById(R.id.word_to_test);
        Button testPalindromeBtn = (Button) findViewById(R.id.test_palindrome);
        final TextView reversedWord = (TextView) findViewById(R.id.reversed_word);

        testPalindromeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String wordToTest = wordToTestField.getText().toString();
                reversedWord.setText(palindromeManager.reverse(wordToTest));
            }
        });
    }
}
