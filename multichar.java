class ni{
    public int ni(int ...arr){
      int  m=1;
        for (int i=0; i<arr.length; i++){
            m=m*arr[i];
        }
        return m;
    }
}
public class multichar {
    public static void main (String[] args){
        ni e=new ni();
        int mul=e.ni(5,2);
        System.out.println(mul);
    }
}
