import java.util.Scanner;

class StringToStringArray {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();
        String [] arr = str.split(" ");
        System.out.println("The array elements are: ");

        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}