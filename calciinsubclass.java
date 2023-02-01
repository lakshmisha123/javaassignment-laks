package anu;

import java.util.Scanner;

public class calciinsubclass {
    public static void main(String[] args) {
       int n1,n2;
       Scanner x=new Scanner(System.in);
        System.out.println("the number");
        n1=Integer.parseInt(x.nextLine());
        n2=Integer.parseInt(x.nextLine());
        add(n1,n2); sub(n1,n2); mu(n1,n2); di(n1,n2);
    }

    public static void add(int n1,int n2){
        System.out.println(n1+n2);

    }

    public static void sub(int n1, int n2){
        System.out.println(n1-n2);

    }

    public static void mu(int n1, int n2) {
        System.out.println(n1*n2);

    }

    public static void di(int n1, int n2) {
        System.out.println(n1/n2);

    }
}
