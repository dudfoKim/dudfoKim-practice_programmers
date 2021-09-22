https://yoloaeee.tistory.com/110

================================================================
  
 class Solution
{
    public static int solution(int[] numbers)
    {
        int answer = 0;
        String find = "0";
        String input = "";
        
        // numbers배열 이어붙이기
        for(int d : numbers)
        {
         input += d;
        }
        
        while(true)
        {
         int cmp = Integer.parseInt(find);
        
            // 비교할 값이 10이면 종료
         if(cmp==10)
         {
         break;
         }
            // 비교할 값(find)가 비교대상(input)에 없으면 결과 리턴값에 +
         if(!input.contains(find))
         {
         answer += cmp;
         }
        
            // 배열 존재유무와 상관없이 비교할 값(find)는 무조건 +1
         cmp++;
         find = cmp + "";
        }
        
        return answer;
    }
}
