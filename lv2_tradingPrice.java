package lv2_20210515;

import java.util.ArrayList;

public class lv2_tradingPrice 
{
	public static int[] solution(int[] prices) 
	{
		int k = 0;
        int[] answer = new int[prices.length];

        /*
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<prices.length; i++)
        { 	
        	
        	list.add(prices[i]);
        }
        */
        
        for(int i=0; i<prices.length; i++)
        {	
        	k = 0;
        	
        	for(int j=i+1; j<prices.length; j++)
        	{
        		k++;
        		answer[i] = k;
        		
        		if(prices[i]>prices[j])
        		{
        			break;
        		}
        	}
        }
                        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		int[] prices = {1, 2, 3, 2, 3};
		int[] data = solution(prices);
		
		for(int d : data)
		{
			System.out.print(d + " ");
		}
	}
}