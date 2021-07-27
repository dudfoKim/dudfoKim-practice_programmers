import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        int answer = 0;
        boolean chk = true;
        String input = s;
        
        for(int i=0; i<input.length(); i++)
        {
            input = s.charAt(s.length()-1) + "";
            input += s.substring(0, s.length()-1);
            chk = true;
            
            for(int j=0; j<input.length(); j++)
            {
                if(input.charAt(j)=='(' || input.charAt(j)=='[' || input.charAt(j)=='{')
                {
                    stack.add(input.charAt(j));
                }
                else
                {
                    if(stack.size()==0)
                    {
                        chk = false;
                        break;
                    }
                    else
                    {
                        if(stack.peek()=='(' && input.charAt(j)==')')
                        {
                            stack.pop();
                        }
                        else if(stack.peek()=='[' && input.charAt(j)==']')
                        {
                            stack.pop();
                        }
                        else if(stack.peek()=='{' && input.charAt(j)=='}')
                        {
                            stack.pop();
                        }
                    }
                }
            }

            if(stack.isEmpty() && chk)
            {
                answer++;
            }
            
            s = input;
        }
        
        return answer;
    }
}
