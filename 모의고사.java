import java.util.ArrayList;

class Solution
{
    public static int[] solution(int[] answers)
    {
        int[] one = new int[]{1,2,3,4,5};
        int[] two = new int[]{2,1,2,3,2,4,2,5};
        int[] three = new int[]{3,3,1,1,2,2,4,4,5,5};
        int one_cnt = 0;
        int two_cnt = 0;
        int three_cnt = 0;
        List<Integer> list = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<answers.length; i++)
        {
            if(answers[i]==one[i%5])
            {
                one_cnt++;
            }
            if(answers[i]==two[i%8])
            {
                two_cnt++;
            }
            if(answers[i]==three[i%10])
            {
                three_cnt++;
            }
        }

        max = Math.max(max, one_cnt);
        max = Math.max(max, two_cnt);
        max = Math.max(max, three_cnt);
        
        if(max==one_cnt)
        {
            list.add(1);
        }
        if(max==two_cnt)
        {
            list.add(2);
        }
        if(max==three_cnt)
        {
            list.add(3);
        }
        
        int[] result = new int[list.size()];
        
        for(int i=0; i<list.size(); i++)
        {
            result[i] = list.get(i);
        }
        
        return result;
    }
}
