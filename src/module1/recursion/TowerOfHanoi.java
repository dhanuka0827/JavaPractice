package module1.recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int disks = sc.nextInt();
        String t1 = sc.next();
        String t2 = sc.next();
        String t3 = sc.next();
        towerOfHanoi(disks, t1, t2, t3);
    }

    private static void towerOfHanoi(int disks, String t1, String t2, String t3) {
        if(disks ==0) {
            return;
        }
        towerOfHanoi(disks-1, t1, t3, t2);
        System.out.println(disks +"[ "+t1+" => "+t2+" ]");
        towerOfHanoi(disks-1, t3, t2, t1);
    }
}
