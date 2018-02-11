package hackerEarth.coding.y2016.amazon;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Divisibilityby7 {

	private static Map<BigInteger, Integer> map = new HashMap<>();
	private static Map<Integer, Integer> mapInt = new HashMap<>();

	private static BigInteger seven = new BigInteger("7");

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String number = in.next();
		int testCases = in.nextInt();
		while (testCases-- > 0) {
			int beginIndex = in.nextInt() - 1;
			int endIndex = in.nextInt();
			int range = endIndex - beginIndex;
			String sub = number.substring(beginIndex, endIndex);
			int num = 0;
			if (range < 10) {
				int i = Integer.parseInt(sub);

				num = getMod(i);

			} else {
				BigInteger testNumber = new BigInteger(sub);
				num = getResult(testNumber);
			}
			if (num == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static int getMod(int num) {
		if (mapInt.containsKey(num))
			return mapInt.get(num);
		int result = num % 7;
		mapInt.put(num, result);
		return result;
	}

	private static int getResult(BigInteger testNumber) {
		if (map.containsKey(testNumber))
			return map.get(testNumber);
		/*
		 * BigInteger first = testNumber.divide(ten); BigInteger last =
		 * testNumber.subtract(first.multiply(ten)); last = last.multiply(two);
		 * int result = getResult(first.subtract(last));
		 */

		int result = testNumber.mod(seven).intValue();

		map.put(testNumber, result);
		return result;
	}

}
