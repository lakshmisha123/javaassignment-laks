package anu;

import java.util.Scanner;

public class scaner111 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("date of joining");
        int i= input.nextInt();
        switch (i){
            case 1:
                System.out.println("20.01.2023");
                break;
            case 2:
                System.out.println("21.01.2023");
                break;
            default:
                System.out.println("no need");
        }
    }
}
