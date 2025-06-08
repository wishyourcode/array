public class maxIn2D {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90, 124},
            {100, 200, 300}
        };
        max = max(arr); // Call the max function to find the maximum element in the 2D array
        System.out.println("The maximum element in the 2D array is: " + max); // Print the maximum element
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer
         for (int row =0; row<arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                if(arr[row][col]>max){
                    max = arr[row][col]; // Update max if a larger element is found
                }
            }
            }
            return max;
    }
    
}
