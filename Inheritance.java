
import java.util.*;

class Rect {

    protected int w;
    protected int h;

    public Rect(int w, int h) {
        this.w = w;
        this.h = h;
    }

    protected int calArea() {
        return w * h;
    }

    protected void setw(int w) {
        this.w = w;
    }

    protected void seth(int h) {
        this.h = h;
    }

    public void show() {
        System.out.println("Width: " + w);
        System.out.println("Height: " + h);
        System.out.println("Area: " + calArea());
    }

}

class Box extends Rect {

    private int l;

    public Box(int w, int h, int l) {
        super(w, h);
        this.l = l;
    }

    protected int calBox() {
        //return w * h * l;
        return calArea() * l;
    }

    protected void setl(int l) {
        this.l = l;
    }

    @Override
    public void show() {
        // System.out.println(w);
        // System.out.println(h);
        super.show();
        System.out.println("Length: " + l);
        System.out.println("Volume: " + calBox());
    }

}

public class Inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入長寬");
        Rect rect = new Rect(sc.nextInt(), sc.nextInt());
        rect.show();
        System.out.println("請輸入長寬高");
        Box box = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
        box.show();
        sc.close();
    }
}
