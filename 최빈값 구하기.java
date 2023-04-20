https://yoloaeee.tistory.com/336

=================================

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution
{
    public static int solution(int[] array)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        int index = 0;
        
        for(int i=0; i<array.length; i++)
        {
            if(!map.containsKey(array[i]))
            {
                map.put(array[i], 1);
            }
            else
            {
                map.put(array[i], map.get(array[i])+1);
            }
        }
        
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>()
        {
                @Override
                public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2)
                {
                        return o2.getValue()-o1.getValue();
                }        
        });
        
        if(list.size()==1)
        {
         return list.get(0).getKey();
        }
        else
        {
         return list.get(0).getValue()!=list.get(1).getValue()?list.get(0).getKey():-1;
        }
    }
}
