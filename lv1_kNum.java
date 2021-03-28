package lv1_20210326;

import java.util.Arrays;

public class lv1_kNum 
{
	public static int[] solution(int[] array, int[][] commands)
	{
		int[] answer = new int[commands.length];
		int[] temp;
		
		for(int i=0; i<commands.length; i++)
		{
			temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2]-1];
		}
		
		return answer;
	}

	public static void main(String[] args) 
	{
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] result = solution(array, commands);
	}
}