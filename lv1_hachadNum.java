package lv1_20210325;

public class lv1_hachadNum
{
	public static boolean solution(int num) 
    {
        int temp = num;
        int sum = 0;
        
        while(temp!=0)
        {
            if(temp<10)
            {
                sum += temp;
                break;
            }
            else
            {
                sum += temp%10;
                temp /= 10;
            }
        }
        
        return (num%sum==0?true:false);
    }
	
	public static void main(String[] args) 
	{
		System.out.println(solution(135));
	}
}