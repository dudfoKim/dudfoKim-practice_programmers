https://yoloaeee.tistory.com/116

========================================

import java.util.Arrays;

class Solution
{
    public int solution(int n, int[] lost, int[] reserve)
    {
        // 초기 배열 및 변수설정
        int answer = 0;
        boolean[] student = new boolean[n+1];
        Arrays.fill(student, true);
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++)
        {
            int chk = lost[i];
            student[chk] = false;
            
            // 체육복을 도난당하면서 여벌이 있는 학생에 대한 예외처리(-1로 설정)
            for(int j=0; j<reserve.length; j++)
            {
                if(chk==reserve[j])
                {
                    lost[i] = -1;
                    reserve[j] = -1;
                    student[chk] = true;
                }
            }
        }
        
        // 여벌 체육복이 있는 학생번호가 +1, -1이 차이나는 학생이 체육복이 없을 경우 빌려주기
        for(int i=0; i<reserve.length; i++)
        {
            if(reserve[i]!=-1)
                {
                int now_student = reserve[i];

                if(now_student-1>=0 && !student[now_student-1])
                {
                    student[now_student-1] = true;
                }
                else if(!student[now_student])
                {
                    student[now_student] = true;
                }
                else if(now_student+1<=n && !student[now_student+1])
                {
                    student[now_student+1] = true;
                }
            }
        }
        
        // 인덱스 1부터 결과 출력
        for(int i=1; i<student.length; i++)
        {
            if(student[i])
            {
                answer++;
            }
        }
        
        return answer;
    }
}

 

