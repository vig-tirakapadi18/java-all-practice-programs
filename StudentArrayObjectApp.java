import java.util.Scanner;

class StudentArrayObject {
    int id;
    String name;
    int age;
    float marks;

    void study() {
        System.out.println("Student is Studying!");
    }
}

class StudentArrayObjectApp {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num of Objects: ");
        int obj = s.nextInt();

        StudentArrayObject [] arr = new StudentArrayObject[obj];

        for(int i = 0; i <= arr.length - 1; i++) {
            arr[i] = new StudentArrayObject();
        }

        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter student Id: ");
            arr[i].id = s.nextInt();
            System.out.println("Enter student Name: ");
            arr[i].name = s.next();
            System.out.println("Enter student Age: ");
            arr[i].age = s.nextInt();
            System.out.println("Enter student Marks: ");
            arr[i].marks = s.nextFloat();
        }

        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println("ID: "+arr[i].id+" Name: "+arr[i].name+" Age: "+arr[i].age+" Marks:  "+arr[i].marks);
        }
    }
}
