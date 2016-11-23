package com.chatton.marina.holdall.palindrome;

/**
 * Created by Marina on 16/11/2016.
 */

public class PalindromeManager {
    boolean isPalindrome(String string){
        if(string.length()>0) {
            int maxIndex = string.length() - 1;
            for (int i = 0; i <= maxIndex / 2; i++) {
                if (string.charAt(i) != string.charAt(maxIndex - i)) {
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

    String reverse(String string){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<string.length(); i++){
            sb.insert(0, string.charAt(i));
        }
        return sb.toString();
    }
}
