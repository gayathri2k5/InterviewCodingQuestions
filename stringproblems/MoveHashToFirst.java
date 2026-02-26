public class MoveHashToFirst {                                                       
    public static void main(String[] args) {
        String str = "a#b#cd#e";
        String result = "";

        // first add all #
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                result = result + "#";
            }
        }

        // then add all other characters
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                result = result + str.charAt(i);
            }
        }

        System.out.println("After moving #: " + result);
    }
}

