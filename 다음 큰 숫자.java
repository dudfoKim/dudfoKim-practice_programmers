class Solution

{

    public int solution(int n) 

    {

        int origin_cnt = Integer.bitCount(n);

        int cnt = 0;

        int num = n;

        

        while(origin_cnt!=cnt)

        {

            num++;

            cnt = Integer.bitCount(num);

        }

        

        return num;

    }

}
