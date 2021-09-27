https://yoloaeee.tistory.com/118

=============================================

import java.util.Arrays;

class Solution
{
    public int solution(int[][] sizes)
    {
        int[] big = new int[sizes.length];
        int[] small = new int[sizes.length];
        
        // 큰 값은 big에, 작은 값은 small에 넣기
        for(int i=0; i<sizes.length; i++)
        {
            big[i] = Math.max(sizes[i][0], sizes[i][1]);
            small[i] = Math.min(sizes[i][0], sizes[i][1]);
        }
        
        // 정렬 후 최대값끼리 곱한 값을 출력
        Arrays.sort(big);
        Arrays.sort(small);
        
        return big[big.length-1] * small[small.length-1];
    }
}
