import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

class Solution
{
    public int[] solution(String msg)
    {
        int lastValue = 26; // 사전 초기값 중 최대값 설정
        String chk = ""; // 문자열 비교 임시변수
        
        Stack<String> s = new Stack<String>(); // 스택 선언
        HashMap<String, Integer> map = new HashMap<String, Integer>(); // 해시맵 선언
        ArrayList<Integer> list = new ArrayList<Integer>(); // 리스트 선언        
        
        // msg 문자열 스택에 삽입
        for(int i=0; i<msg.length(); i++)
        {
            s.add(msg.charAt(msg.length()-1-i)+"");
        }
        
        // LZW 알고리즘 사전 초기화(1번)
        for(int i=65; i<=90; i++)
        {
            map.put((char)i+"", i-64);
        }
        
        // LZW 알고리즘 실행(2~5번)
        while(!s.isEmpty())
        {
            chk = s.pop();
            
            // LZW 알고리즘 2, 3번(가장 긴 문자열 w 찾기)
            while(map.containsKey(chk))
            {
                // 예외처리
                if(s.size()==0)
                {
                    break;
                }
                if(map.containsKey(chk+s.peek()))
                {
                    chk += s.pop();
                }
                else
                {
                    break;
                }
            }
            
            // 결과값 배열 길이 선언을 위한 ArrayList에 값 add
            list.add(map.get(chk));
            
            // LZW 알고리즘 4, 5번
            if(!s.isEmpty())
            {
                if(!map.containsKey(chk+s.peek()))
                {
                    lastValue++;
                    map.put(chk+s.peek(), lastValue);
                }
            }
        }
        
        // 결과값 배열 설정
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
