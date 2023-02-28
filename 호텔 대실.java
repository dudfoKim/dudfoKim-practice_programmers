https://yoloaeee.tistory.com/295

=====================================
  
import java.util.Arrays;

class Solution
{
    public int solution(String[][] book_time)
    {
        int[] time = new int[24*60+1];
        
        for(int i=0; i<book_time.length; i++)
        {
            String[] start = book_time[i][0].split(":");
            String[] end = book_time[i][1].split(":");
            int stime = Integer.parseInt(start[0])*60 + Integer.parseInt(start[1]) + 1;
            int etime = Integer.parseInt(end[0])*60 + Integer.parseInt(end[1]) + 10;
            
            if(etime>24*60)
            {
                etime = 24*60;
            }
            
            for(int j=stime; j<=etime; j++)
            {
                time[j]++;
            }
        }
        
        Arrays.sort(time);
        return time[time.length-1];
    }
}
