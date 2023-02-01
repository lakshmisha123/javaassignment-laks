package anu;

import java.util.Scanner;

public class scaner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("guess");
        String text=input.nextLine();
        switch (text){
            case "anu":
                System.out.println("m");
                break;
            case "anyother":
                System.out.println("s");
                break;
            default:
                System.out.println("a");
        }
    }
}
