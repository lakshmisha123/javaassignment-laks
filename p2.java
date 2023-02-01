package anu;

public class p2 {
    public static void main(String[] args) {
        String str ="wow", reverseStr ="";
        int strLength = str.length();
        for (int i=(strLength-1); i>=0; --i)
        {
            reverseStr = reverseStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str+ "palindrome");
        }
        else
            System.out.println(str + "not palindrome");
    }
}
