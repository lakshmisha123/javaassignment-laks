class circle1{
    int radius, height;
    double volume;
    public void set(int r, int h){
        this.radius=r;
        this.height=h;
    }
    public double get(){
        volume=3.14*radius*height;
        return volume;
    }
}
public class cylinder{
    public static void main(String[] args){
        circle1 f=new circle1();
        f.set(25,30);
        System.out.println(f.get());
    }
}

