class Solution
{
    public int solution(int[] absolutes, boolean[] signs)
    {
        int sum = 0;
        int temp = 0;
        boolean sign = true;
        
        for(int i=0; i<absolutes.length; i++)
        {
            temp = (signs[i]==true?1:-1) * absolutes[i];
            sum += temp;
        }
        
        return sum;
    }
}
