package m;

public class in3 {
    public static void main(String[] args){
        int [] i={1, 2, 3, 4, 4};
        try{
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println("code failed due to space"+e);
        }
    }
}