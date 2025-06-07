public class searchString {
    public static void main(String[] args) {
        String name = "Vishal Mishra";
        char target = 'M'; // Character to search for
        boolean found = search(name, target);
        if(found){
            System.out.println("character fount at index: " + name.indexOf(target));
        } else {
            System.out.println("Character not found in the string.");
        }
    }
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false; // String is empty
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true; // Return true if the target character is found
            }
        }
        return false; // Return false if the target character is not found
    }
}