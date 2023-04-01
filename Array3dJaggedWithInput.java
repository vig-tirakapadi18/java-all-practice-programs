import java.util.Scanner;

class Array3dJaggedWithInput {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st dimension: ");
        int block = scan.nextInt();

        int [][][] arr = new int[block][][];

        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter 2nd dimension for "+i+" : ");
            int row = scan.nextInt();
            arr[i] = new int[row][];
        }

        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("Enter 3rd dimension for "+i+" "+j+" : ");
                int col = scan.nextInt();
                arr[i][j] = new int[col];
            }
        }

        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = 0; j <= arr[i].length - 1; j++) {
                for(int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.println("Enter the elements at "+i+" "+j+" "+k+" : ");
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }

        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = 0; j <= arr[i].length - 1; j++) {
                for(int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.println("The element at "+i+" "+j+" "+k+" : "+arr[i][j][k]);
                }
            }
        }
    }    
}
