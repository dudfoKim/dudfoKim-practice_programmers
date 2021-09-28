https://yoloaeee.tistory.com/120

=============================================

import java.util.Arrays;

public class Solution
{
     // 정방향, 역방향 인덱스 기준으로 바뀐 글자가 있는 지 확인
     public static int[] searchIndex(boolean[] arr, int start)
     {
         int forward = 0;
         int backward = 0;

         // 앞에서부터 확인
         for(int i=start; i<arr.length; i++)
         {
             if(!arr[i])
             {
                 forward = i;
                 break;
             }
         }
         // 뒤에서부터 확인
         for(int i=arr.length-1; i>=0; i--)
         {
             if(!arr[i])
             {
                 backward = i;
                 break;
             }
         }

         return new int[] {forward, backward};
     }
     public static int solution(String name)
    {
         if(name.length()==1)
         {
             return Math.min(name.charAt(0)-'A', 'A'-name.charAt(0)+26);
         }

         int answer = 0;
         int now_index = 0;
         final char a = 'A';

         // A가 아닌 글자찾아서 배열 설정
         boolean[] isChange = new boolean[name.length()];
         Arrays.fill(isChange, false);

         for(int i=0; i<name.length(); i++)
         {
             if(name.charAt(i)=='A')
             {
                 isChange[i] = true; 
             }
         }

         while(true)
         {
              int forward = searchIndex(isChange, now_index)[0];
              int backward = searchIndex(isChange, now_index)[1];

              // 모든 글자가 바뀔 떄까지 반복
              if(forward+backward==0)
              {
                   break;
              }

              // case 1 : → 방향으로 갈 때
              if(forward>=now_index && forward-now_index<=now_index+name.length()-backward)
              {
                   answer += Math.abs(forward-now_index);
                   now_index = forward;
              }
              // case 2 : ← 방향으로 갈 때
              else
              {
                   if(backward<now_index) // case 2-1 : 단순 오른쪽에서 왼쪽으로
                   {
                        answer += Math.abs(now_index-backward);
                   }
                   else // case 2-2 : 맨 왼쪽에서 오른쪽으로
                   {
                        answer += Math.abs(now_index+name.length()-backward);
                   }

                   now_index = backward;
              }

              // 글자를 바꿀 인덱스를 찾은 후, 변경
              char input_char = name.charAt(now_index);

              // 'Z'-'A' => 'A-'Z'+26인 반대로 뺄 때
              if(input_char-a>a-input_char+26)
              {
                   answer +=  a-input_char+26;
              }
              // 'B'-'A'처럼 일반적인 상황
              else
              {
                   answer += input_char-a;
              }

              isChange[now_index] = true;
        }

        return answer;
    }
}
