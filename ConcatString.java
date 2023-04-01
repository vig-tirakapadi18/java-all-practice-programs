import java.util.Scanner;

class ConcatString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        String str1 = s.nextLine();
        System.out.println("Enter 2nd string: ");
        String str2 = s.nextLine();
        String concStr = str1.concat(str2);
        System.out.println(concStr);
    }    
}
