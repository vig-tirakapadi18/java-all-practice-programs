import java.util.Scanner;

class OutsideToInsideStringPool {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s1 = s.next();

        System.out.println("Enter second string: ");
        String s2 = s.next();

        System.out.println("Enter third string: ");
        String s3 = s.next();

        String str1 = s1.intern();
        String str2 = s2.intern();
        String str3 = s3.intern();

        if(str1 == str2) {
            System.out.println("Addresses are same!");
        } else {
            System.out.println("Addresses are not same!");
        }
    }
}