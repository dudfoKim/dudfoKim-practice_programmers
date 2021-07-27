class Solution
{
    public int choiso(int a, int b)
    {
        int temp = 0;
        int originA = a;
        int originB = b;
        
        while(b!=0)
        {
            temp = a;
            a = b;
            b = temp%b;
        }
        
        return (originA*originB)/a ;
    }
    public int solution(int[] arr)
    {
        int answer = choiso(arr[0], arr[1]);
        
        for(int i=2; i<arr.length; i++)
        {
            answer = choiso(answer, arr[i]);
        }
        
        return answer;
    }
}
