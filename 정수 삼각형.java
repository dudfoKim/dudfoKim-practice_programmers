https://yoloaeee.tistory.com/113

=================================



class Solution
{
    public int solution(int[][] triangle)
    {
        // 최대 크기로 dp배열 설정
        int[][] dp = new int[triangle.length][triangle[triangle.length-1].length];
        // 초기값 설정(배열 맨 위)
        dp[0][0] = triangle[0][0];
        
        for(int i=1; i<triangle.length; i++)
        {
            for(int j=0; j<triangle[i].length; j++)
            {
                // 각 줄의 맨 왼쪽일 경우 : 바로 윗 줄의 같은 인덱스 값만 선택
                if(j==0)
                {
                    dp[i][j] = triangle[i][j] + dp[i-1][j];
                }
                // 각 줄의 맨 왼쪽일 경우 : 바로 윗 줄의 인덱스-1한 값만 선택
                else if(j==triangle[i].length-1)
                {
                    dp[i][j] = triangle[i][j] + dp[i-1][j-1];
                }
                // 각 줄의 맨 오른쪽일 경우 : 바로 윗 줄의 같은 인덱스, 인덱스-1한 값 중 최대값을 선택
                else
                {
                    dp[i][j] = triangle[i][j] + Math.max(dp[i-1][j], dp[i-1][j-1]);
                }
            }
        }
        
        // 맨 마지막 줄에 대해 최대값을 비교한 후 출력
        int answer = Integer.MIN_VALUE;
        
        for(int j=0; j<dp[dp.length-1].length; j++)
        {
            answer = Math.max(dp[dp.length-1][j], answer);
        }
        
        return answer;
    }
}


