package hackerrank.y2017.codesprint11;

import java.util.*;
import java.util.stream.IntStream;

public class Challenge2 {

    static long getMagicNumber(String s, int k, int b, int m){
        int listLength = s.length() -k + 1;
        return IntStream.range(0,listLength)
                 .mapToObj(i -> s.substring(i, i+k))
                 .mapToInt(ss -> toDecimal(ss, b) % m)
                 .sum();
    }

    private static int toDecimal(String str, int base)
    {
        int len = str.length();
        int power = 1; // Initialize power of base
        int num = 0;  // Initialize result
        int i;
        for (i = len - 1; i >= 0; i--)
        {
            num += (str.charAt(i) - '0') * power;
            power = power * base;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        long result = getMagicNumber(s, k, b, m);
        System.out.println(result);
    }
}


