https://yoloaeee.tistory.com/274

==========================================


import java.util.ArrayList;

class Solution
{
    public Object[] solution(String today, String[] terms, String[] privacies)
    {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        String[][] term = new String[terms.length][2];
        
        String[] t_temp = today.split("\\.");
        int t_year = Integer.parseInt(t_temp[0]);
        int t_month = Integer.parseInt(t_temp[1]);
        int t_day = Integer.parseInt(t_temp[2]);
        
        for(int i=0; i<terms.length; i++)
        {
            String[] temp = terms[i].split(" ");
            
            for(int j=0; j<2; j++)
            {
                term[i][j] = temp[j];
            }
        }
        for(int i=0; i<privacies.length; i++)
        {
            String[] temp = privacies[i].split(" ");
            String[] start = temp[0].split("\\.");
            int year = Integer.parseInt(start[0]);
            int month = Integer.parseInt(start[1]);
            int day = Integer.parseInt(start[2]);
            
            for(int j=0; j<terms.length; j++)
            {
                if(temp[1].equals(term[j][0]))
                {
                    month += Integer.parseInt(term[j][1]);
                    day--;
                    
                    if(month>12)
                    {
                        year += month/12;
                        month -= (12*(month/12));
                    }
                    if(day==0)
                    {
                        day = 28;
                        month--;
                    }
                    if(month==0)
                    {
                        month = 12;
                        year--;
                    }
                    
                    break;
                }
            }
            
            if(t_year>year)
            {
                answer.add(i+1);
            }
            else if(t_year==year)
            {
                if(t_month>month)
                {
                    answer.add(i+1);
                }
                else if(t_month==month)
                {
                    if(t_day>day)
                    {
                        answer.add(i+1);
                    }
                }
            }
        }
        
        return answer.toArray();
    }
}
