class nenu{
    public int small(int ...arr){
        int s=0;
        for(int a:arr){
            s=s+a;
        }
        return s;
    }
}
public class varchar {
    public static void main(String[] args) {
        nenu r=new nenu();
        int sum=r.small(5,4,5,2);
        System.out.println(sum);
    }
}
