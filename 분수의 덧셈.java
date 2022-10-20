https://yoloaeee.tistory.com/265

==================================================

class Solution
{
    public static int gcd(int a, int b)
    {
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        
        while(y!=0)
        {
            int temp = x;
            x = y;
            y = temp%y;
        }
        
        return x;
    }
    public int[] solution(int denum1, int num1, int denum2, int num2)
    {
        int bunmo = num1*num2;
        int bunja = (denum1*num2)+(denum2*num1);
        int gcd = gcd(bunmo, bunja);
        
        return new int[]{bunja/gcd, bunmo/gcd};
    }
}
