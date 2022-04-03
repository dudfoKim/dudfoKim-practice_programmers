https://yoloaeee.tistory.com/231

==========================================
  
import java.util.HashMap;
import java.util.TreeMap;

class Solution
{
     public static int calcCharge(int minute, int[] fees)
     {
         double result = 0;

         if(minute<fees[0])
         {
              return fees[1];
         }

         result = Math.ceil((double)(minute-fees[0])/fees[2]);
         return (int) (result*fees[3]) + fees[1];
     }
     public static int calcTime(int beforeH, int beforeM, int afterH, int afterM)
     {
         int hour = afterH-beforeH;
         int minute = (afterM-beforeM) + 60;

         if(minute<60)
         {
              hour--;
         }
         else
         {
              minute -= 60;
         }

         return (hour*60) + minute;
     }
     public static int[] solution(int[] fees, String[] records)
     {
         HashMap<String, String> map = new HashMap<String, String>(); // key(car), value(in time)
         TreeMap<String, Integer> result = new TreeMap<String, Integer>(); // key(car), value(minute)
         int calcTime = 0;
        
         for(int i=0; i<records.length; i++)
         {
              String[] input = records[i].split(" ");
        
              if(input[2].equals("IN")) // 입차될 때
              {
                   map.put(input[1], input[0]);
              }
              else // 출차될 때
              {
                   String[] before = map.get(input[1]).split(":");
                   String[] after = input[0].split(":");
                                             calcTime = calcTime(Integer.parseInt(before[0]), Integer.parseInt(before[1]), Integer.parseInt(after[0]), Integer.parseInt(after[1]));
                   map.remove(input[1]);
        
                   if(result.containsKey(input[1])) // 기존에 이미 출차된 차일때
                   {
                        result.put(input[1], result.get(input[1])+calcTime);
                   }
                   else // 처음 출차될 때
                   {
                        result.put(input[1], calcTime);
                   }
              }
         }
        
         // 출차가 안된 차량이 있을 경우 나머지 계산처리
         Object[] last = map.entrySet().toArray(new Object[0]);
        
         for(int i=0; i<last.length; i++)
         {
              String[] temp = last[i].toString().split("=");
              String[] time = temp[1].split(":");
              calcTime = calcTime(Integer.parseInt(time[0]), Integer.parseInt(time[1]), 23, 59);
            
              // 이미 결과 Map에 들어가있을 경우
              if(result.containsKey(temp[0]))
              {
                   result.put(temp[0], result.get(temp[0]) + calcTime);
              }
              // 차량이 결과 Map에 안들어가 있고, 출차되지 않을 경우(예외처리)
              else
              {
                   result.put(temp[0], calcTime);
              }
         }
        
         Integer[] time = result.values().toArray(new Integer[0]);
         int[] answer = new int[time.length];
        
         for(int i=0; i<time.length; i++)
         {
              answer[i] = calcCharge(time[i], fees);
         }
        
         return answer;
    }
}
