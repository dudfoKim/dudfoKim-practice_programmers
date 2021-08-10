
행아웃 미팅
새 회의
회의 참여
행아웃

112개 중 1개
zt
받은편지함

김영래
첨부파일
오후 5:48 (1시간 전)
나에게

no_content
 





 

김영래 / 직원

ICT전략실 / ICT경제팀

E-mail: dudfo3728@suhyup.co.kr

tel. 02-2240-2577

fax. 02-2240-3099

 

서울특별시 송파구 오금로 62, ICT전략실

ICT Strategy Dept

62, Ogeum-ro, Songpa-gu, Seoul, Republic of Korea


...

[메일 내용 잘림]  전체 메일 보기
첨부파일 영역
import java.util.LinkedList;

class Solution
{
    public int solution(int cacheSize, String[] cities)
    {
        LinkedList<String> list = new LinkedList<String>();
        int answer = 0;
        
        for(int i=0; i<cities.length; i++)
        {
            String city = cities[i].toUpperCase();
            

            if(cacheSize==0) // 캐시 크기 0일 때
            {
                return cities.length * 5;
            }
            if(list.contains(city)) // 캐시 히트
            {
                answer += 1;
                list.remove(city);
            }
            else // 캐시 미스
            {
                answer += 5;
                
                if(list.size()>=cacheSize) // 캐시 미스면서 공간여유가 있는 경우
                {
                    list.remove(0);
                }
            }
            
            list.addLast(city);
        }
        
        return answer;
    }
}
