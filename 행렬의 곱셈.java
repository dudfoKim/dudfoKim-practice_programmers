class Solution
{
    public int[][] solution(int[][] arr1, int[][] arr2)
    {
        int x = arr1.length; // x*y
        int n = arr2[0].length; // y*n
        int[][] answer = new int[x][n]; // x*n
        
        for(int i=0; i<x; i++)
        {
            for(int k=0; k<n; k++)
            {
                int temp = 0;
                
                for(int j=0; j<arr1[0].length; j++)
                {
                    temp += arr1[i][j] * arr2[j][k];
                }
                
                answer[i][k] = temp;
            }
        }
            
        return answer;
    }
}
