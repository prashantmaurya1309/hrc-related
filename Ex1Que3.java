//3. Find duplicate elements in an array with a program


package com.hrc.exercise;



public class Ex1Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = new int[] {1,3,5,7,2,4,7,1};
		System.out.println("duplicates element in arr");
		
		for (int i = 0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i] == ar[j])
					System.out.println(ar[j]);
			}
		}

}
}
