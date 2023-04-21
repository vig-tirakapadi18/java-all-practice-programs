class Robot {
    String processor;
    String name;
 
    void meeting() {
        System.out.println("Meeting!");
    }
} 

class TeacherRobot extends Robot {
    String subject;

    void teach() {
        System.out.println("Teaching!");
    }
}

class CleanerRobot extends Robot {
    String util;

    void clean() {
        System.out.println("Cleaning!");
    }
}

class ReceptionRobot extends Robot {
    String software;

    void greet() {
        System.out.println("Greeting!");
    }
}

class RobotInheritenceApp {
    public static void main(String[] args) {
        TeacherRobot t = new TeacherRobot();
        CleanerRobot c = new CleanerRobot();
        ReceptionRobot r = new ReceptionRobot();

        t.processor = "i3";
        t.name = "abc";
        t.subject = "Java";
        t.meeting();
        t.teach();

        c.processor = "i5";
        c.name = "lmn";
        c.util = "Broom";
        c.meeting();
        c.clean();

        r.processor = "i7";
        r.name = "xyz";
        r.software = "MySQL";
        r.meeting();
        r.greet();
    }
}