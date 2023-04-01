import java.util.Scanner;

class Array2DRegularWithInput {
        public static void main(String[]args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the row size: ");
                int row = scan.nextInt();
                System.out.println("Enter column size: ");
                int col = scan.nextInt();

                int [][] arr = new int[row][col];

                for (int i = 0; i <= arr.length - 1; i++) {
                        for (int j = 0; j <= arr[i].length - 1; j++) {
                                System.out.println("Enter the element for "+i+" row and  "+j+" column: ");
                                arr[i][j] = scan.nextInt();
                        }
                }

                System.out.println("The entered elements are: ");

                for (int i = 0; i <= arr.length - 1; i++) {
                        for(int j = 0; j <= arr[i].length - 1; j++) {
                                System.out.println("The element at "+i+" row "+j+" column is: "+arr[i][j]);
                        }
                }
        }        
}
