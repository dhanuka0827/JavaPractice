package module1.leetcode.easy;

public class MinTimeToVisitAllPoints {
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }
    public static int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for(int i = 1; i<=points.length-1;i++){
            int[] curr = points[i], prev = points[i-1];
            count += Math.max(Math.abs(curr[0]-prev[0]),Math.abs(curr[1]-prev[1]));
        }
        return count;
    }
}