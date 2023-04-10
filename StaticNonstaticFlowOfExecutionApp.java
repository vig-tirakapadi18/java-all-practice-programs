class StaticNonStaticFlowOfExecution {
    static int x, y, z;
    int p, q, r;

    static {
        System.out.println("Inside STATIC block!");
        x = 10;
        y = 20;
        z = 30;
    }

    {
        System.out.println("Inside NON-STATIC block!");
        p = 11;
        q = 22;
        r = 33;
        x = 9;
        y = 19;
        z = 29;
    }

    static void display1() {
        System.out.println("Inside STATIC method!");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    void display2() {
        System.out.println("Inside NON-STATIC method!");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
}

class StaticNonStaticFlowOfExecutionApp {
    public static void main(String[] args) {
        StaticNonStaticFlowOfExecution.display1();

        StaticNonStaticFlowOfExecution s = new StaticNonStaticFlowOfExecution();
        s.display2();
    }
}