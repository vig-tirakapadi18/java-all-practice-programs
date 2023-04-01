import java.util.Scanner;

class UppercaseLowercase {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();

        String UC = str.toUpperCase();
        System.out.println("Uppercase string is: "+UC);

        String LC = str.toLowerCase();
        System.out.println("Lowercase string is: "+LC);
    }
}