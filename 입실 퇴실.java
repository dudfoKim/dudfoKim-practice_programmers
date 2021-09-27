https://yoloaeee.tistory.com/119

================================================================
  
  
  import java.util.LinkedList;
import java.util.Queue;

class Solution
{
    // 사람이 나갈 때 몇 명과 마주쳤는지 계산
    public static int isIn(int[] arr)
    {
        int cnt = 0;
        
        for(int d : arr)
        {
            if(d!=0)
            {
                cnt++;
            }
        }
        
        return cnt;
    }
    
    public int[] solution(int[] enter, int[] leave)
    {
        // 예외 : 한 명만 있을 때
        if(enter.length==1)
        {
            return new int[]{0};
        }
        
        // 사람 수만큼 2차원 배열생성
        int[][] room = new int[enter.length][enter.length];
        // 결과 출력용 배열
        int[] arr = new int[enter.length];
        // 루프 종료조건(들어온 횟수+나간횟수)
        int total_cnt = 0;
        
        // 들어온 사람과 나간 사람을 따로 queue로 사용
        Queue<Integer> in = new LinkedList<Integer>();
        Queue<Integer> out = new LinkedList<Integer>();
        
        for(int d : enter)
        {
            in.add(d);
        }
        for(int d : leave)
        {
            out.add(d);
        }
        
        // 들어온 횟수+나간 횟수가 아래 처리한 횟수와 동일할 때까지 루프
        while(total_cnt!=enter.length+leave.length)
        {
            int index = 0;
            
            // 나간 사람을 우선처리(나갈 사람이 큐와 방 안에 있을 때만 퇴장처리 가능)
            while(!out.isEmpty() && room[out.peek()-1][out.peek()-1]!=0)
            {
                // 인덱스 계산 후, 퇴장한 사람을 방에서 없애주는 처리를 한 후 몇 명과 만났는 지 isIn 메소드를 사용해 계산 후 출력 
                index = out.poll()-1;
                room[index][index]--;
                arr[index] = isIn(room[index]);
                total_cnt++;
            }
            // 나갈 사람이 없고, 들어올 사람이 남아있으면 로직 처리
            if(!in.isEmpty())
            {
                // 인덱스 계산 후, 방에 들어왔다는 표시처리 후 현재 방에 있는 사람들에 대해서 연결
                index = in.poll()-1;
                room[index][index] = 1;
                total_cnt++;
                
                for(int i=0; i<enter.length; i++)
                {
                    if(room[i][i]==1)
                    {
                        room[i][index] = 1;
                        room[index][i] = 1;
                    }
                }
            }
        }
        
        return arr;
    }
}
