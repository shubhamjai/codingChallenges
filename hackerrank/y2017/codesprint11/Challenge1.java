package hackerrank.y2017.codesprint11;

import java.util.*;

public class Challenge1 {

    static int solve(int[] a){
        int arraySize = a.length ;

        int leftSum = getSum(a, 0, arraySize/2);
        int  rightSum = getSum(a, arraySize/2, arraySize);
        return Math.abs(leftSum -rightSum);
    }

    private static int getSum(int[] a, int startIndex, int endIndex) {
        return
                Arrays.stream(a, startIndex, endIndex)
                .sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = solve(a);
        System.out.println(result);
    }
}
