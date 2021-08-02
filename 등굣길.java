class Solution
{
    public int solution(int m, int n, int[][] puddles)
    {
        int[][] arr = new int[n+1][m+1];
        arr[1][1] = 1;

        for(int i=0; i<puddles.length; i++)
        {
            arr[puddles[i][1]][puddles[i][0]] = -1;
        }
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                if(arr[i][j]==-1)
                {
                    continue;
                }
                if(arr[i-1][j]>0 && i-1>0)
                {
                    arr[i][j] += (arr[i-1][j])%1000000007;
                }
                if(arr[i][j-1]>0 && j-1>0)
                {
                    arr[i][j] += (arr[i][j-1])%1000000007;
                }
            }
        }
        
        return (arr[n][m])%1000000007;
    }
}
