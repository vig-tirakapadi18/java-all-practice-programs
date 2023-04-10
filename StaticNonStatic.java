class StaticNonStatic {
    static int a, b, c; //static variables

    static {    //static block
        a = 10;
        b = 20;
        c = 30;
    }

    static void display1() {    //static method
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    int x, y, z;    //non-static variables

    {   //non-static block
        x = 70;
        y = 80;
        z = 90;
        a = 11;
        b = 22;
        c = 33;
    }

    void display2() {   //non-static method
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}