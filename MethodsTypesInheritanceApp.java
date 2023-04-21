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
        System.out.println("Java Teacher's Assignment!");
    }

    void javaWork() {
        System.out.println("Java Teacher is working!");
    }
}

class PythonTeacher extends Teacher {
    void assignment() {
        System.out.println("Python Teacher's Assignment!");
    }

    void pythonWork() {
        System.out.println("Python Teacher is working!");
    }
}

class MethodsTypesInheritanceApp {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
        PythonTeacher pt = new PythonTeacher();

        jt.teach();
        jt.assignment();
        jt.javaWork();

        pt.teach();
        pt.assignment();
        pt.pythonWork();
    }
}
