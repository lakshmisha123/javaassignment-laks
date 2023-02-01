package lakshmisha;

public class repl {
    public static void main(String[] args) {
        String str=" avi ";
        String str1=" Avi ";
        String str2="bangalore";
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.toUpperCase().trim());
        System.out.println(str.substring(2));
        System.out.println(str.replace('a','b'));
        System.out.println(str.startsWith(" "));
        System.out.println(str.charAt(1));
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str2.length());
        System.out.println(str2.toUpperCase());
        System.out.println(str2.substring(4));
        System.out.println(str2.replace('a','z'));

    }
}
