https://yoloaeee.tistory.com/280

===================================
  
class Solution
{
    public int solution(int[] common)
    {
        if(common[1]-common[0]==common[common.length-1]-common[common.length-2])
        {
            return common[common.length-1] + common[1]-common[0];
        }
        else
        {
            return common[common.length-1] * common[1]/common[0];
        }
    }
}
