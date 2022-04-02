https://yoloaeee.tistory.com/230

========================================================
  
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Solution
{
     public static int[] solution(String[] id_list, String[] report, int k)
     {
         // 1. 입력값 처리 및 변수 초기화
         HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
         int[] answer = new int[id_list.length];
         String singo = "";
         String daesang = "";
    
         // 2. 중복값 제거
         for(int i=0; i<report.length; i++)
         {
              set.add(report[i]);
         }
        
         // 3. 신고대상 ID별 신고한 ID 처리
         String[] input = (String[]) set.toArray(new String[0]);
        
         for(int i=0; i<input.length; i++)
         {
              String[] temp = input[i].split(" ");
              singo = temp[1];
              daesang = temp[0];
              ArrayList<String> newValue = new ArrayList<String>();
        
              if(map.containsKey(singo))
              {
                   newValue = map.get(singo);
              }
        
              newValue.add(daesang);
              map.put(singo, newValue);
          }
        
          Object[] result = map.entrySet().toArray();
        
          // 4. id_list와 신고한 ID를 비교해서 결과값 출력
          for(int i=0; i<result.length; i++)
          {
               String singoPerson = result[i].toString().split("=")[0];
               String[] people = result[i].toString().split("=")[1].replace("[","").replace("]","").split(", ");

               if(people.length>=k)
               {
                    for(int j=0; j<people.length; j++)
                    {
                         for(int m=0; m<id_list.length; m++)
                         {
                              if(people[j].equals(id_list[m]))
                              {
                                   answer[m]++;
                              }
                         }
                    }
               }
          }
        
          return answer;
     }
}
