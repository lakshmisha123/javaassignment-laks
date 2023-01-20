package anu;

import javax.swing.*;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("the palindrome you want to check");
        String Str = scanner.nextLine();
        String rev = "";
        for (int i = Str.length() - 1; i >= 0; i--) {
            rev = rev + Str.charAt(i);
        }
        System.out.println(rev);
        {
            if (Str.equals(rev))
                System.out.println( "given sting is palindrome");
            else
                System.out.println(" given string is not palindrome");
        }
    }
}