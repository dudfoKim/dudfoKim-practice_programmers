package lv1_20210325;

public class lv1_arrayPlus 
{
	public static int[][] solution(int[][] a, int[][] b)
	{
		int[][] result = new int[a.length][a[0].length];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return result;
	}

	public static void main(String[] args) 
	{
		int[][] input1 = {{1,2},{2,3}};
		int[][] input2 = {{3,4},{5,6}};
		int[][] result = new int[input1.length][input1[0].length];
		
		result = solution(input1, input2);
		
		for(int i=0; i<result.length; i++)
		{
			for(int j=0; j<result[i].length; j++)
			{
				System.out.print(result[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}