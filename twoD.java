import java.util.Arrays;
import java.util.Scanner;
public class twoD {
    public static void main(String[] args) {
        int [][] vishal = new int [3][3];
        int [][] piyush = new int [3][];
        Scanner in = new Scanner(System.in);
        for(int i=0; i< vishal.length; i++){
            System.out.println("Enter the value of the matrix for"+i+" row");
            for (int j=0; j<vishal[i].length; j++){
                vishal[i][j] = in.nextInt();
            }
            }
            System.out.println("Matrix is: ");
        // for(int i=0; i<vishal.length; i++){
        //     for (int j=0; j < vishal[i].length; j++){
        //         System.out.print(vishal[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        // method 2
        // for (int i=0; i<vishal.length; i++){
        //     System.out.println(Arrays.toString(vishal[i]));
        // }


        // method 3
        // for (int[] row : vishal) {
        //     System.out.println(Arrays.toString(row)); 
        // }


        // method 4
        // System.out.println(Arrays.deepToString(vishal)); // for 2D arrays



    }
}