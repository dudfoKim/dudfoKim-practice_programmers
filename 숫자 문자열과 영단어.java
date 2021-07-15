class Solution 
{
    public int solution(String s) 
    {
        String[] find = new String[]{"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = new String[10];
        
        for(int i=0; i<10; i++)
        {
            num[i] = i + "";
        }
        
        for(int i=0; i<find.length; i++)
        {
            if(s.contains(find[i]))
            {
                s = s.replace(find[i], num[i]);
            }
        }
        
        return Integer.parseInt(s);
    }
}
