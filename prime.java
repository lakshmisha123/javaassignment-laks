package wc;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int x=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number which you want to know prime or not");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++)
            if (n%i==0) {
                x++;
            }
        if (x==2)
            System.out.println(" "+n+"  is a prime");
        else
            System.out.println(""+n+" is not prime");
    }
}
