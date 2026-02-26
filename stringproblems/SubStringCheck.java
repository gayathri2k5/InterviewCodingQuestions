public class SubStringCheck {
    public static void main(String[] args) {

        String main = "programming";
        String sub = "gram";
        int i, j;

        for (i = 0; i <= main.length() - sub.length(); i++) {
            for (j = 0; j < sub.length(); j++) {
                if (main.charAt(i + j) != sub.charAt(j)) {
                    break;  // characters don’t match, move to next position
                }
            }
            if (j == sub.length()) {
                System.out.println(" Substring found at index " + i);
                return; // end program once found
            }
        }

        System.out.println(" Substring not found!");
    }
}


//public class SubStringCheck {
    //public static void main(String[] args) {

        //String main = "programming";
        //String sub = "gram";

        //if (main.contains(sub)) {
           // System.out.println("Substring found!");
        //} else {
            //System.out.println("Substring not found!");
        //}
    //}
//}

