package module1.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubstringComparison {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargestHackerrank(s, k));
        //System.out.println(getSmallestAndLargestJava8(s, k));
        //System.out.println(getSmallestAndLargest(s, k));
    }

    private static String getSmallestAndLargestHackerrank(String s, int k) {
        String smallest = s;
        String largest = "";

        for(int i = 0; i < s.length()-k+1;i++){

            //smallest
            String sub = s.substring(i,i+k);
            if(smallest.compareTo(sub)>0){
                smallest = sub;
            }
            if(largest.compareTo(sub)<0){
                largest = sub;
            }

        }



        return smallest + "\n" + largest;
    }

    private static String getSmallestAndLargest(String s, int k) {
        List<String> substrings = new ArrayList<>();

        String str[] = new String[s.length()-k+1];

        if (s.length() < k) {
            return ""; // Return empty list if input length is less than desired length
        }

        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            str[i] = substring;
        }

        Arrays.sort(str);

        return str[0] + "\n" + str[str.length-1];
    }

    private static String getSmallestAndLargestJava8(String s, int k) {
            String smallest = "";
            String largest = "";
        List<String> list = IntStream.rangeClosed(0, s.length()-k)
                .mapToObj(i->s.substring(i, i+k))
                .sorted()
                .collect(Collectors.toList());


        smallest = list.get(0);
        largest = list.get(list.size()-1);

        return smallest + "\n" + largest;
    }


}
