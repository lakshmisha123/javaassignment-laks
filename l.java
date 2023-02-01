package wc;

import java.util.Scanner;

public class l {
    public static void main(String[] args) {
        int l=0;
        Scanner b=new Scanner(System.in);
        System.out.println("the nu");
        int m=b.nextInt();
        for (int i=1;i<=100;i++)
        if (m%i==0) {
            l++;
        }
        if (l==2)
            System.out.println("is a prime");
        else
            System.out.println("is not a prime");
    }
}
