class Solution
{
    public int solution(int [][]board)
    {
        // DP배열 및 비교값 변수 선언
        int[][] square = new int[board.length+1][board[0].length+1];
        int max = Integer.MIN_VALUE;
        
        // DP배열 초기화(0으로 테두리 만들기)
        for(int i=0; i<board.length; i++)
        {
            square[i][0] = 0;
        }
        for(int i=0; i<board[0].length; i++)
        {
            square[0][i] = 0;
        }

        //  DP용 배열에 값 할당
        for(int i=1; i<=board.length; i++)
        {
            for(int j=1; j<=board[0].length; j++)
            {
                square[i][j] = board[i-1][j-1];
            }
        }
        
        //  0이 아닐 경우, square[i][j] = square[i-1][j-1], square[i][j-1], square[i-1][j]의 최소값+1
        for(int i=1; i<=board.length; i++)
        {
            for(int j=1; j<=board[0].length; j++)
            {
                if(square[i][j]!=0)
                {
                    square[i][j] = Math.min(Math.min(square[i-1][j-1], square[i-1][j]), square[i][j-1])+1;
                    max = Math.max(max, square[i][j]);
                }
            }
        }
        
        // 모든 값이 0일 경우에는 강제로 0 리턴
        return max==Integer.MIN_VALUE?0:(int)Math.pow(max,2);
    }
}
