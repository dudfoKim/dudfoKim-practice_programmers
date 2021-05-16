package lv2_20210516;

import java.util.Arrays;

public class lv2_hIndex 
{
	public static int solution(int[] citations) 
	{
        int answer = 0;
        int hCnt = 0;
        int num = citations.length;
        Arrays.sort(citations);
        
       	for(int i=num; i>=0; i--)
    	{	
       		hCnt = 0;
       		
	        for(int j=citations.length-1; j>=0; j--)
	        {
		    	if(i<=citations[j])
		    	{
		    		hCnt++;
		    	}
	        }
	        
	        if(hCnt>=i)
	        {
	        	answer = i;
	        	break;
	        }
		}
       	
        return answer;
    }
	
	public static void main(String[] args) 
	{
		int[] citations = {3, 0, 6, 1, 5};
		System.out.println(solution(citations));
		
		int[] citations1 = {0, 1, 1};
		System.out.println(solution(citations1));

		int[] citations2 = {1, 4};
		System.out.println(solution(citations2));
	}
}