class KodNestStudent {
    String kodId, name, courseName;
    double percentage;
    static String institutionName;

    static {
        institutionName = "KodNest";
    }

    void display() {
        System.out.println(kodId+" "+name+" "+courseName+" "+percentage);
    }

    static void displayInstituteName() {
        System.out.println(institutionName);
    }
}

class KodNestStudentApp {
    public static void main(String[] args) {
        //Invoking the static method - directly on the class
        KodNestStudent.displayInstituteName();

        //Creating the object
        KodNestStudent ks = new KodNestStudent();
        ks.kodId = "KODNMO034";
        ks.name = "Vighnesh";
        ks.courseName = "MCP1";
        ks.percentage = 68.5;

        //Invoking non-static method - we can invoke after creating the class first
        ks.display();
    }
}
