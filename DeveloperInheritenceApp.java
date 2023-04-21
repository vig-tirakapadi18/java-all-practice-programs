class Developer {
    String name;
    String team;
}

class FrontendDev extends Developer {
    String webTechName;

    void work() {
        System.out.println(name + " is working as Frontend Developer!");
    }
}

class BackendDev extends Developer {
    String progLangName;

    void meeting() {
        System.out.println(name + " is attend meeting as Backend Developer!");
    }
}

class JavaDev extends BackendDev {
    void javaProject() {
        System.out.println(name + " is working on Java Project!");
    }
}

class PythonDev extends BackendDev {
    void pythonProject() {
        System.out.println(name + " is working on Python Project!");
    }
}

class DeveloperInheritenceApp {
    public static void main(String[] args) {
        FrontendDev fd = new FrontendDev();
        BackendDev bd = new BackendDev();
        JavaDev jd = new JavaDev();
        PythonDev py = new PythonDev();

        fd.name = "abc";
        fd.team = "Alpha";
        fd.webTechName = "ReactJs";
        fd.work();

        bd.name = "lmn";
        bd.team = "Beta";
        bd.progLangName = "NodeJs";
        bd.meeting();

        jd.name = "pqr";
        jd.team = "Gamma";
        jd.javaProject();

        py.name = "xyz";
        py.team = "Delta";
        py.pythonProject();
    }
}
