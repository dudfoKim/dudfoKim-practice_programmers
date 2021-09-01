https://yoloaeee.tistory.com/m/74


class Solution
{
    public int solution(String skill, String[] skill_trees)
    {
        int answer = 0;
        
        for(int i=0; i<skill_trees.length; i++)
        {
            boolean chk = true; // // skill_trees 문자에 대한 개수 카운트
            int[] contain = new int[skill.length()]; // 각 skill별 skill_trees의 포함여부
            int[] index = new int[skill.length()]; // 각 skill별 skill_trees의 index
          
            // 전체 skill 반복
            for(int j=0; j<skill.length(); j++)
            {
                // 각 skill을 기준으로 skill_trees 문자열의 index 및 포함여부 저장
                contain[j] = skill_trees[i].contains(skill.charAt(j)+"")==true?1:0;
                index[j] = skill_trees[i].indexOf(skill.charAt(j));
            }
            
            // contain, index 반복하여 조건을 만족하는 지 체크
            for(int k=1; k<skill.length(); k++)
            {
                // 각 skill에 대한 인덱스 k, k+1를 기준으로 체크
                
                // skill[k], skill[k+1]이 skill_trees에 포함되어 있지만 선후관계가 틀릴 때
                if(contain[k]==1 && contain[k-1]==1 && index[k]<index[k-1])
                {
                    chk = false;
                    break;
                }
                // skill[k]은 포함되어 있지만 skill[k+1]이 포함되어 있지 않을 때
                if(contain[k]==1 && contain[k-1]==0 && index[k]!=-1 && index[k-1]==-1)
                {
                    chk = false;
                    break;
                }
            }
            
            // 결과값 카운트
            if(chk)
            {
                answer++;
            }
        }
        
        return answer;
    }
}
