https://yoloaeee.tistory.com/manage/posts/

===============================================

import java.util.TreeSet;

class Solution
{
    public static void make(int[] arr, int max, int len, TreeSet<Integer> set)
	{
		for(int i=0; i<len; i++)
		{
			int temp = arr[i];
			
			if(max==1)
			{
				set.add(temp);
			}
			else
			{
				int index = i+1;
				int cnt = 1;
				
				while(max!=cnt)
				{
					if(index>=len)
					{
						index = 0;
					}
					
					temp += arr[index];		
					cnt++;			
					index++;
				}
				
				set.add(temp);			
			}
		}
	}
	public static int solution(int[] elements)
	{
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for(int i=1; i<=elements.length; i++)
		{
			make(elements, i, elements.length, set);
		}

        return set.size();
    }
}
