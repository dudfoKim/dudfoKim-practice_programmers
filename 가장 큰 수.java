
행아웃 미팅
새 회의
회의 참여
행아웃

대화
KT 사이버고객센터
[답변]요금제 결합할인 질문
 - 안녕하세요, 김영래고객님 고객센터 입니다. 고객님께서 문의하신 이메일에 대한 답변을 드립니다. 상담요청일시 2020-03-27 14:36:00 문의제목 요금제 결합할인 질문 Q. 문의 내용 안녕하세요. 요금제 결합할인 관련 질문드려요. 현재 저 포함 가족 3명이 kt 요금제 이용중이구요. 제 명의로는 모바일 요금제 외에도 tv/인터넷 요금제 함께 사용
 
20. 3. 28.
15GB 중 9.88GB 사용
약관 · 개인정보처리방침 · 프로그램 정책
마지막 계정 활동: 1시간 전
세부정보
import java.util.Arrays;
import java.util.Comparator;

class Solution
{
    public String solution(int[] numbers)
    {
        int n = numbers.length;
        String[] str = new String[n];
        String answer = "";
        
        for(int i=0; i<n; i++)
        {
            str[i] = numbers[i] + "";
        }
        
        Arrays.sort(str, new Comparator<String>()   {
            @Override
            public int compare(String a, String b)
            {
                return (b+a).compareTo(a+b);
            }
        });
        
        if(str[0].equals("0"))
        {
            return "0";
        }
        
        for(int i=0; i<n; i++)
        {
            answer += str[i];
        }
        
        return answer;
    }
}
