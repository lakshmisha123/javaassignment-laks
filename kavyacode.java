package anu;

public class kavyacode {
    public static void main(String[] args) {
        String k="radar", rev= "";
        for (int i=k.length()-1; i>=0;--i)
            rev=rev+k.charAt(i);
        System.out.println(rev);
        {
            if (k.equals(rev))
                System.out.println("p");
            else
                System.out.println("np");
        }
    }
}
