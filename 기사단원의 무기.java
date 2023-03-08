https://yoloaeee.tistory.com/304

====================================
import java.util.Arrays;

class Solution
{
    public int solution(int number, int limit, int power)
    {
        int answer = 0;
        int[] arr = new int[number+1];
        
        for(int i=1; i<=number; i++)
        {
            arr[i]++; // => 새로 추가
            
            for(int j=1; j<=i/2; j++) // for(int j=1; j<=i; j++) => 시간초과 발생
            {
                if(i%j==0)
                {
                    arr[i]++;
                }
            }
        }
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>limit)
            {
                answer += power;
            }
            else
            {
                answer += arr[i];
            }
        }
        
        return answer;
    }
}
