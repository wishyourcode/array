public class searching {
    public static void main(String[] args) {
        int [] nums = {23,4,2,4,53,54,76,12,-21,-56,78,98,-11,90};
        int target = 54; // Element to search for
        int result = linearSearch(nums, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1; // Array is empty
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
