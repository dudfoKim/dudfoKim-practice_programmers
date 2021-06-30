import java.util.*;

class Solution {
    public static double distance(int[] now, int mokpyo[])
    {
        //return (double)Math.sqrt(Math.pow(now[0]-mokpyo[0],2)+Math.pow(now[1]-mokpyo[1],2));
        return Math.abs(now[0]-mokpyo[0]) + Math.abs(now[1]-mokpyo[1]);
    }
    
    public static String solution(int[] numbers, String hand) 
    {
        String answer = "";
        int japi = hand.equals("right")?1:0;
        int[][] keyboard = new int[][]{{1,2,3},{4,5,6},{7,8,9},{0,0,0}};
        int[] rightH = new int[]{3,2};
        int[] leftH = new int[]{3,0};
        int[] now = new int[2];
        int temp = 0;
        
        for(int i=0; i<numbers.length; i++)
        {
            temp = numbers[i];
            
            if(temp==1 || temp==4 || temp==7)
            {
                for(int j=0; j<3; j++)
                {
                    if(temp==keyboard[j][0])
                    {
                        answer += "L";
                        leftH[0] = j;
                        leftH[1] = 0;
                        now[0] = j;
                        now[1] = 0;
                        
                        break;
                    }
                }
            }
            else if(temp==3 || temp==6 || temp==9)
            {
                for(int j=0; j<3; j++)
                {
                    if(temp==keyboard[j][2])
                    {
                        answer += "R";
                        rightH[0] = j;
                        rightH[1] = 2;
                        now[0] = j;
                        now[1] = 2;
                        
                        break;
                    }
                }
            }
            else
            {
                for(int j=0; j<4; j++)
                {
                    if(temp==keyboard[j][1])
                    {
                        now[0] = j;
                        now[1] = 1;
                        
                        if(distance(now, leftH)>distance(now, rightH))
                        {
                            answer += "R";
                            rightH[0] = j;
                            rightH[1] = 1;
                        }
                        else if(distance(now, leftH)<distance(now, rightH))
                        {
                            answer += "L";
                            leftH[0] = j;
                            leftH[1] = 1;
                        }
                        else
                        {
                            if(japi==0)
                            {
                                answer += "L";
                                leftH[0] = j;
                                leftH[1] = 1;
                            }
                            else
                            {
                                answer += "R";
                                rightH[0] = j;
                                rightH[1] = 1;
                            }
                        }
                        
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}
