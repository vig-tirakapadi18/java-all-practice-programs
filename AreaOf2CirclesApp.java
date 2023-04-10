import java.util.Scanner;

class AreaOf2Circles {
    double r;
    static double pi;
    double area;

    static {
        pi = 3.14;
    }

    void takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        r = s.nextDouble();
    }

    void calcArea() {
        area = pi * r *  r;
    }

    void displayArea() {
        System.out.println("Radius is: "+area);
    }
}


public class AreaOf2CirclesApp {
    public static void main(String[] args) {
        AreaOf2Circles a1 = new AreaOf2Circles();
        AreaOf2Circles a2 = new AreaOf2Circles();

        a1.takeInput();
        a1.calcArea();
        a1.displayArea();

        a2.takeInput();
        a2.calcArea();
        a2.displayArea();
    }
}
