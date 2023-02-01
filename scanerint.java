package anu;

import java.util.Scanner;

public class scanerint {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("guess what this");
        int i= input.nextInt();
        switch (i){
            case 1:
                System.out.println("modern");
                break;
            case 2:
                System.out.println("sun");
                break;
            default:
                System.out.println(" noplace");
        }
    }
}
