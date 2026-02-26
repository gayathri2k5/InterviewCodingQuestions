public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        String result = ""; // To store unique characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // take one character

            // If the character is not already added, then add it
            if (result.indexOf(ch) == -1) { 
                result = result + ch;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + result);
    }
}
