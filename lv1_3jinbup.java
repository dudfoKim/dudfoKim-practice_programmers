package lv1_20210330;

import java.util.*;

// 프로그래머스 레벨1 3진법 뒤집기
public class lv1_3jinbup 
{
	public static int solution(int n) 
	{
        int answer = 0;
        ArrayList<Integer> three = new ArrayList<Integer>();
        int jari = 3;
        int cnt = 0;
        int temp = 0;
        
        while(n!=0)
        {
        	jari = (int) Math.pow(jari, cnt);
        	three.add((n%3) * jari);
        	n /= 3;
        	cnt++;
        }
        
        jari = 3;
        cnt = 0;
        
        while(cnt!=three.size())
        {
        	jari = (int) Math.pow(3, cnt);
        	temp = three.get(three.size()-cnt-1);
        	answer += (temp * jari);
        	cnt++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		System.out.println(solution(125));
	}
}
