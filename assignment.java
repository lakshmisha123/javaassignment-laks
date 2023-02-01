import java.util.Scanner;

class anu{
    String regex="^(?:9|8|7)\\d{9}+$";//"^(?:9|8|7)\\d{9}+$";
    public void set(String i){
        if (i.matches (regex)){
            System.out.println("number correct");}
else {System.out.println("number wrong");
            }}}
    public class assignment{
        public static void main (String[] args){
            Scanner q=new Scanner(System.in);
            System.out.println("enter the phone number");
            String a=q.nextLine();
            anu y=new anu();
            y.set(a);
        }
    }