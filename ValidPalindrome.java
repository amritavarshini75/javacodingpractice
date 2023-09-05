package org.example;
import java.lang.*;
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.equals("")) {
            return true;
        }  else {
            s = s.toLowerCase();
            s = s.replaceAll("[^a-zA-Z0-9]", "");
            System.out.println(s);
            StringBuffer b = new StringBuffer(s);
            b.reverse();
            String r = b.toString();
            if (r.equals(s)) {
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {

        String p = "A man, a plan, a canal: Panama";
        String h="0P";
        System.out.println(isPalindrome(h));

    }
}
