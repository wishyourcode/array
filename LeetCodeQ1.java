public class LeetCodeQ1 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 60, 7896};
        int result = findNumbers(nums);
        System.out.println("Count of numbers with even digits: " + result);
    }
    static int countDigits(int nums) {
         if (nums == 0) return 1; // Special case for 0
         // Count the number of digits in the integer
            int count = 0;
            while (nums > 0) {
                  nums = nums / 10;
                count++;
     }
     return count; // Return the count of digits
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (countDigits(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
