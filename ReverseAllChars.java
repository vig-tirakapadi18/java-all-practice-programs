import java.util.Scanner;

class ReverseAllChars {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse()); 
    }    
}
