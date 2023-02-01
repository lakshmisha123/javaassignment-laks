class tria{
    int length, height;
    public double area(int l, int h){
       int length=l, height=h;
       return 0.5*length*height;

    }
}
public class trianglearea {
    public static void main(String[] args) {
        tria j = new tria();
        System.out.println(j.area(25, 2));
    }

}
