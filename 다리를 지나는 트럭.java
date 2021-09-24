https://yoloaeee.tistory.com/115

=================================

import java.util.Arrays;

class Solution
{
    public static int returnWeight(int[] arr)
    {
        int sum = 0;
        int[] result = new int[2];
        
        for(int i=0; i<arr.length; i++)
        {
            // 다리에서 트럭이 있는 경우에만 무게 더하기
            if(arr[i]!=0)
            {
                sum += arr[i];
            }
        }
        
        return sum;
    }
    
    public int solution(int bridge_length, int weight, int[] truck_weights)
    {
        // 초기 배열 및 변수설정
        int cnt = 0;
        int[] bridge = new int[bridge_length];
        int[] temp_bridge = new int[bridge_length];
        int truck_index = 0;
        Arrays.fill(bridge, 0);
        Arrays.fill(temp_bridge, 0);

        while(truck_index!=truck_weights.length)
        {
            // 다리에 있는 트럭의 무게를 구한 후 밑의 로직에서 사용
            int sum = returnWeight(bridge);
            
            // 다리 배열 전체를 오른쪽으로 1 진행시키고, 마지막 트럭의 무게 빼주기
            sum -= bridge[bridge.length-1];
            System.arraycopy(bridge, 0, temp_bridge, 1, bridge.length-1);
            
            // 무게 여유가 있으면 새로운 트럭이 다리로 올라오고, 트럭 인덱스 증가
            if(sum+truck_weights[truck_index]<=weight)
            {
                temp_bridge[0] = truck_weights[truck_index];
                truck_index++;
            }
            // 무게 여유가 없으면 0으로 채우기
            else
            {
                temp_bridge[0] = 0;
            }
            
            System.arraycopy(temp_bridge, 0, bridge, 0, bridge.length);       
            cnt++;
        }
        
        return cnt+bridge_length;
    }
}
