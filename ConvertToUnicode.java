import java.util.Scanner;

class ConvertToUnicode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = s.next().charAt(0);
        int unicode = ch;
        System.out.println("The unicode of "+ch+" is: "+unicode);
    }
}