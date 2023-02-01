package anu;

import java.util.Scanner;

public class methodover {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner x=new Scanner(System.in);
        System.out.println("enter");
        n1= Integer.parseInt(x.nextLine());
        n2=Integer.parseInt(x.nextLine());
        n3=Integer.parseInt(x.nextLine());
        add(n1,n2); add(n1,n2,n3);

    }

    public static void add(int n1, int n2) {
        System.out.println(n1+n2);
    }
    public static void add(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }


}
