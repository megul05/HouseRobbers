package HouseRobbers;

import java.util.*;

public class HouseRobbers {
	
	public static int robber(int[] arr)
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2 == 0)
			{
				res = res + arr[i];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}
		int result = robber(arr);
		System.out.println(result);
	}

}
