import java.util.Scanner;

class Array3DRegularWithInput {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st dimension: ");
        int block = scan.nextInt();
        System.out.println("Enter the 2nd dimension: ");
        int row = scan.nextInt();
        System.out.println("Enter the 3rd dimension: ");
        int col = scan.nextInt();

        int [][][] arr = new int[block][row][col];

        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = 0; j <= arr[i].length - 1; j++) {
                for(int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.println("Enter the element at "+i+" "+j+" "+k+"  : ");
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }

        System.out.println("The enetered elements are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = 0; j <= arr[i].length - 1; j++) {
                for(int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.println("The element at: "+i+" "+j+" "+k+" : "+arr[i][j][k]);
                }
            }
        }
    }    
}
