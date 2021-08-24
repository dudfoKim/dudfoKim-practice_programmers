import java.util.HashSet;

class Solution
{
    public int solution(String dirs)
    {
        // 각각 이동 전 좌표와 이동 후 좌표 (x, y)
        int nowY = 0;
        int nowX = 0;
        int y = 0;
        int x = 0;
        
        // HashSet 선언 (중복 자동제거)
        HashSet<String> set = new HashSet<String>();
        
        for(int i=0; i<dirs.length(); i++)
        {
            y = nowY;
            x = nowX;

            if(dirs.charAt(i)=='U' && y<=4) // ↑ 방향으로 움직일 때
            {
                nowY++;
            }
            if(dirs.charAt(i)=='D' && y>=-4) // ↓방향으로 움직일 때
            {
                nowY--;
            }
            if(dirs.charAt(i)=='L' && nowX>=-4) // ←방향으로 움직일 때
            {
                nowX--;
            }
            if(dirs.charAt(i)=='R' && nowX<=4) // →방향으로 움직일 때
            {
                nowX++;
            }
            if(x==nowX && y==nowY) // 움직이지 않을 때(예외처리)
            {
                continue;
            }
            
            // 이동 전 좌표와 이동 후 좌표를 모두 엮어서 set에 삽입
            String OldToNew = y + "" + x + "" + nowY + "" + nowX + "";
            String NewToOld = nowY + "" + nowX + "" + y + "" + x + "";

            set.add(OldToNew);
            set.add(NewToOld);
        }
        
        // 좌표 2개를 모두 넣어줬기 때문에 /2 후 결과 리턴
        return set.size()/2;
    }
}
