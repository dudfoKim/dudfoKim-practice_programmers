import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution
{
    public int[] solution(String s)
    {
        s = s.substring(2, s.length()-2); // {{}} 제거
        s = s.replace("},{", "/"); // 원소 단위별 구분자 생성
        s = s.trim(); // 공백 제거

        // 구분자별 원소로 단어 나누기
        String [] words = s.split("/");
        
        // 단어 길이별 정렬
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        // 결과 출력용 리스트 생성
        ArrayList<Integer> list = new ArrayList<>();
        
        // 리스트에 원소넣기
        for(int i=0; i<words.length; i++)
        {
            // 원소별 , 로 숫자 나누기
            String[] compare = words[i].split(",");

            for(int j=0; j<compare.length; j++)
            {
                int num = Integer.parseInt(compare[j]);

                //리스트에 숫자가 없을 경우, 새로 추가
                if(!list.contains(num))
                {
                    list.add(num);
                }
            }
        }

        // 결과 출력
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
