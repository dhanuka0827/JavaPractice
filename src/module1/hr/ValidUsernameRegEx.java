package module1.hr;

import java.util.Scanner;

public class ValidUsernameRegEx {
        private static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            String regex = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
            int n = Integer.parseInt(scan.nextLine());
            while (n-- != 0) {
                String userName = scan.nextLine();

                if(userName.matches(regex)){
                    System.out.println("Valid");
                }else {
                    System.out.println("Invalid");
                }
            }
        }
    }

