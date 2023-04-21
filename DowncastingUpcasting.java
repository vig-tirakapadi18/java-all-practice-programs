class Teacher {
    void teach() {
        System.out.println("Teacher is teaching!");
    }

    void assignment() {
        System.out.println("Teacher is giving Assignment!");
    }
}

class JavaTeacher extends Teacher {
    void assignment() {
        System.out.println("JT is teaching!");
    }

    void javaWork() {
        System.out.println("JT is working!");
    }
}

class PythonTeacher extends Teacher {
    void assignment() {
        System.out.println("PT is teaching!");
    }

    void pythonWork() {
        System.out.println("PT is working!");
    }
}

class DowncastingUpcasting {
    public static void main(String[] args) {
        Teacher ref;
        JavaTeacher jt = new JavaTeacher();
        PythonTeacher pt = new PythonTeacher();

        ref = jt;
        ref.teach();
        ref.assignment();
        // ref.javaWork();  //Does not work!
        ((JavaTeacher) (ref)).javaWork();

        ref = pt;
        ref.teach();
        ref.assignment();
        // ref.pythonWork()  //Does not work!
        ((PythonTeacher) (ref)).pythonWork();
    }
}