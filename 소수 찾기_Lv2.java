https://yoloaeee.tistory.com/75

-----------------------------------------------------------------------

import java.util.HashSet;

class Solution
{
    // 순열 중 중복제거
    static HashSet<String> set = new HashSet<String>();
 
    // 중복을 비허용하는 순열 구하기
    public static void makeNum(String number, String result, boolean[] visit, int depth, int n, int r)
    {
        String add = "";
        
        if(depth==r)
        {
            return;
        }
        
        for(int i=0; i<number.length(); i++)
        {
            if(!visit[i])
            {
                visit[i] = true;
                add = result + number.charAt(i);
                
                if(add.charAt(0)!='0')
                {
                    set.add(add);
                }
                
                makeNum(number, add, visit, depth+1, n, r);
                visit[i] = false;
            }
        }
    }
    
    public int solution(String numbers)
    {
        int answer = 0; // 결과
        
        // 순열에 사용하는 변수 설정
        boolean[] visit = new boolean[numbers.length()]; 
        int n = numbers.length();
        
        // 순열 구한 후, set을 array 형태로 변환
        makeNum(numbers, "", visit, 0, n, n);
        Object[] arr = set.toArray();
        
        // 순열 중 숫자골라서 소수구하기        
        for(int i=0; i<arr.length; i++)
        {
            int chk = Integer.valueOf((String)arr[i]);
            
            // 1은 소수에서 제외
            if(chk==1)
            {
                continue;
            }
            
            boolean isPrime = true;
            
            // 나눠떨어질 경우 바로 break
            for(int j=2; j*j<=chk; j++)
            {
                if(chk%j==0)
                {
                    isPrime = false;
                    break;
                }
            }
            
            // 결과값 카운트
            if(isPrime)
            {
                answer++;
            }
        }
        
        return answer;
    }
}
