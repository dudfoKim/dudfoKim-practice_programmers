package lv1_20210329;

import java.util.*;

// 프로그래머스 레벨1 크레인 인형뽑기
public class lv1_CrainDoll 
{
	public static int solution(int[][] board, int[] moves)
    {
        int answer = 0;
        int size = board.length;
        int[] count = new int[size];
        int hand = 0;
        Stack<Integer> s = new Stack<Integer>();
        
        for(int i=0; i<moves.length; i++)
        {
            hand = moves[i]-1;
            
            for(int j=0; j<size; j++)
            {
                if(board[j][hand]!=0)
                {
                    if(s.size()==0)
                    {
                        s.add(board[j][hand]);
                        board[j][hand] = 0;
                        break;
                    }
                    else if(s.get(s.size()-1)==board[j][hand])
                    {
                        answer += 2;
                        board[j][hand] = 0;
                        s.pop();
                        break;
                    }
                    else
                    {                        
                        s.add(board[j][hand]);
                        board[j][hand] = 0;
                        break;
                    }
                }
            }
        }

        return answer;
    }

	public static void main(String[] args) 
	{
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));
	}
}