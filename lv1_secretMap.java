package lv1_20210329;

import java.util.*;

//프로그래머스 레벨1 비밀지도
public class lv1_secretMap 
{
	public static String[] solution(int n, int[] arr1, int[] arr2) 
    {
        String[] answer = new String[n];
        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];
        int j = 0;
        int k = 0;
        
        for(int i=0; i<n; i++)
        {
            j = 0;
            k = 0;
            
            while(arr1[i]!=0)
            {
                map1[i][n-j-1] = arr1[i]%2;
                arr1[i] /= 2;
                j++;
            }
            while(arr2[i]!=0)
            {
                map2[i][n-k-1] = arr2[i]%2;
                arr2[i] /= 2;
                k++;
            }
        }
        
        for(int i=0; i<n; i++)
        {
            answer[i] = "";
            
            for(j=0; j<n; j++)
            {
                if(map1[i][j]+map2[i][j]>=1)
                {
                    answer[i] += "#";
                }
                else
                {
                    answer[i] += " ";
                }
            }
        }
        
        return answer;
    }

	public static void main(String[] args) 
	{
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		String[] result = solution(6, arr1, arr2);

		for(String temp : result)
		{
			System.out.println(temp);
		}
	}
}