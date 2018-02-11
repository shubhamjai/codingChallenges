package hackerEarth.coding.y2016.saplab;

import java.util.Scanner;

public class SubArrays {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		
		while(testCases-- > 0)
		{
			int arrayLeght = in.nextInt();
			int[] array = new int[arrayLeght];
			for (int i =0; i< arrayLeght; i++)
			{
				array[i] = in.nextInt();
			}
			int subArrays = 0;
			int sameCount =1;
			for(int i = 1; i< arrayLeght;i++)
			{
				if(array[i] == array[i-1])
				{
					sameCount++;
				}
				else
				{
					subArrays += computeSubSets(sameCount);
					sameCount =1;
				}
			}
			if(sameCount>1)
				subArrays = computeSubSets(sameCount);
			System.out.println(subArrays+ arrayLeght);
			
		}
		
	}

	private static int computeSubSets(int n) {
		if (n ==1) return 0;
		if((n & 1) ==1 )
			return ((n-1)>>1) * n;
		else return ((n>>1) * (n-1));
	}

}
