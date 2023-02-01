package anu;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("pyramid rows you want");
        int b = Integer.parseInt(a.nextLine());
        Scanner c= new Scanner(System.in);
        System.out.println("symbol of pyramid you like");
        String d=c.nextLine();
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(d+"\t");
            }
            System.out.println();
        }
    }
}