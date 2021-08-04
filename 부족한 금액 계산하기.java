class Solution
{
    public long solution(int price, int money, int count)
    {
        long charge = 0;
        
        for(int i=0; i<count; i++)
        {
            long temp = price*(i+1);
            charge += temp;
        }
        
        return charge>=money?charge-money:0;
    }
}
