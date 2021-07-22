class Solution
{
    public int[] solution(int brown, int yellow)
    {
        int[] answer = new int[2];
        int matrix = brown + yellow;
        
        for(int i=1; i<matrix; i++)
        {
            int width = matrix/i;
            int heigth = matrix/width;
            
            if(((width-2)*(heigth-2)) == yellow && width >= heigth)
            {
                answer[0] = width;
                answer[1] = heigth;
                return answer;
            }
        }
        
        return answer;
    }
}
