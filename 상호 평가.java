class Solution
{
    public String solution(int[][] scores)
    {
        String answer = "";
        int n = scores.length;
        int[] score = new int[n];
        
        for(int i=0; i<n; i++)
        {
            int sum = 0;
            int num = 0;
            int myScore = scores[i][i];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            boolean same = false;
            
            for(int j=0; j<n; j++)
            {
                sum += scores[j][i];
                num++;
                min = Math.min(min, scores[j][i]);
                max = Math.max(max, scores[j][i]);
                
                if(i!=j && myScore==scores[j][i])
                {
                    same = true;
                }
            }
            
            if((min==myScore && !same) || (max==myScore && !same))
            {
                System.out.println("ÀÌ°Ô Àüµ¥¿ë");
                sum -= myScore;
                num--;
            }
            
            score[i] = sum/num;
        }
                
        for(int i=0; i<n; i++)
        {
            if(score[i]>=90)
            {
                answer += "A";
            }
            else if(score[i]>=80)
            {
                answer += "B";
            }
            else if(score[i]>=70)
            {
                answer += "C";
            }
            else if(score[i]>=50)
            {
                answer += "D";
            }
            else
            {
                answer += "F";
            }
        }
        
        return answer;
    }
}
