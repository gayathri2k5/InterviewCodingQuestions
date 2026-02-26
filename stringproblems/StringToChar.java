public class StringToChar {
    public static void main(String[] args) {
        
        String str = "Hello";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            System.out.println(ch);
        }
    }
}

//public class StringToCharArray {
    //public static void main(String[] args) {
        //String str = "Hello";
        //char[] charArray = str.toCharArray(); // Direct conversion
        //for(char ch : charArray) {
           // System.out.println(ch);
      //}
  //}
//}

