package lv2_20210507;

import java.util.Arrays;

public class lv2_lifeboat 
{
	public static int solution(int[] people, int limit)
    {
        int answer = 0;
        int index = 0;
        
        Arrays.sort(people);
        
        for(int i=people.length-1; i>=index; i--)
        {
            if(people[index]+people[i]>limit)
            {
                answer++;
            }
            else
            {
                index++;
                answer++;
            }
        }
        
        return answer;
    }
	public static void main(String[] args) 
	{
		int[] people = new int[]{70, 80, 50};
		System.out.println(solution(people, 100));
	}
}