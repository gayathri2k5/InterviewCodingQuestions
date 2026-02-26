public class MoveHashToEnd {
    public static void main(String[] args) {
        String str = "a#b#cd#e";
        String result = "";

        // first add all non-# characters
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                result = result + str.charAt(i);
            }
        }

        // then add all # characters
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                result = result + "#";
            }
        }

        System.out.println("After moving #: " + result);
    }
}
