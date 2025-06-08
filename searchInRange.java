public class searchInRange {
    public static void main(String[] args) {
        int [] arr = {23,4,2,4,53,54,76,12,-21,-56,78,98,-11,90};
        int target = 54; // Element to search for
        // System.out.println(searchRange(arr, target, 1, 7));
        int found = searchRange(arr, target, 1, 7);
        if (found != -1) {
            System.out.println("Element found at index: " + found);
        } else {
            System.out.println("Element not found in the specified range.");
        }
    }
    static int searchRange(int[]arr, int target, int start, int end){
        if (arr.length==0){
            return -1; // Array is empty
        }
        for(int i=start; i<=end; i++){
            if(arr[i]==target){
                return i; // Return the index of the target element within the specified range
            }
        }
    return -1; // Return -1 if the target is not found in the specified range
    }
} 
