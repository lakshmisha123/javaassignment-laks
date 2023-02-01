package anu;

import java.util.Scanner;

public class kavya2 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("enter the string=");
        String str=k.nextLine();
        String rev="";
        for (int i= str.length()-1; i>= 0;--i){
            rev=rev + str.charAt(i);}
        System.out.println(rev);
        {
            if (str.equals(rev))
                System.out.println("p");
            else
                System.out.println("np");

        }
    }
}
