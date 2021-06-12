package lv2_20210612;
public class lv2_20210612 
{
	public static long solution(int w, int h) 
    {
        long answer = 0;
        
        return ((long)w*(long)h)-((long)w+(long)h-gcd(w,h));
    }
    
    public static long gcd(int w, int h)
    {
        int temp = w;
        w = Math.max(w, h);
        h = Math.min(temp, h);
        long result = 0;
        
        while(h!=0)
        {
            temp = w;
            w = h;
            h = temp%h;
        }
        
        result = w;
        
        return result;
    }
    
	public static void main(String[] args) 
	{
		System.out.println(solution(8, 12));
	}
}