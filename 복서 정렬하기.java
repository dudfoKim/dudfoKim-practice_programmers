https://yoloaeee.tistory.com/108

==============================================
  
  import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution
{
    // 선수데이터를 나타내는 클래스 선언
    public static class player
    {
        double win; // 승률
        int weightWin; // 나보다 몸무게가 무거운 복서를 이긴 횟수
        int weight; // 몸무게
        int num; // 선수번호

        player(double win, int weightWin, int weight, int num)
        {
            this.win = win;
            this.weightWin = weightWin;
            this.weight = weight;
            this.num = num;
        }
    }
    public static int[] solution(int[] weights, String[] head2head)
    {
        ArrayList<player> list = new ArrayList<player>();
        
        // 데이터 전처리
        for(int i=0; i<head2head.length; i++)
        {
           int num = i+1;
           int myWeight = weights[i];
           int win = 0;
           int weightWin = 0;
           int cnt = 0;
        
          for(int j=0; j<head2head[0].length(); j++)
          {
           // N이 아닌 경우에는 경기 수로 +
          if(head2head[i].charAt(j)!='N')
          {
               cnt++;
          }
          // W일 경우에는 이긴 경기 수로 +
          if(head2head[i].charAt(j)=='W')
          {
               win++;
        
               // 이긴 경기 중, 해당 선수 몸무게가 나보다 클 경우 weightWin +
               if(weights[j]>myWeight)
               {
               weightWin++;
               }
          }
        }
        
            // 예외처리 : 해당 선수가 모두 경기를 하지 않는 N이거나, 이긴 경우가 없을때 
           if(cnt==0 || win==0)
           {
                list.add(new player(0, weightWin, myWeight, num));
           }
           else
           {
                list.add(new player((double)win/cnt, weightWin, myWeight, num));
           }
        }
        
        // 조건에 맞는 정렬
        Collections.sort(list, new Comparator<player>()
        {
           @Override
           public int compare(player x, player y)
           {
                // 조건순위 1 : 승률 비교
                if(x.win!=y.win)
                {
                     return Double.compare(y.win, x.win);
                }
                else
                {
                    // 조건순위 2 : 나보다 몸무게가 많은 선수를 이긴횟수
                    if(x.weightWin!=y.weightWin)
                    {
                        return Integer.compare(y.weightWin, x.weightWin);
                    }
                    else
                    {
                        // 조건순위 3 : 몸무게
                        if(x.weight!=y.weight)
                        {
                            return Integer.compare(y.weight, x.weight);
                        }
                        else
                        {
                            // 조건순위 4 : 선수번호
                             return Integer.compare(x.num, y.num);
                        }
                    }
               }
           }
        });
        
        // 결과배열을 선언하고 선수번호를 넣어서 출력
        int[] result = new int[list.size()];
        
        for(int i=0; i<list.size(); i++)
        {
         result[i] = list.get(i).num;
        }
        
        return result;
    }
}
