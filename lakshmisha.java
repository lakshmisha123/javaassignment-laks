
class circle {
    int radius;
    double area;

    public void set(int r) {
        this.radius = r;
    }

    public double get() {
        area = 3.14 * radius * radius;
        return area;
    }
}

public class lakshmisha {
    public static void main(String[] args) {
        circle f = new circle();
        f.set(25);
        System.out.println(f.get());
    }
}
