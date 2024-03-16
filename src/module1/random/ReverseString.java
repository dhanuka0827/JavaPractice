package module1.random;

public class ReverseString {

        public static String reverse(String toReverse) {
            char[] characters = toReverse.toCharArray();
            int start = 0;
            int end = characters.length - 1;
            char temp;
            while(end > start){
                temp = characters[start];
                characters[start] = characters[end];
                characters[end] = temp;
                end--;
                start++;
            }
            return new String(characters);
        }

        public static String reverseInefficient(String toReverse){
            char [] characters = toReverse.toCharArray();
            int length = characters.length;
            char [] newChar = new char[length];

            for(int i=length; i>0;i--){
                //System.out.println("i: "+i+" length-i : "+ (length-i));
                newChar[length-i] = characters[i-1];
            }
            return new String(newChar);
        }

        public static String reverseAnother(String toReverse){
            StringBuilder sb = new StringBuilder(toReverse);
            return sb.reverse().toString();
        }
        public static void main(String args[]) {
            System.out.println(reverse("uyeep"));
            System.out.println(reverseAnother("uyeep"));
            System.out.println(reverseInefficient("uyeep"));
    }
}
