class Solution
{
    public int f(int[] numbers, int index, int target, int sum)
    {
        if(index==numbers.length)
        {
            return (sum==target)?1:0;
        }
        else
        {
            return f(numbers, index+1, target, sum+numbers[index]) + f(numbers, index+1, target, sum-numbers[index]);
        }
    }
    
    public int solution(int[] numbers, int target)
    {
        int answer = f(numbers, 0, target, 0);
        
        return answer;
    }
}
