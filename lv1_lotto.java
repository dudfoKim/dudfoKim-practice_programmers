package lv1_20210503;

class Solution 
{
    public static int[] solution(int[] lottos, int[] win_nums) 
    {
        int[] answer = new int[2];
        int max_cnt = 0;
        int min_cnt = 0;
        int zero_cnt = 0;
        
        for(int i=0; i<lottos.length; i++)
        {
            if(lottos[i]==0)
            {
                zero_cnt++;
            }
            for(int j=0; j<win_nums.length; j++)
            {
                if(lottos[i]==win_nums[j])
                {
                    min_cnt++;
                }
            }
        }
        
        max_cnt = min_cnt + zero_cnt;
        answer[0] = max_cnt;
        answer[1] = min_cnt;
        
        for(int i=0; i<answer.length; i++)
        {
            if(answer[i]>=2)
            {
                answer[i] = 7 - answer[i];
            }
            else
            {
                answer[i] = 6;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args)
    {
    	int[] lottos = {44, 1, 0, 0, 31, 25};
    	int[] win_nums = {31, 10, 45, 1, 6, 19};
    	int[] result = solution(lottos, win_nums);
    	
    	for(int data : result)
    	{
    		System.out.print(data + " ");
    	}
    }
}