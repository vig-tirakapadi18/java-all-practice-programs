class Teacher {
    void teach() {
        System.out.println("Teacher is teaching!");
    }

    void assignment() {
        System.out.println("Teacher has given an assignment!");
    }
}

class JavaTeacher extends Teacher {
    void assignment() {
        System.out.println("JavaTeacher's assignment!");
    }

    void javaWork() {
        System.out.println("JavaTeacher is working!");
    }
}

class PythonTeacher extends Teacher {
    void assignment() {
        System.out.println("PythonTeacher's assignment!");
    }

    void javaWork() {
        System.out.println("PythonTeacher is working!");
    }
}

class PolymorphicProgramTeacher4 {
    public static void main(String[] args) {
        Teacher ref;
        ref = new JavaTeacher();
        ref.assignment();
        
        ref = new PythonTeacher();
        ref.assignment();
    }
}
