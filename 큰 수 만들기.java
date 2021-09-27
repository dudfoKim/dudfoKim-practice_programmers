https://yoloaeee.tistory.com/117

===================================

import java.util.Arrays;

class Solution
{
    public String solution(String number, int k)
    {
        // 예외 : 문자 그대로 출력
        if(number.length()==1)
        {
            return number;
        }
        
        StringBuilder sb = new StringBuilder(); // 결과 출력 및 시간초과 방지용
        int window = number.length()-k; // sliding window 크기
        int max = Integer.MIN_VALUE; // 최대값 비교
        int max_index = 0; // 다음 반복문의 sliding window 시작 인덱스
        
        for(int i=0; i<window; i++)
        {
            max = Integer.MIN_VALUE;
            
            for(int j=max_index; j<=k+i; j++)
            {
                // window 내의 최대값과 최대값에 대한 인덱스를 계속 업데이트
                if(number.charAt(j)-'0'>max)
                {
                    max = number.charAt(j)-'0';
                    max_index = j+1;
                }
            }
            
            sb.append(max);
        }
        
        return sb.toString();
    }
}
