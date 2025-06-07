import java.util.Arrays;
public class array {

    public static void main(String[] args) {
        
        int [] vishal = new int [6];
        vishal[0]=20;
        vishal[1]=30;
        // System.out.println(vishal[0]);
        String[] high_fives =new String[5];
        high_fives[0]="vishal";
        high_fives[1]="Ankita";
        high_fives[2]="Ayushree";
        high_fives[3]="Vansh";
        high_fives[4]="Mehraj";
        // for(int i=0; i<=4; i++){
        //     System.out.print(high_fives[i]+" ");
        // }

//         int[] arr = new int[3];
//         for(int i=0; i<=2; i++){
//             System.out.print(arr[i]+" ");
//          }   
System.out.println(Arrays.toString(high_fives)); 
         }
}