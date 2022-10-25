https://yoloaeee.tistory.com/269

========================================
  
class Solution
{
    public int solution(int n)
    {
        int num = 1;
        int[] arr = new int[100+1];
        
        for(int i=1; i<=100; i++)
        {
            while(num%3==0 || (num+"").contains("3"))
            {
                num++;
            }
            
            arr[i-1] = num;
            num++;
        }

        return arr[n-1];
    }
}
