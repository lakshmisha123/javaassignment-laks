package lakshmisha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class user {
    public static void main(String[] args) throws IOException {
        int i, j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of i");
        i=Integer.parseInt(br.readLine());
        System.out.println("enter the value of j");
        j=Integer.parseInt(br.readLine());
        System.out.println((i+j)/2);
    }
}
