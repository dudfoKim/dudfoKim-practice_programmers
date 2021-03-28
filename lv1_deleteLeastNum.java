package lv1_20210324;

public class lv1_deleteLeastNum
{
	public static int[] solution(int[] arr) 
    {
        int[] answer = {};
        int length = arr.length;
        
        if(arr.length==1)
        {
            answer = new int[1];
            answer[0] = -1;
            
            return answer;
        }
        else
        {
            int[] temp = new int[arr.length-1];
            int index = 0;
            int min = Integer.MAX_VALUE;
            int j = 0;
            
            for(int i=0; i<length; i++)
            {
                if(arr[i]<min)
                {
                    min = arr[i];
                    index = i;
                }
            }
            
            for(int i=0; i<length; i++)
            {
                if(i!=index)
                {
                    temp[j] = arr[i];
                    j++;
                }
            }
            
            answer = temp;

            return answer;
        }
    }
	
	public static void main(String[] args) 
	{
		int[] input = {2,3,4,5,1};
		int[] result;
		
		result = solution(input);
		
		for(int temp : result)
		{
			System.out.print(temp + " ");
		}
	}
}
