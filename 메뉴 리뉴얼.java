https://yoloaeee.tistory.com/178

====================================

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Solution
{
    // 입력받은 요리 메뉴들에 대한 순열 생성
    public static void makeMenu(HashMap<String, Integer> map, boolean[] visit, String order, ArrayList<Character> value, int lastIndex, int length)
    {
        if(value.size()==length)
        {
            // 정렬을 위한 ArrayList 및 기타 sort
            ArrayList<Character> key = (ArrayList<Character>)value.clone();
            Collections.sort(key);
            String input = "";
            
            for(char c : key)
            {
                input += c;
            }
            // Map에 음식 조합(key) + 주문된 횟수(value)로 삽입
            if(map.containsKey(input))
            {
                map.put(input, map.get(input)+1);
            }
            else
            {
                map.put(input, 1);
            }
            
            return;
        }
        
        for(int i=lastIndex; i<order.length(); i++)
        {
            if(!visit[i])
            {
                visit[i] = true;
                value.add(order.charAt(i));
                makeMenu(map, visit, order, value, i, length);
                value.remove(value.size()-1);
                visit[i] = false;
            }
        }
    }
    public String[] solution(String[] orders, int[] course)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> result = new ArrayList<String>();
        
        // 입력받은 주문내역(orders)에 대해 코스요리 가짓수(course)를 기준으로 각각 조합 생성(makeMenu 호출) 
        for(int i=0; i<orders.length; i++)
        {
            for(int j=0; j<course.length; j++)
            {
                boolean[] visit = new boolean[orders[i].length()];
                ArrayList<Character> value = new ArrayList<Character>();
                makeMenu(map, visit, orders[i], value, 0, course[j]);
            }
        }
        
        // 첫번째 정렬 : 주문횟수 내림차순-주문메뉴 오름차순
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
           @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
            {
                if(o1.getValue()!=o2.getValue())
                {
                    return o2.getValue()-o1.getValue();
                }
                else
                {
                    return o1.getKey().compareTo(o2.getKey());
                }
            }
        });
        
        // 주문횟수가 2 미만인 내역은 고려 대상(list)에서 전체 삭제
        int delete = -1;
        
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getValue()<2)
            {
                delete = i;
                break;
            }
        }
        
        list = list.subList(0, delete);
        
        // 두번째 정렬 : 주문메뉴의 길이 오름차순-주문횟수 내림차순
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
           @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
            {
                if(o1.getKey().length()!=o2.getKey().length())
                {
                    return o1.getKey().length()-o2.getKey().length();
                }
                else
                {
                    return o2.getValue()-o1.getValue();
                }
            }
        });
        
        // 각 코스요리 갯수에 대해 주문 최대값을 구한 후, 동일한 주문내역은 전부 결과리스트(result)에 삽입
        for(int j=0; j<course.length; j++)
        {
            int max = Integer.MIN_VALUE;
            
            for(int i=0; i<list.size(); i++)
            {
                if(list.get(i).getValue()>=max && list.get(i).getKey().length()==course[j])
                {
                    max = list.get(i).getValue();
                    result.add(list.get(i).getKey());
                }
            }
        }
        
        // 조건을 만족하는 주문내역 조합 전체에 대해 정렬한 후 결과출력
        Collections.sort(result);
        
        String[] answer = new String[result.size()];
        
        for(int i=0; i<result.size(); i++)
        {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
