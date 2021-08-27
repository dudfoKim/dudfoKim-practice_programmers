import java.util.HashMap;

class Solution
{
    public int solution(String str1, String str2)
    {
        // 입력값 대소문자 구분 x
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        // 문자열과 문자열의 갯수를 저장할 자료구조
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        // 교집합, 합집합 크기 변수 및 임시 문자열 변수
        int gyo = 0;
        int size1 = 0;
        int size2 = 0;
        String input = "";
            
        // str1에 대한 문자열 갯수 처리
        for(int i=0; i<str1.length()-1; i++)
        {
            // 영어 대문자일 경우에만 로직처리
            if(str1.charAt(i)>='A' && str1.charAt(i)<='Z' && str1.charAt(i+1)>='A' && str1.charAt(i+1)<='Z')
            {
                input = str1.charAt(i) + "" + str1.charAt(i+1);
                
                // 이미 map에 있는 문자열일 경우에는 기존갯수 +1 
                if(map1.containsKey(input))
                {
                    map1.put(input, map1.get(input)+1);
                }
                else
                {
                    map1.put(input, 1);
                }
            }
        }
        
        // str2도 str1과 동일한 방법으로 처리
        for(int i=0; i<str2.length()-1; i++)
        {
            if(str2.charAt(i)>='A' && str2.charAt(i)<='Z' && str2.charAt(i+1)>='A' && str2.charAt(i+1)<='Z')
            {
                input = str2.charAt(i) + "" + str2.charAt(i+1);
                
                if(map2.containsKey(input))
                {
                    map2.put(input, map2.get(input)+1);
                }
                else
                {
                    map2.put(input, 1);
                }
            }
        }
        
        // 2개의 map에 모두 문자열이 존재할 경우, 작은 갯수를 교집합 크기로 +
        for(String data : map1.keySet())
        {
            if(map2.containsKey(data))
            {
                gyo += Math.min(map1.get(data), map2.get(data));
            }
        }
        
        // 예외처리 : 파라미터 2개에 대한 유효 문자열이 없을경우, 자카드 유사도를 1로 처리하고 65536 리턴
        if(map1.size()==0 && map2.size()==0)
        {
            return 65536;
        }
        
        // 합집합 크기를 구하기 위해 map들에 대한 사이즈 구하기
        for(Integer d1 : map1.values())
        {
            size1 += d1;
        }
        
        for(Integer d2 : map2.values())
        {
            size2 += d2;
        }
        
        // 결과를 정수 형태로 리턴
        return (int)((gyo*65536)/(size1+size2-gyo));
    }
}
