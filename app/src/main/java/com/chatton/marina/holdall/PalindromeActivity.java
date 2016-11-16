package com.chatton.marina.holdall;

import android.content.res.ColorStateList;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
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
        final FloatingActionButton resultTestBtn = (FloatingActionButton) findViewById(R.id.fab_result);

        testPalindromeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String wordToTest = wordToTestField.getText().toString();
                reversedWord.setText(palindromeManager.reverse(wordToTest));
                boolean palindrome = palindromeManager.isPalindrome(wordToTest);
                int colorResult;
                if(palindrome) {
                    colorResult=R.color.green;
                }else{
                    colorResult=R.color.red;
                }
                resultTestBtn.setVisibility(View.VISIBLE);
                resultTestBtn.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(colorResult)));
            }
        });
    }
}
