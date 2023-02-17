https://yoloaeee.tistory.com/286

====================================
  
import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static int searchIndex(String s, int max)
    {
        int answer = -1;
        
        for(int i=0; i<=max; i++)
        {
            if(s.charAt(i)=='c')
            {
                answer = Math.max(answer, i);
            }
        }
        
        return answer;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] result = new int[n][m];
        String buf = sc.nextLine();
        
        for(int i=0; i<n; i++)
        {
            String temp = sc.nextLine();
            
            if(!temp.contains("c"))
            {
                Arrays.fill(result[i], -1);
            }
            else
            {
                for(int j=0; j<m; j++)
                {
                    char val = temp.charAt(j);
                    
                    if(val=='c')
                    {
                        result[i][j] = 0;
                    }
                    else
                    {
                        int index = searchIndex(temp, j);
                        
                        if(index==-1)
                        {
                            result[i][j] = -1;
                        }
                        else
                        {
                            result[i][j] = j-index;
                        }
                    }
                }
            }
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            
            System.out.println();
        }      
        
        sc.close();
    }
}
