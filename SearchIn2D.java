public class SearchIn2D {
    public static void main(String[] args) {
        int [][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int target =90;// Element to search for
        int result[] =  search(arr,target);
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Element found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element not found in the 2D array.");
        }
    }

    static int[] search(int [][] arr, int target){
        if(arr.length==0){
            return new int[]{-1, -1}; // Return -1, -1 if the array is empty
        }
        for (int row =0; row <arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row, col}; // Return the row and column indices of the target element
                }
            }
        }
        return new int[]{-1,-1}; // Return -1, -1 if the target is not found in the 2D array
    }
}
